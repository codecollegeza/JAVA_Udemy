package challenges;

public class PerfectNumber {
    public static boolean isPerfectNumber(int number) {
        if (number < 1) {
            return false;
        }

        int perfectNumber = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                perfectNumber += i;
            }
        }
        return perfectNumber == number;
    }

    public static void main(String[] args) {
        boolean test1 = isPerfectNumber(6);
        System.out.println(test1);

        boolean test2 = isPerfectNumber(28);
        System.out.println(test2);

        boolean test3 = isPerfectNumber(5);
        System.out.println(test3);

        boolean test4 = isPerfectNumber(-1);
        System.out.println(test4);
    }
}
