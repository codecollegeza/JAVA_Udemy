package challenges;

public class TeenNumberChecker {

    public static boolean hasTeen(int num1, int num2, int num3) {
        if (num1 >= 13 && num1 <= 19) {
            return true;
        } else if (num2 >= 13 && num2 <= 19) {
            return true;
        } else if (num3 >= 13 && num3 <= 19) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isTeen(int num) {
        if (num >= 13 && num <= 19) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        boolean has = hasTeen(9, 99, 19);
        if (has)
            System.out.println("Has a teen in there");
        else
            System.out.println("no teen");

        has = hasTeen(22, 99, 24);
        if (has)
            System.out.println("Has a teen in there");
        else
            System.out.println("no teen");

        boolean is = isTeen(9);
        if (is)
            System.out.println("is teen");
        else
            System.out.println("is Not a teen");

        is = isTeen(14);
        if (is)
            System.out.println("is teen");
        else
            System.out.println("is Not a teen");
    }
}
