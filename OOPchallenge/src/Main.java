public class Main {

    public static void main(String[] args) {

        // Base hamburger
        HamBurger baseBurger = new HamBurger("plain roll", "chicken");
        baseBurger.getPrice();

        baseBurger.addExtra("Onion", 10.12);
        baseBurger.addExtra("Cheese", 5.26);
        baseBurger.addExtra("Tomato", 6.0);

        baseBurger.getPrice();
        System.out.println();
        // Healthy burger
        HealthyBurger healthNut = new HealthyBurger("cauliflour");
        healthNut.getPrice();
        healthNut.addExtra("Lettuce", 5.30);
        healthNut.addExtra("sauce", 2.0);
        healthNut.addExtra("cheese", 6.12);
        healthNut.addExtra("tomato", 4.35);
        healthNut.addExtra("onions", 4.20);

        healthNut.getPrice();

        // Deluxe
        DeluxeBurger delux = new DeluxeBurger("White roll", "steak");
        delux.getPrice();
        delux.addExtra("Anything", 0.00);
    }
}
