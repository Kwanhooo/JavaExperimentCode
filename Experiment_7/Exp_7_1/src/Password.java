import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        System.out.print("请设定您的密码：");
        Scanner input = new Scanner(System.in);
        String password = input.nextLine();
        if (isValid(password))
            System.out.println("Valid Password");
        else
            System.out.println("Invalid Password");
    }

    public static boolean isValid(String pwd) {
        //检查密码长度
        if (pwd.length() < 8) {
            System.out.println("您设定的密码小于8位！");
            return false;
        }

        //检查密码是否有除数字和字母之外的字符
        for (int i = 0; i < pwd.length(); i++) {
            if (!(pwd.charAt(i) >= 'a' && pwd.charAt(i) <= 'z' || pwd.charAt(i) >= '0' && pwd.charAt(i) <= '9' || pwd.charAt(i) >= 'A' && pwd.charAt(i) <= 'Z')) {
                System.out.println("您设定的密码含有除数字和字母之外的字符！");
                return false;
            }
        }

        //检查密码是否有至少有两个数字
        byte num_flag = 0;
        for (int i = 0; i < pwd.length(); i++) {
            if (pwd.charAt(i) >= '0' && pwd.charAt(i) <= '9') {
                num_flag++;
            }
        }
        if (num_flag < 2) {
            System.out.println("您的密码中必须包含两个及以上的数字！");
            return false;
        }

        return true;
    }
}