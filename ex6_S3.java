package javaExercise;

import java.util.Scanner;
import java.util.Random;

public class ex6_S3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        StringBuilder mixedCaseString = new StringBuilder();

        for (int i = 0; i < inputString.length(); i++) {
            char currentChar = inputString.charAt(i);

            if (random.nextBoolean()) {
                mixedCaseString.append(Character.toUpperCase(currentChar));
            } else {
                mixedCaseString.append(Character.toLowerCase(currentChar));
            }
        }

        System.out.println("Mixed case string: " + mixedCaseString.toString());

        scanner.close();
    }
}

