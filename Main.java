
package JavaTraining;

import java.util.Scanner;

public class Main {

    public static void announceDeveloperTeaTime() {
        System.out.println("Waiting for developer tea time ...");
        System.out.println("Type in a random word and press Enter to start developer tea time");
        Scanner input = new Scanner(System.in);
        input.next();
        System.out.println("It's developer tea time!");

    }

    public static void totalMealCost(double mealPrice, double tipRate, double taxRate) {
        double tip = tipRate * mealPrice;
        double tax = taxRate * mealPrice;
        double result = mealPrice + tip + tax;
        System.out.println("Your total meal price is " + result);
    }

    public static void main(String args[]) {
        // announceDeveloperTeaTime();
        totalMealCost(25, 2, 0.08);
    }

}
