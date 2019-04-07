package DZ;

public abstract class Shape implements Drawable {


    private String color;


    public Shape(String color) {
        this.color = color;
    }


    @Override
    public String toString() {
        return this.getClass().getSimpleName() + ": color = " + color;
    }



    @Override
    public void draw() {
        System.out.println(this + " -> area = " + this.calcArea());
    }

    public abstract double calcArea();

}



