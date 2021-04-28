import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Exp_2_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("==============================================");
        System.out.println("请输入数字，以'0'结束输入。以下将统计各数字的出现次数：");
        System.out.println("==============================================");
        byte[] list = new byte[1000];
        int listSize = 0;

        //将数字输入到数组
        for (int i = 0; ; i++) {
            int temp;
            temp = input.nextInt();
            if (i == 0 && temp == 0) {
                System.out.println("没有执行输入操作，未进行统计");
                return;
            } else if (temp == 0)
                break;
            if (temp >= 0 && temp <= 100) {
                list[i] = (byte) temp;
                listSize++;
            }
            else{
                System.out.println("请输入1-100之间的数字！超出范围的数字未统计！");
                i--;
            }
        }

        //对数组进行排序
        boolean changed = true;
        int temp;
        do {
            changed = false;
            for (int j = 0; j < listSize - 1; j++)
                if (list[j] > list[j + 1]) {
                    temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = (byte) temp;
                    changed = true;
                }
        } while (changed);

        int i = 0;
        int appearTimes = 1;
        while (i != listSize) {
            if (list[i] == list[i + 1]) {
                appearTimes++;
            } else {
                System.out.print(list[i] + " 出现的次数为：" + appearTimes + "\n");
                appearTimes = 1;
            }
            i++;
        }
    }
}
