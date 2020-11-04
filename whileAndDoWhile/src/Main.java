public class Main {

    public static boolean isEvenNumber(int num) {
        return num % 2 == 0;
    }

    public static void main(String[] args) {

        // while loops
        int count = 0;
        while (count != 5) {
            System.out.println("Count value is " + count);
            count++;
        }

        // do-while loop
        // executes at least once before checking a condition
        count = 1;
        do {
            System.out.println("Count value was " + count);
            count++;
        } while (count != 6);

        int number = 4;
        int finishNum = 20;

        while (number <= finishNum) {
            number++;
            if (!isEvenNumber(number)) {
                continue;
            }

            System.out.println("Even number " + number);
        }
    }
}
