package challenges;

public class NumberPalindrome {
    public static boolean isPalindrome(int number) {

        int copy = Math.abs(number);
        int reverse = 0;
        int lastDigit;

        while (copy > 0) {
            lastDigit = copy % 10;
            reverse *= 10;
            reverse += lastDigit;
            copy /= 10;
        }
        return reverse == Math.abs(number);
    }

    public static void main(String[] args) {
        boolean test1 = isPalindrome(707);
        System.out.println(test1);

        boolean test2 = isPalindrome(-1221);
        System.out.println(test2);
    }
}
