import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class FileExp {
    public static void main(String[] args) throws IOException {
        System.out.println("**********创建文件**********");
        File file = new File("Exercise9_19.txt");
        if (file.exists())
            System.out.println("File is already exists!");
        else
            System.out.println("File is creating now!");
        System.out.println("**********创建完成**********\n");

        //输出随机整数
        System.out.println("**********写入文件**********");
        PrintWriter output = new PrintWriter(file);
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            int rand_num = (int) (Math.random() * 100) + 1;
            s.append(rand_num).append(" ");
        }
        System.out.println("数字序列：" + s + "\n已写入Exercise9_19.txt");
        output.print(s);
        output.close();
        System.out.println("**********写入完成**********\n");

        //重新读入数据
        System.out.println("**********重新读入**********");
        Scanner input = new Scanner(file);
        int[] rand_list = new int[10];
        for (int i = 0; i < 10; i++) {
            rand_list[i] = Integer.parseInt(input.next());
        }

        //对数据进行排序
        Arrays.sort(rand_list);

        //显示排序后的数据
        System.out.println("排序后的数字序列为：");
        for (int i = 0; i < 10; i++) {
            System.out.print(rand_list[i] + " ");
        }
        System.out.println("\n**********读入完成**********");
    }
}