package main.java;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessGame {

    public static void main(String[] args) {
        guessNumber();
    }
    private static void guessNumber() {
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I'm thinking of a number between 1 and 100.");

        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;
        System.out.println("You have 5 chances to guess the correct number.");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please select the difficulty level:");
        System.out.println("1. Easy (10 chances)");
        System.out.println("2. Medium (5 chances)");
        System.out.println("3. Hard (3 chances)");

        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();


        switch(choice) {
            case 1:
                System.out.println("Great! You have selected the Easy level.");
                System.out.println("Let's start the game!");
                int attempts = 10;
                for (int i=0; i < attempts; i++) {
                    System.out.print("Enter your guess: ");
                    int inputNumber = scanner.nextInt();

                    if(inputNumber == randomNumber) {
                        System.out.println("Hooray! You guessed the number correct");
                        break;
                    } else if(inputNumber < randomNumber) {
                        System.out.println("Incorrect! The number is greater than " + inputNumber);
                    } else {
                        System.out.println("Incorrect! The number is less than " + inputNumber);
                    }
                }
                break;
            case 2:
                System.out.println("Great! You have selected the Medium level.");
                System.out.println("Let's start the game!");
                int attempts1 = 5;
                for (int i=0; i < attempts1; i++) {
                    System.out.print("Enter your guess: ");
                    int inputNumber = scanner.nextInt();

                    if(inputNumber == randomNumber) {
                        System.out.println("Hooray! You guessed the number correct");
                        break;
                    } else if(inputNumber < randomNumber) {
                        System.out.println("Incorrect! The number is greater than " + inputNumber);
                    } else {
                        System.out.println("Incorrect! The number is less than " + inputNumber);
                    }
                }
                break;
            case 3:
                System.out.println("Great! You have selected the Hard level.");
                System.out.println("Let's start the game!");
                int attempts2 = 3;
                for (int i=0; i < attempts2; i++) {
                    System.out.print("Enter your guess: ");
                    int inputNumber = scanner.nextInt();

                    if(inputNumber == randomNumber) {
                        System.out.println("Hooray! You guessed the number correct");
                        break;
                    } else if(inputNumber < randomNumber) {
                        System.out.println("Incorrect! The number is greater than " + inputNumber);
                    } else {
                        System.out.println("Incorrect! The number is less than " + inputNumber);
                    }
                }
                break;
            default:
                System.out.println("Invalid Selection. Please choose 1,2 or 3");
                break;
        }
        }
    }
