package exercises;

import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args) {
        HelloWorld hello = new HelloWorld();
        hello.askUserForName();
    }

    public void askUserForName() {
        //create Scanner object
        Scanner input = new Scanner(System.in);
        //ask for user input
        System.out.println("Hello, what is your name:");
        //store user input in name variable
        String name = input.nextLine();
        //print out message and input
        System.out.println("Hello " + name);
    }
}
