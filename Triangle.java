package DZ;

public class Triangle extends Shape {

    double a;
    double b;
    double c;

    Triangle(double a, double b, double c, String color) {
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;
    }

}