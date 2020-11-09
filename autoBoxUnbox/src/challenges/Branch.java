package challenges;

import java.util.ArrayList;

public class Branch {

    private final String name;
    private final ArrayList<Customer> customers = new ArrayList<>();

    public Branch(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    private Customer findCustomer(String name) {
        for (Customer customer : customers) {
            if (customer.getName().equals(name)) {
                return customer;
            }
        }
        return null;
    }

    public boolean newCustomer(String customerName, double initialAMount) {
        if (findCustomer(customerName) == null) {
            customers.add(new Customer(customerName, initialAMount));
            return true;
        }

        return false;
    }

    public boolean addTransaction(String customerName, double amount) {
        Customer existingCustomer = findCustomer(customerName);
        if (existingCustomer != null) {
            existingCustomer.makeTransaction(amount);
            return true;
        }
        return false;
    }
}
