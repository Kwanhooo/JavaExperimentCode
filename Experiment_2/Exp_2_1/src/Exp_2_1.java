import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Exp_2_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        byte[] list = new byte[1000];
        int listSize = 0;
        for (int i = 0; ; i++) {
            byte temp;
            temp = input.nextByte();
            if (temp != 0) {
                list[i] = temp;
                listSize++;
            } else break;
        }

        //sort
        boolean changed = true;
        byte temp;
        do {
            changed = false;
            for (int j = 0; j < listSize - 1; j++)
                if (list[j] > list[j + 1]) {
                    temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                    changed = true;
                }
        } while (changed);

        int i = 0;
        int appearTimes = 1;
        while (true) {
            if (i == listSize)
                break;
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
