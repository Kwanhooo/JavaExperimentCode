import java.util.Arrays;
import java.util.Scanner;

public class Location {
    public int row;
    public int column;
    public double maxValue;

    public static Location locateLargest(double[][] a) {
        Location loc = new Location();
        //初始化对比标示值
        loc.maxValue = a[0][0];
        loc.row = 0;
        loc.column = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] > loc.maxValue) {
                    loc.maxValue = a[i][j];
                    loc.row = i;
                    loc.column = j;
                }
            }
        }
        return loc;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("输入二维数组的行数和列数:");
        int row = input.nextInt();
        int col = input.nextInt();
        double[][] array = new double[row][col];
        //输入数组内容
        for (int i = 0; i < row; i++) {
            System.out.println("下面输入第" + (i + 1) + "行");
            for (int j = 0; j < col; j++) {
                array[i][j] = input.nextDouble();
            }
        }
        //输出数组内容
        System.out.println("----------------------------------------------------------");
        System.out.println("输出数组:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(array[i][j] + "   ");
            }
            System.out.println();
        }
        System.out.println("----------------------------------------------------------");
        Location loc = locateLargest(array);
        System.out.println("最大元素及其下标是: " + loc.maxValue + " 在(" + loc.row + "," + loc.column + ")");
    }
}