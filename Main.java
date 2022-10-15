
package JavaTraining;

import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        // main(122);
        // main(1.2);
        main("hello java");
    }

    public static void main(int i) {
        double gpa = 4.0;
        String firstName = "Tara";
        String lastName = "Zver";
        System.out.println(firstName + " " + lastName);

        System.out.println(firstName.charAt(0) + " " + lastName.charAt(0));

        Scanner input = new Scanner(System.in);
        double GPA = input.nextDouble();
        gpa = GPA;
        if (gpa < 1.0) {
            System.out.println("You have failed the exam. You should study more and retake it.");
        } else {
            System.out.println("Congratulations! You have passed the exam.");
        }

    }

    public static void main(double i) {
        Scanner input = new Scanner(System.in);
        boolean isOnRepeat = true;
        while (isOnRepeat) {
            System.out.println("Playing song");
            System.out.println("Take off repeat? Respond with y or n.");
            String userInput = input.next();
            if (userInput.equals("y")) {
                isOnRepeat = false;
            }

        }
    }

    public static void main(String j) {
        String question = "How are you?";
        String choiceOne = "bad";
        String choiceTwo = "good";
        String choiceThree = "so so";

        String correct = choiceTwo;

        Scanner input = new Scanner(System.in);
        System.out.println(question);
        String answer = input.next();

        if (correct.equals(answer)) {
            System.out.println("You are correct!");
        } else {
            System.out.println("You are incorrect :(");

        }
    }

}
