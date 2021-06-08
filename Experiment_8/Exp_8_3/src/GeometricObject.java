import java.util.Date;

public class GeometricObject {
    protected String color;
    protected boolean isFilled;
    protected Date createdDate;

    GeometricObject() {
    }

    GeometricObject(String color, boolean isFilled, Date createdDate) {
        this.color = color;
        this.isFilled = isFilled;
        this.createdDate = createdDate;
    }
}

class Square extends GeometricObject implements Colorable {
    @Override
    public void howToColor() {
        System.out.println("给所有的四条边着色");
    }
}

class Test {
    public static void main(String[] args) {
        GeometricObject[] geometricObjects = new GeometricObject[5];
        for (int i = 0; i < 5; i++) {
            if (((int) (Math.random() * 10) + 1) == 1)//随机数为1,则为Square
                geometricObjects[i] = new Square();
        }

        for (int i = 0; i < 5; i++) {
            if (geometricObjects[i] instanceof Colorable) {
                System.out.print("geometricObjects[" + i + "] ->");
                ((Square) geometricObjects[i]).howToColor();
            } else System.out.println("geometricObjects[" + i + "] ->" + "不可着色");
        }
    }
}
