public class hieinh {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.eat();
        myDog.sleep();
        myDog.bark();

        System.out.println();
        Cat myCat = new Cat();
        myCat.eat();
        myCat.sleep();
        myCat.meow();
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

class Dog extends Animal {
    void bark() {
        System.out.println("Woof! Woof!");
    }
}
class Cat extends Animal {
    void meow() {
        System.out.println("Meow! Meow!");
    }
}

