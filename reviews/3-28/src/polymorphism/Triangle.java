package polymorphism;

public class Triangle extends Shape {
    public Triangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return (this.width * this.height) / 2;
    }
}
