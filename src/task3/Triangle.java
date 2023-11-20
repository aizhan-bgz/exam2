package task3;

public class Triangle extends Shape{
    private Double a;
    private Double b;
    private Double c;

    public Triangle() {
    }

    public Triangle(Double a, Double b, Double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Double getA() {
        return a;
    }

    public void setA(Double a) {
        this.a = a;
    }

    public Double getB() {
        return b;
    }

    public void setB(Double b) {
        this.b = b;
    }

    public Double getC() {
        return c;
    }

    public void setC(Double c) {
        this.c = c;
    }

    @Override
    void calcPerimeter() {
        Double perimeter = a + b + c;
        System.out.println("Perimeter of Triangle = " + perimeter);

    }

    @Override
    void calcArea() {
        Double area = (a * b) / 2;
        System.out.println("Area of Triangle = " + area);

    }
}
