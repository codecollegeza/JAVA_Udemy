public class BankAccount {

    private String accNum;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNum;

    // Constructor
    public BankAccount(String accNum, double balance, String customerName, String email, String phoneNum) {
        this.accNum = accNum;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNum = phoneNum;
    }

    // can create a constructor where you only initialize some values and then add defaults
    // for others
    public BankAccount(String customerName, String email, String phoneNum) {
        this("12345", 200.25, customerName, email, phoneNum);
    }

    public String getAccNum() {
        return accNum;
    }

    public void setAccNum(String accNum) {
        this.accNum = accNum;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount < balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds");
        }
    }
}
