package challenges;

public class LastDigitChecker {
    public static boolean hasSameLastDigit(int num1, int num2, int num3) {
        if (num1 < 10 || num1 > 1000) {
            return false;
        } else if (num2 < 10 || num2 > 1000) {
            return false;
        } else if (num3 < 10 || num3 > 1000) {
            return false;
        }

        int num1LastDigit = num1 % 10;
        int num2LastDigit = num2 % 10;
        int num3LastDigit = num3 % 10;

        if (num1LastDigit == num2LastDigit || num1LastDigit == num3LastDigit) {
            return true;
        } else if (num2LastDigit == num3LastDigit) {
            return true;
        }
        return false;
    }

    public static boolean isValid(int number) {
        return number >= 10 && number <= 1000;
    }

    public static void main(String[] args) {
        boolean test1 = hasSameLastDigit(41, 22, 71);
        System.out.println(test1);

        boolean test2 = hasSameLastDigit(23, 32, 42);
        System.out.println(test2);

        boolean test3 = hasSameLastDigit(9, 99, 999);
        System.out.println(test3);
    }
}
