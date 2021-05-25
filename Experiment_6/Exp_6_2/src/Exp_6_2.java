import java.util.Scanner;

public class Exp_6_2 {
    public static void main(String[] args) {
        int[] rand_list = new int[100];
        for (int i = 0; i < 100; i++) {
            rand_list[i] = (int) (Math.random() * 1000) + 1;
        }

        System.out.println("随机生成的数组如下：");
        for (int i = 0; i < 100; i++) {
            System.out.print(rand_list[i] + "\t");
            if ((i + 1) % 10 == 0)
                System.out.println();
        }

        Scanner input = new Scanner(System.in);
        do {
            System.out.println("************请输入您要查看的下标************");
            int index = input.nextInt();
            try {
                System.out.println("随机数组中下标为" + index + "对应的数字为：" + rand_list[index]);
                break;
            } catch (ArrayIndexOutOfBoundsException exception) {
                System.out.println("#您输入的下标超出了数组涵盖的位置，数组的下标范围为0-99#");
                System.out.println("################请重新输入################");
            }
        } while (true);
    }
}
