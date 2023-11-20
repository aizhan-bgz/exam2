package task2;

public class TransportManagementSystem {
    public static void main(String[] args) {
        Car car= new Car("Mersedes", 2010);
        car.start();
        car.stop();
        System.out.println(car);

        Bike bike = new Bike("BMW", 2015);
        bike.start();
        bike.stop();
        System.out.println(bike);

        Bus bus= new Bus("LOTOS", 2000);
        bus.start();
        bus.stop();
        System.out.println(bus);
    }
}
