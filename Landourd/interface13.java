public class single2{
    public static void main(String[] args) {
        // Create an instance of Car
        Car myCar = new Car();

        // Call methods from the superclass and subclass
        myCar.start();
        myCar.accelerate();
        myCar.brake();
        myCar.stop();
    }
}
class Vehicle {
    void start() {
        System.out.println("Vehicle is starting.");
    }

    void stop() {
        System.out.println("Vehicle is stopping.");
    }
}

// Subclass inheriting from Vehicle
class Car extends Vehicle {
    void accelerate() {
        System.out.println("Car is accelerating.");
    }

    void brake() {
        System.out.println("Car is braking.");
    }
}


