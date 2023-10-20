package javaExercise;

import java.util.Scanner;

public class ex5_S3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String firstString = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String secondString = scanner.nextLine();

        // Reverse the second string
        StringBuilder reversedSecondString = new StringBuilder(secondString);
        reversedSecondString = reversedSecondString.reverse();

        String resultString = reversedSecondString.toString() + " " + firstString;

        System.out.println("Output: " + resultString);

        scanner.close();
    }
}
