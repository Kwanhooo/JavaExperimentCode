import java.util.Scanner;

public class Exp_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //接受输入的数字（串）
        String s;
        //储存数位加和
        byte sum = 0;

        //提示用户输入数字
        System.out.println("Please input a number:");
        s = input.nextLine();

        //如果大于1000，提示重新输入
        while (Integer.parseInt(s) > 1000) {
            System.out.println("The number you input is bigger than 1000");
            System.out.println("Please input a number:");
            s = input.nextLine();
        }

        //如果小于0，提示重新输入
        while (Integer.parseInt(s) < 0) {
            System.out.println("The number you input is lower than 0");
            System.out.println("Please input a number:");
            s = input.nextLine();
        }

        //求数位和
        for (byte i = 0; i < s.length(); ++i) {
            sum += (s.charAt(i) - '0');
        }

        //输出结果
        System.out.println("The sum of the digits is " + sum);
    }
}
