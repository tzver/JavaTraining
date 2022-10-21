
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

    public static double totalMealCost(double mealPrice, double tipRate, double taxRate) {
        double tip = tipRate * mealPrice;
        double tax = taxRate * mealPrice;
        double result = mealPrice + tip + tax;
        System.out.println("Your total meal price is " + result);
        return result;
    }

    public static double calculateSalary(int numberOfHoursPerWeek, double hourlyWage, int vacationDays) {
        int nrWeeksInYear = 52;
        double yearlyWageWithoutHoliday = nrWeeksInYear * numberOfHoursPerWeek * hourlyWage;
        double yearlyWageWithHoliday = yearlyWageWithoutHoliday - vacationDays * 8 * hourlyWage;

        return yearlyWageWithHoliday;

    }

    public static void main(String args[]) {
        // announceDeveloperTeaTime();
        // double groupTotalMealCost = totalMealCost(25, 2, 0.08);
        // System.out.println("Every person owes " + groupTotalMealCost / 3 + " euro.");
        double yearlyWage = calculateSalary(40, 20, 23);
        System.out.println("The employee makes " + yearlyWage + " euro per year.");

    }

}
