public class Fan {
    static final int SLOW = 1;
    static final int MEDIUM = 2;
    static final int FAST = 3;
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    Fan() {
        this.speed = SLOW;
        this.on = false;
        this.radius = 5.0;
        this.color = "blue";
    }

    Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public String toString() {
        if (this.on)
            return "Fan{" +
                    "speed=" + speed +
                    ", radius=" + radius +
                    ", color='" + color + '\'' +
                    '}';
        else
            return "fan is off | " + "Fan{" +
                    "radius=" + radius +
                    ", color='" + color + '\'' +
                    '}';
    }

    public static void main(String[] args) {
        Fan fan_1 = new Fan(FAST, true, 10, "yellow");
        Fan fan_2 = new Fan(MEDIUM, false, 5, "blue");

        System.out.println("第一个fan的toString()结果：");
        System.out.println(fan_1.toString());
        System.out.println("---------------------------------------------");
        System.out.println("第二个fan的toString()结果：");
        System.out.println(fan_2.toString());
    }
}
