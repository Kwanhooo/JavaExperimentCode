import java.util.Date;

public class GeometricObject {
    private String color;
    private final boolean isFilled;
    private final Date dateCreated;

    GeometricObject() {
        color = "white";
        isFilled = false;
        dateCreated = new Date();
    }

    GeometricObject(String color, boolean isFilled) {
        this.color = color;
        this.isFilled = isFilled;
        dateCreated = new Date();
    }

    public String getColor() {
        return color;
    }

    public boolean isFilled() {
        return isFilled;
    }

    public Date getDateCreated() {
        return dateCreated;
    }
}

class Triangle extends GeometricObject {
    private final double side1;
    private final double side2;
    private final double side3;

    Triangle() {
        super();
        this.side1 = 1.0;
        this.side2 = 1.0;
        this.side3 = 1.0;
    }

    Triangle(double side1, double side2, double side3, String color, boolean isFilled) {
        super(color, isFilled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    public double getArea() {
        double p = (this.side1 + this.side2 + this.side3) / 2;
        return Math.sqrt(p * (p - this.side1) * (p - this.side2) * (p - this.side3));
    }

    public double getPerimeter() {
        return this.side1 + this.side2 + this.side3;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "color='" + super.color + '\'' +
                ", isFilled=" + isFilled() +
                ", dateCreated=" + getDateCreated() +
                ", side1=" + side1 +
                ", side2=" + side2 +
                ", side3=" + side3 +
                '}';
    }
}

class TestTriangle{
    public static void main(String[] args) {
        Triangle triangle = new Triangle(1,1.5,1,"yellow",true);
        System.out.println(triangle.toString());
        System.out.println("面积为："+triangle.getArea());
        System.out.println("周长为："+triangle.getPerimeter());
    }
}