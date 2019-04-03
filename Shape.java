package DZ;

public abstract class Shape {

    private String color;

    Shape(String color) {
        this.color = color;
    }

    Shape() {
    }

    public String getColor() {
        return color;
    }


    double area;

    public double getArea() {
        return 0;
    }
}


