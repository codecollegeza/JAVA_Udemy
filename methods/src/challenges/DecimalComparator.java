package challenges;

public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {
        int firstNum = (int) (num1 * 1000);
        int secondNum = (int) (num2 * 1000);
        if (firstNum == secondNum) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        boolean equal = areEqualByThreeDecimalPlaces(-3.1756, -3.175);
        if (equal)
            System.out.println("is equal");

        equal = areEqualByThreeDecimalPlaces(3.175, 3.176);
        if (equal)
            System.out.println("is equal");
        else
            System.out.println("not");
    }
}
