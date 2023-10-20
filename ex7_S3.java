package javaExercise;

import java.util.Scanner;

public class ex7_S3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        StringBuilder currentPart = new StringBuilder();

        for (int i = 0; i < inputString.length(); i++) {
            char currentChar = inputString.charAt(i);

            // Check if the current character is a punctuation, dot, or comma
            if (currentChar == ';' || currentChar == '.' || currentChar == ',') {
                if (currentPart.length() > 0) {
                    System.out.println(currentPart.toString());
                    currentPart = new StringBuilder(); // Reset the current part
                }
            } else {
                currentPart.append(currentChar);
            }
        }

        // Print the last part if it's not empty
        if (currentPart.length() > 0) {
            System.out.println(currentPart.toString());
        }

        scanner.close();
    }
}
