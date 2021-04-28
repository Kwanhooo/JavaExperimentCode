import java.util.Scanner;

public class Exp_2_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] list = new int[1000];
        int temp;
        int index = 0;

        System.out.println("请输入10个数，以下将不重复地显示输入的数：");
        //输入至数组
        for (int i = 0; i < 10; i++) {
            temp = input.nextInt();
            if (index == 0) {
                list[0] = temp;
                index++;
                continue;
            }
            boolean isSame = false;
            for (int j = 0; j < index; j++) {
                if (list[j] == temp) {
                    isSame = true;
                    break;
                }
            }
            if (!isSame) {
                list[index] = temp;
                index++;
            }
        }
        System.out.println("结果如下：");
        for (int i = 0; i < index; i++) {
            System.out.print(list[i] + "\t");
        }
    }
}
