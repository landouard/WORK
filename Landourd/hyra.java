public class hyra{
    public static void main(String[] args) {
        // Create instances of Dog, Cat, and Horse
        Dog myDog = new Dog();
        Cat myCat = new Cat();
        Horse myHorse = new Horse();

        // Call methods from the superclass and subclasses
        System.out.println("=== Dog ===");
        myDog.eat();
        myDog.sleep();
        myDog.bark();

        System.out.println("\n=== Cat ===");
        myCat.eat();
        myCat.sleep();
        myCat.meow();

        System.out.println("\n=== Horse ===");
        myHorse.eat();
        myHorse.sleep();
        myHorse.neigh();
    }
}

class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }

    void sleep() {
        System.out.println("This animal sleeps.");
    }
}

// First subclass
class Dog extends Animal {
    void bark() {
        System.out.println("Woof! Woof!");
    }
}

// Second subclass
class Cat extends Animal {
    void meow() {
        System.out.println("Meow! Meow!");
    }
}

// Third subclass
class Horse extends Animal {
    void neigh() {
        System.out.println("Neigh! Neigh!");
    }
}

