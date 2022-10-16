
package JavaTraining;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double gpa = 4.0;
        String firstName = "Tara";
        String lastName = "Zver";
        System.out.println(firstName + " " + lastName);

        System.out.println(firstName.charAt(0) + " " + lastName.charAt(0));

        Scanner input = new Scanner(System.in);
        double GPA = input.nextDouble();
        gpa = GPA;
        System.out.println(firstName + " " + lastName + " has a GPA of " + gpa + ".");

    }
}
