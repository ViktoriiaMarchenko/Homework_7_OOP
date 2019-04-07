package DZ;

public class Circle extends Shape {

    private double radius;

    public Circle(double radius, String color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", radius = " + radius;
    }

    @Override
    public double calcArea() {
        return Math.round(Math.PI * (radius * radius));



    }
}
