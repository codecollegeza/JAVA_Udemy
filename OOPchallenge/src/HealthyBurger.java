public class HealthyBurger extends HamBurger {

    private int extraCount = 0;
    private double addOnPrice = 0;

    public HealthyBurger(String meatType) {
        super("Brown rye roll", meatType);
    }

    @Override
    public void addExtra(String addOn, double price) {
        if (extraCount < 6) {
            extraCount++;
            this.addOnPrice += price;
            System.out.println("Added extra " + addOn + " for " + price);
        } else {
            System.out.println("Can only add up to 6 extras.");
        }
    }

    @Override
    public void getPrice() {
        double price = 22.22;
        price += addOnPrice;
        String name = "HealthNut";
        System.out.println(name + " with " + super.getRollType() + ", " + super.getMeatType() + " and " + extraCount + " extras."
                + "\nTotal cost: " + price);
    }
}
