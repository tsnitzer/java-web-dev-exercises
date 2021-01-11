package exercises;

import java.util.Scanner;

public class MilesPerGallon {

    public static void main(String[] args) {
        MilesPerGallon milesPerGallon = new MilesPerGallon();
        milesPerGallon.calculateMilesPerGallon();

    }

    public void calculateMilesPerGallon() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many miles have you driven?");
        Double milesDriven = scanner.nextDouble();

        System.out.println("How many gallons of gas has your car consumed?");
        Double gallonsConsumed = scanner.nextDouble();

        // Miles per gallon = miles/gallons

        Double milesPerGallon = milesDriven / gallonsConsumed;
        System.out.println("Your miles per gallon is: " + milesPerGallon.toString());
    }

}
