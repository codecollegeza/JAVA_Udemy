package challenges;

public class FirstAndLastDigit {
    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        } else if (number < 10) {
            return number + number;
        }

        int lastDigit = number % 10;
        int firstDigit = 0;

        while (number > 0) {
            firstDigit = number;
            number /= 10;
        }

        return lastDigit + firstDigit;
    }

    public static void main(String[] args) {
        int test1 = sumFirstAndLastDigit(123);
        System.out.println(test1);

        int test2 = sumFirstAndLastDigit(252);
        System.out.println(test2);

        int test3 = sumFirstAndLastDigit(0);
        System.out.println(test3);

        int test4 = sumFirstAndLastDigit(-10);
        System.out.println(test4);

        int test5 = sumFirstAndLastDigit(5);
        System.out.println(test5);

        int test6 = sumFirstAndLastDigit(11);
        System.out.println(test6);
    }
}
