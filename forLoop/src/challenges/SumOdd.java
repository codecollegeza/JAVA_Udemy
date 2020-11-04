package challenges;

public class SumOdd {

    public static boolean isOdd(int number) {
        if (number > 0) {
            if ((number % 2) != 0) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    public static int sumOdd(int start, int end) {
        int sum = 0;
        if (start < 0 || end < 0) {
            return -1;
        }

        if (start > end) {
            return -1;
        }

        for (int i = start; i <= end; i++) {
            if (isOdd(i)) {
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int range1 = sumOdd(1, 100);
        System.out.println(range1);

        int range2 = sumOdd(-1, 100);
        System.out.println(range2);

        int range3 = sumOdd(13, 13);
        System.out.println(range3);
    }
}
