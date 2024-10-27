package javaoops.polymorphism;

public class Runner {
    public static void main(String[] args) {
        Animal a = new Animal();
        Cat c = new Cat();
        Dog d = new Dog();

        a.makeSound();
        c.makeSound();
        d.makeSound();
    }
}
