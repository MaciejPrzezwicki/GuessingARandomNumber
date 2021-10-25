package pl.MaciejPrzezwicki;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Random random = new Random(); //create a new variable with the class random
        int numberToGuess = random.nextInt(100) + 1; //defining the range from 0 to 100
        Scanner scanner = new Scanner(System.in);
        boolean wasNumberGuessed = false;

        while(!wasNumberGuessed) {
            System.out.println("Enter a number");
            int userNubmber = scanner.nextInt();

            if (userNubmber < numberToGuess) {
                System.out.println("The number is too small");
            } else if (userNubmber > numberToGuess) {
                System.out.println("The number is too large");
            } else {
                System.out.println("Well done, this is the correct number!");
                wasNumberGuessed = true;
            }
        }
    }
}
