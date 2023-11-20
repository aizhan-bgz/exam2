package task2;

public class Bike extends Vehicle{
    public Bike (String make, Integer year) {
        super(make, year);
    }
    @Override
    void start() {
        System.out.println("Bike started");
    }

    @Override
    void stop() {
        System.out.println("Bike stopped");
    }

    @Override
    public String toString() {
        return "Bike: " + super.toString();
    }
}
