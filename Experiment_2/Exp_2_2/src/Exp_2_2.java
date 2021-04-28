import java.util.Scanner;

public class Exp_2_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] list = new double[1000];
        System.out.println("请输入十个数，以下将获取最小元素的最小下标：");
        //输入至数组list
        for (int i = 0; i < 10; i++) {
            list[i] = input.nextDouble();
        }

        //调用方法
        int minIndex = indexOfSmallestElement(list);
        //输出结果
        System.out.print("最小元素的最小下标为：" + minIndex);
    }

    public static int indexOfSmallestElement(double[] array) {
        double minElement = array[9];
        int minIndex = 9;
        //从数组的末尾向前遍历
        for (int i = 8; i >= 0; i--) {
            if (array[i] <= minElement && i < minIndex) {
                minElement = array[i];
                minIndex = i;
            }
        }
        return minIndex;
    }
}
