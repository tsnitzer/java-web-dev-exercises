package org.launchcode.java.demos.lsn1datatypes;

import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args) {
        double fahrenheit;
        double celsius;
        Scanner input; //input is a variable that references a Scanner object
        // Scanner is a simple text scanner which can parse primitive types and strings using regular expressions.

        input = new Scanner(System.in); //prompts user to enter a number in command line
        System.out.println("Enter the temperature in Fahrenheit: "); //asks user to enter number
        fahrenheit = input.nextDouble(); //use input to read the value from the command line
        input.close(); //if you open a Scanner object, you must close it after it's intended purpose

        celsius = (fahrenheit - 32) * 5/9;
        System.out.println("The temperature in Celsius is: " + celsius + "°C");
    }
}
