import java.util.ArrayList;
import java.util.List;

// this is the 'outer' class
public class GearBox {
    private final List<Gear> gears;
    private final int maxGears;
    private int currentGear = 0;
    private boolean clutchIn;

    public GearBox(int maxGears) {
        this.maxGears = maxGears;
        gears = new ArrayList<>();
        Gear neutral = new Gear(0, 0.0);
        gears.add(neutral);
    }

    // here are methods that will access the inner class
    // to make some things available outside of class
    public void operateClutch(boolean in) {
        this.clutchIn = in;
    }

    public void addGear(int gearNumber, double ratio) {
        if ((gearNumber > 0) && (gearNumber <= maxGears)) {
            gears.add(new Gear(gearNumber, ratio));
        }
    }

    public void changeGear(int newGear) {
        if ((newGear > 0) && (newGear < gears.size()) && clutchIn) {
            currentGear = newGear;
            System.out.println("Gear " + newGear + " selected");
        } else {
            System.out.println("Grind!");
            currentGear = 0;
        }
    }

    public double getWheelSpeed(int revs) {
        if (clutchIn) {
            System.out.println("Scream!");
            return 0.00;
        } else {
            return (revs * gears.get(currentGear).getRatio());
        }
    }

    // here is the non-static inner class
    // this will have access to all of the outer class variables and methods

    // its best to make an inner class private and to only use outer class to reference it
    // in other classes
    private class Gear {
        private final int gearNumber;
        private final double ratio;

        public Gear(int gearNumber, double ratio) {
            this.gearNumber = gearNumber;
            this.ratio = ratio;
        }

        public double getRatio() {
            return ratio;
        }

        public double driveSpeed(int revs) {
            return (revs * ratio);
        }
    }
}
