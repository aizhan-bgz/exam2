package task3;

public class Circle extends Shape{
    private Double radius;
    private final Double PI = 3.1415;

    public Circle() {
    }

    public Circle(Double radius) {
        this.radius = radius;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    @Override
    public void calcPerimeter() {
        Double perimeter = 2 * PI * radius;
        System.out.println("Perimeter of Circle = " + perimeter);
    }

    @Override
    public void calcArea() {
        Double area = PI * Math.pow(radius, 2);
        System.out.println("Area of Circle = " + area);

    }
}
