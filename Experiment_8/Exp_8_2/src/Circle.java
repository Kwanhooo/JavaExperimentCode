import java.util.Scanner;

public abstract class Circle {
    protected double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    protected double getArea() {
        return this.radius * this.radius * Math.PI;
    }
}

class ComparableCircle extends Circle
        implements Comparable<ComparableCircle> {
    public ComparableCircle(double radius) {
        super(radius);
    }

    @Override
    public int compareTo(ComparableCircle o) {
        if (this.getArea() > o.getArea())
            return 1;
        else if (this.getArea() == o.getArea())
            return 0;
        else return -1;
    }
}

class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //创建两个ComparableCircle实例
        System.out.print("请输入第一个圆的半径：");
        double radius = input.nextDouble();
        ComparableCircle circle_1 = new ComparableCircle(radius);
        System.out.print("请输入第二个圆的半径：");
        radius = input.nextDouble();
        ComparableCircle circle_2 = new ComparableCircle(radius);

        if (circle_1.compareTo(circle_2) > 0)
            System.out.println("第一个圆的面积 ＞ 第二个圆的面积");
        else if (circle_1.compareTo(circle_2) == 0)
            System.out.println("第一个圆的面积 = 第二个圆的面积");
        else System.out.println("第一个圆的面积 ＜ 第二个圆的面积");
    }
}
