package polymorphism;

public class Square extends Shape {
    public Square(double width) {
        this.width = width;
        this.height = width;
    }

    @Override
    public double area() {
        return this.width * this.width;
    }
}
