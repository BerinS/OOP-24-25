package org.example;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = (int) (Math.random() * 101);
        int guess;
        int attempts = 0;

        while (true) {
            System.out.print("Guess the number: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess < number) {
                System.out.println("Higher!  - This is your " + attempts + ". guess!");
            }
            else if (guess > number) {
                System.out.println("Lower!  - This is your " + attempts + ". guess!");
            }
            else {
                System.out.println("You are correct!");
                break;
            }
        }

        System.out.println("You made " + attempts + " guesses!");
    }
}

