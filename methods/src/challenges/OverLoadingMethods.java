package challenges;

public class OverLoadingMethods {

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {

        if ((feet < 0) || ((inches < 0) || (inches > 12))) {
            return -1;
        }

        double cm = (feet * 12) * 2.54;
        cm += inches * 2.54;
        System.out.println(feet + " feet, " + inches + " inches = " + cm + " centimeters");
        return cm;
    }

    // overloaded method
    public static double calcFeetAndInchesToCentimeters(double inches) {

        if (inches < 0) {
            return -1;
        }

        double feet = (int) inches / 12;
        double remainingInches = (int) inches % 12;
        System.out.println(inches + " inches is equal to " + feet + " feet, and " + remainingInches + " inches");
        return calcFeetAndInchesToCentimeters(feet, remainingInches);
    }

    public static void main(String[] args) {
        double conversion = calcFeetAndInchesToCentimeters(6, 0);
        System.out.println(conversion);

        double conversion2 = calcFeetAndInchesToCentimeters(100);
        System.out.println(conversion2);
    }
}
