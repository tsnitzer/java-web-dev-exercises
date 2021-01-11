package exercises;

import java.util.Locale;
import java.util.Scanner;

public class Alice {

    public static void main(String[] args) {
        Alice myFirstAlice = new Alice();
        String searchTerm = myFirstAlice.getUserSearchTerm();
        Boolean myReturnedResult = myFirstAlice.searchAliceQuote(searchTerm);
        if (myReturnedResult == true) {
            myFirstAlice.getWordsIndex(searchTerm);
            myFirstAlice.removeWordFromQuote(searchTerm);
        }
        System.out.println("The result is: " + myReturnedResult.toString());
    }

    public void removeWordFromQuote(String searchTerm) {
        String theQuote = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";
        String theQuoteLowerCase = theQuote.toLowerCase();
        String searchTermLowercase = searchTerm.toLowerCase();

        //use the sub string method to remove a section from a string
        int startingPoint1 = 0;
        int endingPoint1 = theQuoteLowerCase.indexOf(searchTermLowercase);
        int startingPoint2 = theQuoteLowerCase.indexOf(searchTermLowercase) + searchTermLowercase.length();

        String ourNewQuote = theQuote.substring(startingPoint1, endingPoint1) + theQuote.substring(startingPoint2);
        System.out.println("The new quote is: " + ourNewQuote);
    }

    public void getWordsIndex(String searchTerm) {
        String theQuote = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";
        String theQuoteLowerCase = theQuote.toLowerCase();
        String searchTermLowercase = searchTerm.toLowerCase();

        //get searchTerm index

        int theIndex = theQuoteLowerCase.indexOf(searchTermLowercase);
        System.out.println("The index is: " + theIndex + " and the length is: " + searchTermLowercase.length());
    }

    public String getUserSearchTerm() {
        Scanner scanner = new Scanner(System.in);
        String searchTerm = scanner.nextLine();
        scanner.close();
        return searchTerm;
    }

    public boolean searchAliceQuote(String searchTerm) {
        String theQuote = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";
        String theQuoteLowerCase = theQuote.toLowerCase();
        String searchTermLowercase = searchTerm.toLowerCase();

        Boolean result = theQuoteLowerCase.contains(searchTermLowercase);
        return result;
    }

}

