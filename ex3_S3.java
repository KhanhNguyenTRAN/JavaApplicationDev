package javaExercise;

import java.util.Scanner;

public class ex3_S3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the subject: ");
        String subject = scanner.nextLine();

        System.out.print("Enter the grade: ");
        char grade = scanner.next().charAt(0);

        String comment;

        switch (grade) {
            case 'A':
            case 'a':
                comment = "Excellent";
                break;
            case 'B':
            case 'b':
                comment = "Good";
                break;
            default:
                comment = "Try Harder";
        }

        System.out.println("Subject: " + subject);
        System.out.println("Grade: " + grade);
        System.out.println("Comment: " + comment);

        scanner.close();
    }
}
