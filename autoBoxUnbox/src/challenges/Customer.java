package challenges;

import java.util.ArrayList;

public class Customer {

    private final String name;
    private final ArrayList<Double> transactions = new ArrayList<>();

    public Customer(String name, double initialAmount) {
        this.name = name;
        makeTransaction(initialAmount);
    }

    public void makeTransaction(double amount) {
        if (amount > 0) {
            transactions.add(amount);
        } else {
            System.out.println("Cannot make transaction of 0");
        }
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }
}
