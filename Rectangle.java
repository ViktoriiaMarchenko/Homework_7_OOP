package DZ;

public class Rectangle extends Shape {

    double width;
    double height;

    Rectangle(double width, double height, String color) {
        super(color);
        this.width = width;
        this.height = height;
    }

}