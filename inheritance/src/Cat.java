public class Cat {

    private static String name;

    public Cat(String name) {
        // this is how to access static variable names
        // can't use 'this' keyword
        Cat.name = name;
    }

    public void printName() {
        System.out.println("name = " + name);
    }
}
