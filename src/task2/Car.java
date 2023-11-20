package task2;

public class Car extends Vehicle{
    public Car(String make, Integer year) {
        super(make, year);
    }

    @Override
    void start() {
        System.out.println("Car started");
    }

    @Override
    void stop() {
        System.out.println("Car stopped");

    }

    @Override
    public String toString() {
        return "Car: " + super.toString();
    }
}
