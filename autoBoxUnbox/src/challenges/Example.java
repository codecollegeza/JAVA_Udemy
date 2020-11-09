package challenges;

public class Example {
    public static void main(String[] args) {

        Bank bank = new Bank("FNB");
        bank.addBranch("Pretoria");

        bank.addCustomer("Pretoria", "Grant", 5000.24);
        bank.addCustomer("Pretoria", "Steven", 5648.23);
        bank.addCustomer("Pretoria", "James", 2589.43);

        bank.addBranch("Johannesburg");
        bank.addCustomer("Johannesburg", "Bob", 1546.00);

        bank.addTransaction("Pretoria", "Grant", 44.22);
        bank.addTransaction("Pretoria", "Grant", 447.22);
        bank.addTransaction("Pretoria", "James", 44.22);

        bank.listCustomer("Pretoria", true);
        System.out.println();
        bank.listCustomer("Johannesburg", false);

    }
}
