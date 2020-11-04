public class Main {

    public static void main(String[] args) {

        // A switch statement is like an if-else statement
        // it tests a certain condition, but unlike if-else
        // can only test one condition at a time

        int switchValue = 5;
        switch (switchValue) {
            case 1:
                System.out.println("Value is 1");
                break;
            case 2:
                System.out.println("Value is 2");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Value was 3, 4 or 5");
                break;
            default:
                System.out.println("Was not 1 or 2 or anything really");
        }
        // can test wether case 3 == case 4 == case 5 here

        // Challenge with a char switch statement
        char ch = 'D';
        switch (ch) {
            case 'A':
                System.out.println("Char is A");
                break;
            case 'B':
                System.out.println("Char is B");
                break;
            case 'C':
                System.out.println("Char is C");
                break;
            case 'D':
                System.out.println("Char is D");
                break;
            case 'E':
                System.out.println("Char is E");
                break;
            default:
                System.out.println("Not a match");
        }
    }
}
