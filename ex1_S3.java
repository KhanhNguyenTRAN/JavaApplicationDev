package javaExercise;

import java.util.Scanner;

public class ex1_S3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        System.out.println("Even numbers within the range 1 to " + number + ":");
        for (int i = 2; i < number; i += 2) {
            System.out.print(i + " ");
        }

        scanner.close();
    }
}
