package DZ;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

       /* Circle firstCircle = new Circle(5.5, "red");
        System.out.println("Circle: " + firstCircle.radius + " " + firstCircle.getColor());

        Rectangle firstRectangle = new Rectangle(7.8, 2, "green");
        System.out.println("Rectangle: " + firstRectangle.width + " " + firstRectangle.height + " " + firstRectangle.getColor());

        Triangle firstTriangle = new Triangle(4.4, 8.1, 7.7, "blue");
        System.out.println("Triangle: " + firstTriangle.a + " " + firstTriangle.b + " " + firstTriangle.c + " " + firstTriangle.getColor());
*/

        Shape[] shapes = new Shape[]{

                new Rectangle(2.3, 2, "black"),
                new Rectangle(2.3, 2, "red"),
                new Rectangle(2.3, 2, "blue"),
                new Rectangle(2.3, 2, "brown"),
                new Circle(3, "pink"),
                new Circle(8.4, "grey"),
                new Circle(5.7, "magenta"),
                new Triangle(8, 12, 6.8, "green"),
                new Triangle(14, 15, 7, "purple"),
        };

        printShapes(shapes);
        System.out.println(("-----------------"));

        Arrays.sort(shapes,
                new CompareShapeByArea());
        //new CompareShapeByColorName();
        printShapes(shapes);






        System.out.println(("-----------------"));

        Arrays.sort(shapes,
                new CompareShapeByColorName());
        printShapes(shapes);
    }

    public static void printShapes(Shape[] shapes) {
        for (Shape elem : shapes) {
            elem.draw();
        }
    }
}


