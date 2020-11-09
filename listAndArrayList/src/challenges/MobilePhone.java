package challenges;

import java.util.Scanner;

public class MobilePhone {

    private static final Scanner scanner = new Scanner(System.in);
    private static final ContactList contacts = new ContactList();

    public static void printInstructions() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the list of contacts.");
        System.out.println("\t 2 - To add a contact to the list.");
        System.out.println("\t 3 - To modify a contact on the list.");
        System.out.println("\t 4 - To remove a contact from the list.");
        System.out.println("\t 5 - To search for a contact on the list.");
        System.out.println("\t 6 - To quit the application.");
    }

    public static void addContact() {
        System.out.println("Enter name: ");
        String name = scanner.nextLine();
        System.out.println("Enter number: ");
        String number = scanner.nextLine();
        contacts.addNameAndNum(name, number);
    }

    public static void modifyContact() {
        System.out.println("Enter contact name you want to change: ");
        String name = scanner.nextLine();
        System.out.println("Enter new name: ");
        String newName = scanner.nextLine();
        System.out.println("Enter new number: ");
        String number = scanner.nextLine();
        contacts.modifyContact(name, newName, number);
    }

    public static void remove() {
        System.out.println("Enter name you would like to remove from contacts: ");
        String name = scanner.nextLine();
        contacts.removeContact(name);
    }

    public static void search() {
        System.out.println("Enter name: ");
        String name = scanner.nextLine();
        boolean found = contacts.inContacts(name);
        if (found) {
            System.out.println("Found " + name);
        } else {
            System.out.println("No such name in the contacts list.");
        }
    }

    public static void main(String[] args) {

        boolean quit = false;
        printInstructions();

        while (!quit) {
            System.out.println("Enter an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    contacts.printContacts();
                    break;
                case 2:
                    addContact();
                    break;
                case 3:
                    modifyContact();
                    break;
                case 4:
                    remove();
                    break;
                case 5:
                    search();
                    break;
                case 6:
                    quit = true;
                    break;
            }
        }
    }
}
