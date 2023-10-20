package javaExercise;

public class ex4_S3 {
    public static void main(String[] args) {
        String name = "nguyen";
        int nameLength = name.length();

        for (int i = 1; i <= nameLength; i++) {
            for (int j = nameLength; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(name.charAt(k - 1) + " ");
            }
            System.out.println();
        }
    }
}

