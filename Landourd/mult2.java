public class mult2{
    public static void main(String[] args) {
        // Create an instance of FlyingFish
        FlyingFish myFlyingFish = new FlyingFish();

        // Call methods from both interfaces
        myFlyingFish.takeOff();
        myFlyingFish.fly();
        myFlyingFish.land();
        myFlyingFish.swim();
    }
}

// First interface
interface Flyable {
    void takeOff();
    void fly();
    void land();
}

// Second interface
interface Swimmable {
    void swim();
}

// Class implementing both interfaces
class FlyingFish implements Flyable, Swimmable {
    public void takeOff() {
        System.out.println("Flying fish is taking off.");
    }

    public void fly() {
        System.out.println("Flying fish is flying through the air.");
    }

    public void land() {
        System.out.println("Flying fish is landing back in the water.");
    }

    public void swim() {
        System.out.println("Flying fish is swimming underwater.");
    }
}

