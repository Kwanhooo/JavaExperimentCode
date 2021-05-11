public class Rectangle {
    private double width = 1;
    private double height = 1;

    Rectangle(double w, double h) {
        this.width = w;
        this.height = h;
    }

    public double getArea() {
        return this.width * this.height;
    }

    public double getPerimeter() {
        return 2 * this.width + 2 * this.height;
    }

    public static void main(String[] args) {
        Rectangle test_rectangle_1 = new Rectangle(4, 40);
        Rectangle test_rectangle_2 = new Rectangle(3.5, 35.9);
        System.out.println("第一个矩形的宽为：" + test_rectangle_1.width);
        System.out.println("第一个矩形的高为：" + test_rectangle_1.height);
        System.out.println("第一个矩形的面积为：" + test_rectangle_1.getArea());
        System.out.println("第一个矩形的周长为：" + test_rectangle_1.getPerimeter());
        System.out.println("--------------------------------------------------");
        System.out.println("第二个矩形的宽为：" + test_rectangle_2.width);
        System.out.println("第二个矩形的高为：" + test_rectangle_2.height);
        System.out.println("第二个矩形的面积为：" + test_rectangle_2.getArea());
        System.out.println("第二个矩形的周长为：" + test_rectangle_2.getPerimeter());
    }
}