package DZ;

public class Main {

    public static void main(String[] args) {

        Circle firstCircle = new Circle(5.5, "red");
        System.out.println("Circle: " + firstCircle.radius + " " + firstCircle.getColor());

        Rectangle firstRectangle = new Rectangle(7.8, 2, "green");
        System.out.println("Rectangle: " + firstRectangle.width + " " + firstRectangle.height + " " + firstRectangle.getColor());

        Triangle firstTriangle = new Triangle(4.4, 8.1, 7.7, "blue");
        System.out.println("Triangle: " + firstTriangle.a + " " + firstTriangle.b + " " + firstTriangle.c + " " + firstTriangle.getColor());


        Shape[] shape = new Shape[8];

        shape[0] = new Rectangle(2.3, 2, "black");
        shape[1] = new Rectangle(2.3, 2, "black");
        shape[2] = new Rectangle(2.3, 2, "black");
        shape[3] = new Rectangle(2.3, 2, "black");
        shape[4] = new Circle(3, "black");
        shape[5] = new Circle(8.4, "black");
        shape[6] = new Circle(5.7, "black");
        shape[7] = new Triangle(2.3, 2, 4.5, "black");
        shape[8] = new Triangle(2.3, 2, 6.8, "black");

        for (int i = 0; i < shape.length; i++) {
            System.out.println(i);
        }
    }
}
