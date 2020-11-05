public class Main {
    public static void main(String[] args) {

        Animal animal = new Animal("animal", 1, 1, 5, 50);

        Dog dog = new Dog("Yorkie", 8, 20, 2, 4, 1, 20, "silky");

        animal.eat();
        dog.eat();

        dog.walk();
        dog.run();

        // CAT class
        System.out.println("\n");
        Cat jasmine = new Cat("jasmine");
        Cat rex = new Cat("rex");

        // both will print rex, cause there can only be one static variable
        jasmine.printName(); // 'rex'
        rex.printName(); // 'rex'
    }
}
