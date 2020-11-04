import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // program to start reading user input from the console

        // here is the thing we'll use to read input -> scanner
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter year of birth: ");

        // conditional to check that a number was entered and not a string
        boolean hasNextInt = scanner.hasNextInt(); // returns boolean

        if (hasNextInt) {

            int yearOfBirth = scanner.nextInt(); // next int will automatically convert to int

            // after entering a number you have to add another call to nextline()
            // so that the scanner knows there is still more text to read
            scanner.nextLine();

            System.out.println("Enter your name: ");

            // .nextLine will read the input from the console and save to variable
            String name = scanner.nextLine();
            System.out.println("Your name is " + name);

            int age = 2020 - yearOfBirth;

            // conditions to check that year input is valid
            if (age >= 0 && age <= 100) {
                System.out.println("You are " + age + " years old");
            } else {
                System.out.println("Invalid year of birth entered.");
            }
        } else {
            System.out.println("Unable to parse year of birth.");
        }

        // Have to close the scanner after use.
        scanner.close();
    }
}
