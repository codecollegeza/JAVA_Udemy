package challenges;

public class EqualSumChecker {

    public static boolean hasEqualSum(int num1, int num2, int num3) {
        if ((num1 + num2) == num3) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        boolean equal = hasEqualSum(1, 1, 1);
        if (equal)
            System.out.println("equal");
        else
            System.out.println("not equal");

        equal = hasEqualSum(1, 1, 2);
        if (equal)
            System.out.println("equal");
        else
            System.out.println("not equal");

        equal = hasEqualSum(1, -1, 0);
        if (equal)
            System.out.println("equal");
        else
            System.out.println("not equal");
    }
}
