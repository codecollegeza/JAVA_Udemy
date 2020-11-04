package challenges;

public class BarkingDog {

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (hourOfDay >= 0 && hourOfDay <= 23) {
            if (barking) {
                if (hourOfDay < 8 || hourOfDay > 22) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        boolean wake = shouldWakeUp(true, 1);
        boolean wake2 = shouldWakeUp(false, 2);
        boolean wake3 = shouldWakeUp(true, 8);

        if (wake) {
            System.out.println("Wake up 1");
        }

        if (wake2) {
            System.out.println("Wake up 2");
        }

        if (wake3) {
            System.out.println("Wake up 3");
        }
    }
}
