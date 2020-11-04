package challenges;

public class SharedDigit {
    public static boolean hasSharedDigit(int num1, int num2) {
        if ((num1 >= 10 && num1 <= 99) && (num2 >= 10 && num2 <= 99)) {

            int num1LastDigit = num1 % 10;
            int num1FirstDigit = 0;
            while (num1 > 0) {
                num1FirstDigit = num1;
                num1 /= 10;
            }

            int num2LastDigit = num2 % 10;
            int num2FirstDigit = 0;
            while (num2 > 0) {
                num2FirstDigit = num2;
                num2 /= 10;
            }

            if (num1FirstDigit == num2FirstDigit || num1FirstDigit == num2LastDigit) {
                return true;
            } else if (num1LastDigit == num2FirstDigit || num1LastDigit == num2LastDigit) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        boolean test1 = hasSharedDigit(12, 23);
        System.out.println(test1);

        boolean test2 = hasSharedDigit(9, 23);
        System.out.println(test2);

        boolean test3 = hasSharedDigit(15, 55);
        System.out.println(test3);
    }
}
