public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("fluffy");
        dog.eat();
        dog.breath();

        Parrot bird = new Parrot("polly");
        bird.eat();
        bird.breath();
        bird.fly();

        Penguin penguin = new Penguin("emperor");
        penguin.fly();

        // can use abstract class as ref if they all share the same methods
        Bird anotherPenguin = new Penguin("second");
        anotherPenguin.eat();
        anotherPenguin.breath();
        anotherPenguin.fly();
    }
}
