package challenges;

public class LargestPrime {
    public static int getLargestPrime(int number) {
        if (number < 2) {
            return -1;
        }

        for (int i = number - 1; i >= 2; i--) {
            if (number % i == 0) {
                number = i;
            }
        }
        return number;
    }

    public static void main(String[] args) {
        int test1 = getLargestPrime(21);
        System.out.println(test1);

        int test2 = getLargestPrime(217);
        System.out.println(test2);

        int test3 = getLargestPrime(45);
        System.out.println(test3);
    }
}
