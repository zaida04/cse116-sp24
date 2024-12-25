package polymorphism;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<>();

        shapes.add(new Rectangle(2, 5));
        shapes.add(new Triangle(2, 5));
        shapes.add(new Square(2));

        for(Shape shape: shapes) {
            System.out.println(shape.area());
        }
    }
}
