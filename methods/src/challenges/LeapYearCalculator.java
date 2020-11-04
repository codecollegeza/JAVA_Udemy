package challenges;

public class LeapYearCalculator {

    public static boolean isLeapYear(int year) {
        if (year >= 1 && year <= 9999) {
            if ((year % 4) == 0) {
                if ((year % 100) == 0) {
                    if ((year % 400) == 0) {
                        return true;
                    } else {
                        return false;
                    }
                } else {
                    return true;
                }
            } else {
                return false;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        boolean leapYear = isLeapYear(2000);
        if (leapYear) {
            System.out.println("Is a leap year");
        }

        leapYear = isLeapYear(2500);
        if (leapYear) {
            System.out.println("2500 is a leap year");
        } else {
            System.out.println("Not a leap year.");
        }
    }
}
