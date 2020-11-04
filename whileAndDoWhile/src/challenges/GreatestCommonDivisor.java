package challenges;

public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) {
            return -1;
        }

        int commonDivisor = 0;
        if (first < second) {
            for (int i = 2; i <= first; i++) {
                if ((first % i) == 0 && (second % i) == 0) {
                    commonDivisor = i;
                }
            }
        } else {
            for (int i = 2; i <= second; i++) {
                if ((first % i) == 0 && (second % i) == 0) {
                    commonDivisor = i;
                }
            }
        }
        return commonDivisor;
    }

    public static void main(String[] args) {
        int test1 = getGreatestCommonDivisor(25, 15);
        System.out.println(test1);

        int test2 = getGreatestCommonDivisor(12, 30);
        System.out.println(test2);

        int test3 = getGreatestCommonDivisor(9, 18);
        System.out.println(test3);

        int test4 = getGreatestCommonDivisor(81, 153);
        System.out.println(test4);
    }
}
