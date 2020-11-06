class Car {
    private int doors;
    private int wheels = 4;
    private boolean engine = true;
    private int cylinders;
    private String name;

    public Car(int doors, int cylinders, String name) {
        this.doors = doors;
        this.cylinders = cylinders;
        this.name = name;
    }

    public int getDoors() {
        return doors;
    }

    public int getWheels() {
        return wheels;
    }

    public boolean isEngine() {
        return engine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public void startEngine() {
        System.out.println("Staring engine");
    }
}

class Polo extends Car {
    public Polo() {
        super(5, 3, "Polo");
    }

    @Override
    public void startEngine() {
        System.out.println("Starting Polo engine.");
    }
}

class Volvo extends Car {
    public Volvo() {
        super(3, 4, "Volvo");
    }

    @Override
    public void startEngine() {
        System.out.println("Starting volvo engine.");
    }
}

class Audi extends Car {
    public Audi() {
        super(3, 4, "Audi");
    }

    @Override
    public void startEngine() {
        System.out.println("Starting audi's engine.");
    }
}

public class Main {
    public static void main(String[] args) {
        Car car = new Car(4, 2, "Car");
        Polo polo = new Polo();
        Volvo volvo = new Volvo();
        Audi audi = new Audi();

        car.startEngine();
        polo.startEngine();
        volvo.startEngine();
        audi.startEngine();

    }
}
