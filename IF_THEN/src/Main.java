public class Main {
    public static void main(String[] args) {

        // booleans and if -then statement
        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It is not an alien!");
        }

        int topScore = 80;
        if (topScore < 100) {
            System.out.println("You got the highscore!");
        }

        int secondTopScore = 60;
        if (topScore > secondTopScore && topScore < 100) {
            System.out.println("Great");
        }

        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either or both are true");
        }

        boolean isCar = false;
        if (!isCar) {
            System.out.println("Somethingsomethingsomething");
        }

        isCar = true;
        boolean wasCar = isCar ? true : false;
        if (wasCar) {
            System.out.println("Something else");
        }
    }
}
