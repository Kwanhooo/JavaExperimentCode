import java.util.Scanner;

public class Exp_2_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //建立两个数组
        int[] list_1 = new int[1000];
        int[] list_2 = new int[1000];

        //输入第一个数组
        System.out.println("请输入第一个数组：");
        int listSize_1;
        listSize_1 = input.nextInt();
        for (int i = 0; i < listSize_1; i++) {
            list_1[i] = input.nextInt();
        }
        bubbleSort(list_1, listSize_1);

        //输入第二个数组
        System.out.println("请输入第二个数组：");
        int listSize_2;
        listSize_2 = input.nextInt();
        for (int i = 0; i < listSize_2; i++) {
            list_2[i] = input.nextInt();
        }
        bubbleSort(list_2, listSize_2);

        boolean isSame = equal(list_1, list_2, listSize_1, listSize_2);
        if (isSame)
            System.out.println("两数组相等");
        else
            System.out.println("两数组不相等");
    }

    public static boolean equal(int[] list_1, int[] list_2, int listSize_1, int listSize_2) {
        if (listSize_1 != listSize_2)
            return false;
        int i = 0;
        while (i <= listSize_1) {
            if (list_1[i] != list_2[i])
                return false;
            i++;
        }
        return true;
    }

    public static void bubbleSort(int[] list, int listSize) {
        //sort
        boolean changed = true;
        int temp;
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
    }
}
