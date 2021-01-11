package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    // create the main method/the starting point
    public static void main(String[] args) {
        //place what we want to run within here
        Area areaOfCircle = new Area();
        areaOfCircle.calculateAreaOfCircle();
    }

    public void calculateAreaOfCircle() {
        Scanner input = new Scanner(System.in);

        System.out.println("What is the radius of the circle?");
        try {
            boolean keepLooping = true;
            while (keepLooping) {
                Double radius = input.nextDouble();

                //Check if user entered negative number
                if (radius < 0) {
                    //print error out to user
                    System.out.println("You cannot enter a negative number.");
                    //Re-prompt the user
                } else {
                    //Calculate area = pi * r * r
                    Double area = Circle.getArea(radius);
                    //Print the result
                    System.out.println("The area of your circle is: " + area.toString());
                    //Tell the while loop to exit
                    keepLooping = false;
                }
            }
        } catch(Exception error) {
            System.out.println("You must provide a numeric input.");
        }

        //Close the scanner
        input.close();
    }
}
