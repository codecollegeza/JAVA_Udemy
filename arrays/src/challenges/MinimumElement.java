package challenges;

import java.util.Scanner;

public class MinimumElement {

    private static final Scanner scanner = new Scanner(System.in);

    public static int[] readIntegers(int number) {
        int[] values = new int[number];
        System.out.println("Enter a number\r");
        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }
        scanner.close();
        return values;
    }

    public static int findMin(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int j : array) {
            if (j < min) {
                min = j;
            }
        }
        return min;
    }

    public static void main(String[] args) {

        int[] myArray = readIntegers(5);

        int minValue = findMin(myArray);
        System.out.println("The minimum value in the array was: " + minValue);
    }
}
