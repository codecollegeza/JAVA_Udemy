package challenges;

public class SecondsAndMinutes {

    public static String getDurationString(int minutes, int seconds) {

        if ((minutes >= 0) && ((seconds >= 0) && (seconds <= 59))) {
            int hours = minutes / 60;
            int remainingMinutes = minutes % 60;
            return (hours + "h " + remainingMinutes + "m " + seconds + "s");
        }
        return "Invalid value";
    }

    public static String getDurationString(int seconds) {
        if (seconds < 0) {
            return "Invalid value";
        }
        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;
        return getDurationString(minutes, remainingSeconds);
    }

    public static void main(String[] args) {
        String duration = getDurationString(67, 21);
        System.out.println(duration);

        // can put method return and print in one line
        System.out.println(getDurationString(3945));
    }
}
