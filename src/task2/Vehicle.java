package task2;

public abstract class Vehicle {
    private String make;
    private Integer year;

    public Vehicle(String make, Integer year) {
        this.make = make;
        this.year = year;
    }

    abstract void start();
    abstract void stop();

    @Override
    public String toString() {
        return "Vehicle {" +
                "make = '" + make + '\'' +
                ", year = " + year +
                '}';
    }
}
