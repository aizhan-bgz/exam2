package task3;

public class GeometryCalculator {
    public static void main(String[] args) {
        System.out.println("Circle");
        Circle circle = new Circle(5.5);
        circle.calcArea();
        circle.calcPerimeter();

        System.out.println("\nRectangle");
        Rectangle rectangle = new Rectangle(4.5, 5.0);
        rectangle.calcArea();
        rectangle.calcPerimeter();

        System.out.println("\nTriangle");

        Triangle triangle = new Triangle(2.2, 5.0, 7.2);
        triangle.calcArea();
        triangle.calcPerimeter();

    }
}
