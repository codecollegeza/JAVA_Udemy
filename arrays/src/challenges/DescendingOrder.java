package challenges;

import java.util.Scanner;

public class DescendingOrder {

    private static final Scanner scanner = new Scanner(System.in);

    public static int[] getIntegers(int number) {
        int[] values = new int[number];
        System.out.println("Enter " + number + " integer values.\r");

        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }

        scanner.close();
        return values;
    }

    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    public static int[] sortIntegers(int[] array) {
        int[] sortedValues = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            sortedValues[i] = array[i];
        }

        int temp;
        for (int i = 1; i < sortedValues.length; i++) {
            for (int j = sortedValues.length - 1; j >= i; j--) {
                if (sortedValues[j - 1] < sortedValues[j]) {
                    temp = sortedValues[j - 1];
                    sortedValues[j - 1] = sortedValues[j];
                    sortedValues[j] = temp;
                }
            }
        }
        return sortedValues;
    }

    public static void main(String[] args) {

        int[] myArray = getIntegers(5);
        printArray(myArray);

        System.out.println("\nSorted array:\n");
        int[] sorted = sortIntegers(myArray);
        printArray(sorted);
    }
}

// Another way to copy one array over to another one using a Class
// int[] newArray = Array.copyOf(array, lenght);