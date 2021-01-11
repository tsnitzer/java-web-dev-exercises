package org.launchcode.java.demos.lsn2controlflowandcollections;

import java.util.ArrayList;
//ArrayList is a Java provided class
import java.util.Scanner;

public class ArrayListGradebook {

    public static void main(String[] args) {
        // declare and initialize the two objects

        ArrayList<String> students = new ArrayList<>();
        ArrayList<Double> grades = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        String newStudent;

        System.out.println("Enter your students (or ENTER to finish):");

        // Get student names
        do {
            newStudent = input.nextLine();

            if (!newStudent.equals("")) {
                students.add(newStudent);
            }

        } while(!newStudent.equals(""));

        // Get student grades with for-each loop
        for (String student : students) {
            System.out.print("Grade for " + student + ": ");
            Double grade = input.nextDouble();
            grades.add(grade);
        }

        // Print class roster with for loop
        System.out.println("\nClass roster:");
        double sum = 0.0;

        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i) + " (" + grades.get(i) + ")");
            sum += grades.get(i);
        }

        double avg = sum / students.size();
        System.out.println("Average grade: " + avg);
    }
}
