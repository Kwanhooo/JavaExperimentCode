import java.util.Scanner;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant() {
        return getB() * getB() - 4 * getA() * getC();
    }

    public double getRoot1() {
        if (getDiscriminant() >= 0)
            return (-getB() + Math.sqrt(getB() * getB() - 4 * getA() * getC())) / (2 * getA());
        else
            return 0;
    }

    public double getRoot2() {
        if (getDiscriminant() >= 0)
            return (-getB() - Math.sqrt(getB() * getB() - 4 * getA() * getC())) / (2 * getA());
        else
            return 0;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入参数a：");
        double a = input.nextDouble();
        System.out.print("请输入参数b：");
        double b = input.nextDouble();
        System.out.print("请输入参数c：");
        double c = input.nextDouble();

        QuadraticEquation quad = new QuadraticEquation(a, b, c);
        if (quad.a != 0 && quad.b != 0) {
            System.out.println("判别式的值为：" + quad.getDiscriminant());
            System.out.println("-------------------------------------------------------------------------------------------");
        }
        if (quad.a != 0 && quad.b != 0) {
            if (quad.getDiscriminant() > 0) {
                System.out.println("方程 " + quad.a + "x^2 + " + quad.b + "x + " + quad.c + " = 0 的第一个根为：" + quad.getRoot1());
                System.out.println("方程 " + quad.a + "x^2 + " + quad.b + "x + " + quad.c + " = 0 的第二个根为：" + quad.getRoot2());
            } else if (quad.getDiscriminant() == 0) {
                System.out.println("方程 " + quad.a + "x^2 + " + quad.b + "x + " + quad.c + " = 0 的二重根为：" + quad.getRoot1());
            } else {
                System.out.println("方程 " + quad.a + "x^2 + " + quad.b + "x + " + quad.c + " = 0 无解");
            }
        }
        if (quad.a == 0 && quad.b != 0)
            System.out.println("方程 " + quad.a + "x^2 + " + quad.b + "x + " + quad.c + " = 0 的根为：" + quad.c / quad.b);
        if (quad.a != 0 && quad.b == 0)
            System.out.println("方程 " + quad.a + "x^2 + " + quad.b + "x + " + quad.c + " = 0 的根为：" + Math.sqrt(quad.c / quad.a));
        if (quad.a == 0 && quad.b == 0)
            System.out.println("方程 " + quad.a + "x^2 + " + quad.b + "x + " + quad.c + " = 0 无解");
    }
}