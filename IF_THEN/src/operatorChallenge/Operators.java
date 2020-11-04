package operatorChallenge;

public class Operators {

    public static void main(String[] args) {

        double val1 = 20.00;
        double val2 = 80.00;
        double result = (val1 + val2) * 100.00;

        boolean isZero = (result % 40.00) == 0 ? true : false;

        System.out.println(isZero);

        if (!isZero) {
            System.out.println("Got some remainder.");
        }
    }
}
