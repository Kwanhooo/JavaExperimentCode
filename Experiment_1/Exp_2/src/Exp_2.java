import java.util.Scanner;

public class Exp_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //储存输入的坐标
        double x1, y1, x2, y2, x3, y3;
        //储存三边长，参数s
        double s1, s2, s3, s;

        //输入
        System.out.println("Enter three points for a triangle:");
        x1 = input.nextDouble();
        y1 = input.nextDouble();
        x2 = input.nextDouble();
        y2 = input.nextDouble();
        x3 = input.nextDouble();
        y3 = input.nextDouble();

        //计算三边长
        s1 = Math.sqrt(Math.pow(x1 - x2, 2) + (Math.pow(y1 - y2, 2)));
        s2 = Math.sqrt(Math.pow(x1 - x3, 2) + (Math.pow(y1 - y3, 2)));
        s3 = Math.sqrt(Math.pow(x3 - x2, 2) + (Math.pow(y3 - y2, 2)));

        //判断三角形是否符合定义
        if (s1 + s2 <= s3 || Math.abs(s1 - s2) >= s3 || s3 + s2 <= s1 || Math.abs(s3 - s2) >= s1 || s3 + s1 <= s2 || Math.abs(s3 - s1) >= s2)
            System.out.println("Invalid Triangle !");
        else {
            s = (s1 + s2 + s3) / 2.0;
            System.out.println("The area of the triangle is " + Math.sqrt(s * (s - s1) * (s - s2) * (s - s3)));
        }
    }
}