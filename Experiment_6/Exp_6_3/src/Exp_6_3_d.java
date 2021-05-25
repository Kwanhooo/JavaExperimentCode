import java.util.Scanner;

public class Exp_6_3_d {
    //method_3
    public static int method_3(int index) {
        Scanner input = new Scanner(System.in);
        System.out.print("method_3中打印的信息：请输入一个整数：");
        int i = input.nextInt();
        return i;
    }

    //method_2
    public static int strToInt(String str) {
        try {
            System.out.println("method_3即getElem执行完毕，结果为：" + method_3(2313));//invoke method_3

        } catch (ArrayIndexOutOfBoundsException exception) {//Exception 3
            System.out.println("###从method_2即strToInt中catch异常：ArrayIndexOutOfBoundsException###");
        }
        System.out.println("*method_2即strToInt继续运行*");
        return Integer.parseInt(str);
    }

    //method_1
    public static void divide(int a, int b) {
        try {
            System.out.println("method_2即strToInt执行完成，结果为：" + strToInt("123"));//invoke method_2
        } catch (NumberFormatException exception) {//Exception 2
            System.out.println("###从method_1即divide中catch异常：NumberFormatException###");
        }
        System.out.println("*method_1即divide继续运行*");
        System.out.println("method_1即divide执行完成，结果为：" + a / b);
    }

    public static void main(String[] args) {
        try {
            divide(1, 1);//method_1
        } catch (ArithmeticException exception) {//Exception_1
            System.out.println("###从main方法中catch异常：ArithmeticException###");
        }
        System.out.println("*main方法继续运行*");
    }
}