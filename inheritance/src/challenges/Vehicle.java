package challenges;

public class Vehicle {

    private final String name;
    private final String size;
    private int currVelocity;
    private int currDirection;

    public Vehicle(String name, String size) {
        this.name = name;
        this.size = size;
        this.currVelocity = 0;
        this.currDirection = 0;
    }

    public void steer(int direction) {
        currDirection += direction;
        System.out.println("Steering at " + currDirection + " degrees.");
    }

    public void move(int velocity, int direction) {
        currVelocity = velocity;
        currDirection = direction;
        System.out.println("Moving at " + currVelocity + " in direction " + currDirection);
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public int getCurrVelocity() {
        return currVelocity;
    }

    public int getCurrDirection() {
        return currDirection;
    }

    public void stop() {
        currVelocity = 0;
    }
}

class Car extends Vehicle {

    private final int wheels;
    private final int doors;
    private final int gears;
    private final boolean isManual;
    private int currGear;

    public Car(String name, String size, int wheels, int doors, int gears, boolean isManual) {
        super(name, size);
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;
        this.currGear = 1;
    }

    public void changeGear(int currGear) {
        this.currGear = currGear;
        System.out.println("Current gear changed to " + currGear);
    }

    public void changeVelocity(int speed, int direction) {
        move(speed, direction);
        System.out.println("Velocity " + speed + " direction " + direction);
    }
}

class Outlander extends Car {

    private final int roadServiceMonths;

    public Outlander(int roadServiceMonths) {
        super("Outlander", "4WD", 5, 5, 6, false);
        this.roadServiceMonths = roadServiceMonths;
    }

    public void accelerate(int rate) {
        int newVelocity = getCurrVelocity() + rate;
        if (newVelocity == 0) {
            stop();
        } else if (newVelocity > 0 && newVelocity <= 10) {
            changeGear(1);
        } else if (newVelocity > 10 && newVelocity <= 20) {
            changeGear(2);
        } else {
            changeGear(4);
        }

        if (newVelocity > 0) {
            changeVelocity(newVelocity, getCurrDirection());
        }
    }
}