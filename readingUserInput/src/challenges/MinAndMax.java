package challenges;

import java.util.Scanner;

public class MinAndMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int minNumber = Integer.MAX_VALUE;
        int maxNumber = Integer.MIN_VALUE;

        while (true) {
            System.out.println("Enter a number: ");
            boolean hasNextint = scanner.hasNextInt();

            if (hasNextint) {
                int number = scanner.nextInt();

                if (number > maxNumber) {
                    maxNumber = number;
                } else if (number < minNumber) {
                    minNumber = number;
                }
            } else {
                System.out.println("Invalid number, exiting loop");
                break;
            }
            scanner.nextLine();
        }

        System.out.println("Min number = " + minNumber + ", Max number = " + maxNumber);
        scanner.close();
    }
}
