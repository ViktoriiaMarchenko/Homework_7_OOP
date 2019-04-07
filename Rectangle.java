package DZ;

/*public class Rectangle extends Shape {

    double width;
    double height;

    Rectangle(double width, double height, String color) {
        super(color);
        this.width = width;
        this.height = height;
    }

}*/


public class Rectangle extends Shape {

    private double width;
    private double height;

    public Rectangle(double width, double height, String color) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
        return super.toString() +


                ", width = " + width
                + ", height = " + height;

    }

    @Override
    public double calcArea() {
        return (width * height);

    }
}