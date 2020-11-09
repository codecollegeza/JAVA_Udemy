package challenges;

public class ReverseArray {

    public static void reverse(int[] array) {

        int maxIndex = array.length - 1;
        int halfway = array.length / 2;
        int temp;
        for (int i = 0; i < halfway; i++) {
            temp = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex - i] = temp;
        }
    }

    public static void main(String[] args) {
        // original array
        int[] myArray = {1, 2, 3, 4, 5, 6};
        System.out.println("Original array:");
        for (int i : myArray) {
            System.out.print(i + " ");
        }

        System.out.println();

        reverse(myArray);
        System.out.println("Reversed array: ");
        for (int i : myArray) {
            System.out.print(i + " ");
        }
    }
}
