public class DeluxeBurger extends HamBurger {

    public DeluxeBurger(String rollType, String meatType) {
        super(rollType, meatType);
    }

    @Override
    public void addExtra(String addOn, double price) {
        System.out.println("This burger ony comes with fries and a drink. Cannot add any more extras.");
    }

    @Override
    public void getPrice() {
        double price = 45.60;
        String name = "Deluxe";
        System.out.println(name + " with " + super.getRollType() + ", " + super.getMeatType() + ", fries and a drink. "
                + "\nTotal cost: " + price);
    }
}
