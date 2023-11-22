
public class multinh{
    public static void main(String[] args) {
        
        FlyingDog myFlyingDog = new FlyingDog();
        myFlyingDog.eat();
        myFlyingDog.sleep();
        myFlyingDog.bark();
        myFlyingDog.swim();
        myFlyingDog.fly();
    }
}
interface Swimmable {
    void swim();
}
interface Flying {
    void fly();
}
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }

    void sleep() {
        System.out.println("This animal sleeps.");
    }
}
class FlyingDog extends Animal implements Swimmable, Flying {
    void bark() {
        System.out.println("Woof! Woof!");
    }
    public void swim() {
        System.out.println("This dog can swim.");
    }
    public void fly() {
        System.out.println("This dog can fly.");
    }
}
