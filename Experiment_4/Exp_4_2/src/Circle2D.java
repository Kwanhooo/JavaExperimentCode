import javax.swing.plaf.metal.MetalSliderUI;

public class Circle2D {
    private double x;
    private double y;
    private double radius;

    Circle2D() {
        this.x = 0;
        this.y = 0;
        this.radius = 1;
    }

    Circle2D(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return this.radius * this.radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * Math.PI * this.radius;
    }

    public boolean contains(double x, double y) {
        return Math.sqrt((x - this.x) * (x - this.x) + (y - this.y) * (y - this.y)) < this.radius;
    }

    public boolean contains(Circle2D circle) {
        return Math.sqrt((circle.x - this.x) * (circle.x - this.x) + (circle.y - this.y) * (circle.y - this.y)) + circle.radius <= this.radius;
    }

    public boolean overlaps(Circle2D circle) {
        return Math.sqrt((circle.x - this.x) * (circle.x - this.x) + (circle.y - this.y) * (circle.y - this.y)) - circle.radius < this.radius && (Math.sqrt((circle.x - this.x) * (circle.x - this.x) + (circle.y - this.y) * (circle.y - this.y)) + circle.radius > this.radius);
    }


}

class TestCircle2D {
    public static void main(String[] args) {
        Circle2D circle = new Circle2D(7, 1, 5);
        System.out.println("面积为：" + circle.getArea());
        System.out.println("周长为：" + circle.getPerimeter());
        System.out.println("c1.contains(3,3) = " + circle.contains(1, 3));
        System.out.println("c1.contains(new Circle2D(4, 5, 10.5)) = " + circle.contains(new Circle2D(2, 2, 2)));
        System.out.println("c1.overlaps(new Circle2D(3, 5, 2.3)) = " + circle.overlaps(new Circle2D(3, 3, 8)));
    }
}
