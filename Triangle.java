package DZ;

/*public class Triangle extends Shape {

    double a;
    double b;
    double c;

    Triangle(double a, double b, double c, String color) {
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;
    }

}*/

public class Triangle extends Shape {

    private double a;
    private double b;
    private double c;


    public Triangle(double a, double b, double c, String color) {
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;
    }



    @Override
    public String toString() {
        return super.toString() +
                ", a = " + a
                + ", b = " + b
                + ", c = " + c;
    }

    @Override
    public double calcArea() {

        return Math.round(Math.sqrt(((a+b+c)/2) * (((a+b+c)/2) - a) * (((a+b+c)/2) - b) * (((a+b+c)/2) - c)));

    }
}