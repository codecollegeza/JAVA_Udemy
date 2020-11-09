import java.util.Scanner;

public class Main {

    // Use scanner to get user input and pass into array
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        // one way to create an array
        int[] myIntArray = new int[10];
        myIntArray[0] = 45;
        myIntArray[5] = 4;
        myIntArray[9] = 5897;

        System.out.println(myIntArray[5]);

        // another way to create an array
        double[] myOtherArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 725};
        System.out.println(myOtherArray[4] + " and " + myOtherArray[9]);

        // can use forLoop to init array
        int[] another = new int[10];
        for (int i = 0; i < 10; i++) {
            another[i] = i * 7;
        }

//        for (int i = 0; i < another.length; i++) {
//            System.out.println(another[i]);
//        }

        printArray(another); // method

        // using scanner to get input
        int[] inputFromScanner = getIntegers(5);
        // enchanced / forEach loop
        for (int i : inputFromScanner) {
            System.out.println(i);
        }

    }

    // can pass arrays into methods
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    // method tied to scanner + array
    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integer values.\r");
        int[] values = new int[number];

        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }

        scanner.close();
        return values;
    }
}
