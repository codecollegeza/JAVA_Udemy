package challenges;

import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);

        double counter = 0;
        int sum = 0;
        double avg = 0;

        while (true) {
            boolean hasNext = scanner.hasNextInt();
            if (hasNext) {
                int number = scanner.nextInt();
                sum += number;
                counter++;
                avg = (sum / counter);
            } else {
                break;
            }
            scanner.nextLine();
        }

        System.out.println("SUM = " + sum + " AVG = " + Math.round(avg));
        scanner.close();
    }

    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }
}
