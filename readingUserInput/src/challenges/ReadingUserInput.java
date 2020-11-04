package challenges;

import java.util.Scanner;

public class ReadingUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int counter = 0;

        while (counter < 10) {
            counter++;
            System.out.println("Enter number #" + counter + ": ");
            boolean hasNextInt = scanner.hasNextInt();
            if (hasNextInt) {
                int number = scanner.nextInt();
                sum += number;
            } else {
                System.out.println("Invalid value");
            }
            scanner.nextLine();
        }

        System.out.println("The sum of all your numbers = " + sum);

        scanner.close();
    }
}
