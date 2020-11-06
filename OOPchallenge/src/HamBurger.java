public class HamBurger {

    private final String rollType;
    private final String meatType;

    private double addOnPrice = 0;

    public HamBurger(String rollType, String meatType) {
        this.rollType = rollType;
        this.meatType = meatType;
    }

    public String getRollType() {
        return rollType;
    }

    public String getMeatType() {
        return meatType;
    }

    private int extraCount = 0;

    public void addExtra(String addOn, double price) {
        if (extraCount <= 4) {
            extraCount++;
            this.addOnPrice += price;
            System.out.println("Added extra " + addOn + " for " + price);
        } else {
            System.out.println("Max number of extras reached");
        }
    }

    public void getPrice() {
        double price = 15.20;
        price += addOnPrice;
        String name = "Base burger";
        System.out.println(name + " with " + rollType + ", " + meatType + " and " + extraCount + " extras."
                + "\nTotal cost: " + price);
    }
}