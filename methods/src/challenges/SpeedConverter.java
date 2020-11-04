package challenges;

public class SpeedConverter {
    // 1 mile per hour = 1.609 km/ph
    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour >= 0) {
            return Math.round(kilometersPerHour / 1.609);
        }
        return -1;
    }

    public static void printConversion(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            System.out.println("Invalid value");
        } else {
            long conversion = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + " km/h = " + conversion + " mi/h");
        }
    }

    public static void main(String[] args) {
        printConversion(5.0);
        printConversion(-1);
        printConversion(1.5);
        printConversion(10.25);
    }
}
