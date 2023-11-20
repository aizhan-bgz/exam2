package task3;

public class Rectangle extends Shape{
    private Double lenght;
    private Double width;

    public Rectangle() {
    }

    public Rectangle(Double lenght, Double width) {
        this.lenght = lenght;
        this.width = width;
    }

    public Double getLenght() {
        return lenght;
    }

    public void setLenght(Double lenght) {
        this.lenght = lenght;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    @Override
    public void calcPerimeter() {
        Double perimeter = 2 * (lenght + width);
        System.out.println("Perimeter of Rectangle = " + perimeter);
    }

    @Override
    public void calcArea() {
        Double area = lenght * width;
        System.out.println("Area of Rectangle = " + area);

    }
}
