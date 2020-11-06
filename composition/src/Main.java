public class Main {
    public static void main(String[] args) {

        // Composition is similar to class inheritance
        // but instead of classes extending each other, you create the classes
        // that you need , and create instances of them in other classes
        // follow the 'has a' rule -> a pc has a screen -> has a motherboard etc

        Wall wall1 = new Wall("West");
        Wall wall2 = new Wall("East");
        Wall wall3 = new Wall("South");
        Wall wall4 = new Wall("North");

        Ceiling ceiling = new Ceiling(12, 55);

        Bed bed = new Bed("Modern", 4, 2);

        Bedroom bedroom = new Bedroom("Kel room", wall1, wall2, wall3, wall4, ceiling, bed);

        bedroom.makeBed();
    }
}
