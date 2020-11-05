public class Main {
    public static void main(String[] args) {
        Car porsche = new Car();
        Car holden = new Car();

        porsche.setModel("Carrera");
        System.out.println("Model of porsche is " + porsche.getModel());

        holden.setModel("Commodore");
        System.out.println("Model of holden is " + holden.getModel());

        // BANK ACCOUNT CLASS TEST
        BankAccount account = new BankAccount("12345", 200.25, "Jake",
                "@mail.com", "123456");
//        account.setAccNum("123456");
//        account.setCustomerName("Jake");
//        account.setEmail("some@mail.com");
//        account.setPhoneNum("02145-658");
//        account.setBalance(200.25);

        System.out.println("Name: " + account.getCustomerName() + "\n"
                + "Account Number: " + account.getAccNum() + "\n" + "Phone number: " + account.getPhoneNum()
                + "\n" + "Email: " + account.getEmail() + "\n" + "Balance: " + account.getBalance());

        account.deposit(950.35);

        System.out.println("Name: " + account.getCustomerName() + "\n"
                + "Account Number: " + account.getAccNum() + "\n" + "Phone number: " + account.getPhoneNum()
                + "\n" + "Email: " + account.getEmail() + "\n" + "Balance: " + account.getBalance());

        account.withdraw(500);

        System.out.println("Name: " + account.getCustomerName() + "\n"
                + "Account Number: " + account.getAccNum() + "\n" + "Phone number: " + account.getPhoneNum()
                + "\n" + "Email: " + account.getEmail() + "\n" + "Balance: " + account.getBalance());

        // VIP Client
        System.out.println();
        VipCustomer client = new VipCustomer();
        VipCustomer client2 = new VipCustomer("Bob", 50000.0);
        VipCustomer client3 = new VipCustomer("Jeff", 12000, "jeff@mail.com");

        System.out.println(client.getName() + " " + client.getCreditLimit() + " " + client.getEmail());
        System.out.println(client2.getName() + " " + client2.getCreditLimit() + " " + client2.getEmail());
        System.out.println(client3.getName() + " " + client3.getCreditLimit() + " " + client3.getEmail());
    }
}
