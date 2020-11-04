package challenges;

public class NumberOfDaysInMonth {

    public static boolean isLeapYear(int year) {
        if (year >= 1 && year <= 9999) {
            if ((year % 4) == 0) {
                if ((year % 100) == 0) {
                    return (year % 400) == 0;
                } else {
                    return true;
                }
            } else {
                return false;
            }
        }
        return false;
    }

    public static int getDaysInMonth(int month, int year) {
        if (month < 1 || month > 12) {
            return -1;
        }
        if (year < 1 || year > 9999) {
            return -1;
        }

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 2:
                if (isLeapYear(year)) {
                    return 29;
                } else {
                    return 28;
                }
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            default:
                return -1;
        }
    }

    public static void main(String[] args) {
        boolean isLeap = isLeapYear(-1600);
        System.out.println(isLeap);

        isLeap = isLeapYear(1600);
        System.out.println(isLeap);

        isLeap = isLeapYear(2017);
        System.out.println(isLeap);

        isLeap = isLeapYear(2000);
        System.out.println(isLeap);

        int daysInFebLeapYear = getDaysInMonth(2, 2020);
        System.out.println(daysInFebLeapYear);

        int daysInApril = getDaysInMonth(4, 2014);
        System.out.println(daysInApril);
    }
}
