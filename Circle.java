package DZ;

public class Circle extends Shape {

    double radius;

    Circle(double radius, String color) {
        super(color);
        this.radius = radius;
    }


    double area;

    public double getArea(double radius) {
        double area = Math.PI * (radius * radius);
        return area;
    }
}
