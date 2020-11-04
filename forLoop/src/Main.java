public class Main {
    public static void main(String[] args) {
        System.out.println("10 000 at interest of 2% = " + calculateInterest(10000.0, 2.0));

        // can automate the above to run a certain amount of times with a for loop
        for (int i = 2; i <= 8; i++) {
            // can print num with only two decimal places like this :
            System.out.println("10000 at " + i + "% = " + String.format("%.2f", calculateInterest(10000, i)));
        }

        // above loop in reverse
        for (int i = 8; i >= 2; i--) {
            // can print num with only two decimal places like this :
            System.out.println("10000 at " + i + "% = " + String.format("%.2f", calculateInterest(10000, i)));
        }

        int primeNumbersFound = 0;
        for (int i = 4; i <= 60; i++) {
            if (isPrime(i)) {
                System.out.println(i);
                primeNumbersFound++;
            }

            if (primeNumbersFound == 3) {
                break;
            }
        }
    }

    static double calculateInterest(double amount, double interest) {
        return (amount * (interest / 100));
    }

    static boolean isPrime(int n) {

        if (n == 1) {
            return false;
        }

        for (int i = 2; i <= (n / 2); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
