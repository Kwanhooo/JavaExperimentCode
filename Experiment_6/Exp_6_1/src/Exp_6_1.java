import java.util.Scanner;

public class Exp_6_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean isContinue = true;
        do {
            try {
                System.out.print("请输入第一个整数：");
                String num_1 = input.next();
                System.out.print("请输入第二个整数：");
                String num_2 = input.next();

                int sum = Integer.parseInt(num_1) + Integer.parseInt(num_2);
                System.out.println("两个整数的和为：" + sum);
                isContinue = false;
            } catch (NumberFormatException exception) {
                System.out.println("*********您输入的不是整数！请重新输入**********");
                System.out.println("******引发异常：NumberFormatException*******");
            }
        } while (isContinue);
    }
}