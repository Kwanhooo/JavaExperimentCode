import java.util.Scanner;

public abstract class GeometricObject {
    protected String color;
    protected boolean isFilled;
    protected double area;
    protected double circumference;

    GeometricObject(String color, boolean isFilled) {
        this.color = color;
        this.isFilled = isFilled;
    }

    protected abstract void getArea();

    protected abstract void getCircumference();
}

class Triangle extends GeometricObject {
    private final double side_1;
    private final double side_2;
    private final double side_3;

    Triangle(double side_1, double side_2, double side_3, String color, boolean isFilled) {
        super(color, isFilled);
        this.side_1 = side_1;
        this.side_2 = side_2;
        this.side_3 = side_3;
    }


    protected void getArea() {
        double p = (side_1 + side_2 + side_3) * 0.5;
        this.area = Math.sqrt(p * (p - side_1) * (p - side_2) * (p - side_3));
    }


    protected void getCircumference() {
        this.circumference = side_1 + side_2 + side_3;
    }

    @Override
    public String toString() {
        getArea();
        getCircumference();
        return "Triangle{" +
                "color='" + color + '\'' +
                ", isFilled=" + isFilled +
                ", area=" + area +
                ", circumference=" + circumference +
                '}';
    }
}

class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("******下面创建一个Triangle实例******\n");
        System.out.println("请输入三角形的三边长：");
        double side_1 = input.nextDouble();
        double side_2 = input.nextDouble();
        double side_3 = input.nextDouble();
        System.out.println("请输入三角形的颜色：");
        String color = input.next();
        System.out.println("请输入三角形是否填充：(输入true\\false)");
        boolean isFilled = input.nextBoolean();

        Triangle triangle = new Triangle(side_1, side_2, side_3, color, isFilled);
        System.out.println("\n******创建完成******\n");

        System.out.println(triangle);
    }
}