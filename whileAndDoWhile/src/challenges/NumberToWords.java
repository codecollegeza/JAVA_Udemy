package challenges;

public class NumberToWords {
    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        }
        int reversedNumber = reverse(number);
        int numCount = getDigitCount(number);
        int revNumCount = getDigitCount(reversedNumber);

        if (reversedNumber == 0) {
            System.out.print("Zero ");
        }
        while (reversedNumber > 0) {
            int lastDigit = reversedNumber % 10;
            switch (lastDigit) {
                case 0:
                    System.out.print("Zero ");
                    break;
                case 1:
                    System.out.print("One ");
                    break;
                case 2:
                    System.out.print("Two ");
                    break;
                case 3:
                    System.out.print("Three ");
                    break;
                case 4:
                    System.out.print("Four ");
                    break;
                case 5:
                    System.out.print("Five ");
                    break;
                case 6:
                    System.out.print("Six ");
                    break;
                case 7:
                    System.out.print("Seven ");
                    break;
                case 8:
                    System.out.print("Eight ");
                    break;
                case 9:
                    System.out.print("Nine ");
                    break;
            }
            reversedNumber /= 10;
        }
        int zeros = numCount - revNumCount;
        while (zeros != 0) {
            System.out.print("Zero ");
            zeros--;
        }
        System.out.println();
    }

    public static int reverse(int num) {
        int reversed = 0;
        int digit;

        while (Math.abs(num) > 0) {
            digit = num % 10;
            reversed *= 10;
            reversed += digit;
            num /= 10;
        }
        return reversed;
    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }

        int count = 0;
        if (number < 10) {
            return 1;
        }
        while (number > 0) {
            count++;
            number /= 10;
        }
        return count;
    }

    public static void main(String[] args) {
        numberToWords(123);
        numberToWords(6);
        numberToWords(1010);

        numberToWords(100);

        int reversedNum = reverse(-123);
        System.out.println(reversedNum);

        int digCount = getDigitCount(5200);
        System.out.println("Digit count " + digCount);
    }
}
