import java.util.ArrayList;
import java.util.Scanner;

public class MyStack<DataType> extends ArrayList<DataType> {
    private final ArrayList<DataType> arrayList = new ArrayList<>();
    private int elemAmount;

    public MyStack() {
        elemAmount = 0;
    }

    public void push(DataType data) {
        arrayList.add(data);
        elemAmount++;
    }

    public DataType pop() {
        if (!isEmpty()) {
            elemAmount--;
            return arrayList.remove(elemAmount);
        } else
            return null;
    }

    public DataType getTop(){
        return this.arrayList.get(elemAmount-1);
    }

    public void clearStack(){
        this.arrayList.clear();
    }

    public boolean isEmpty() {
        return arrayList.size() == 0;
    }
}

class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //初始化MyStack的一个实例
        MyStack<String> stack = new MyStack<>();
        //输入五个字符串，压入栈中
        System.out.println("以下请输入5个字符串：");
        for (int i = 0; i < 5; i++) {
            System.out.print("输入第" + (i + 1) + "个字符串：");
            String s = input.nextLine();
            stack.push(s);
        }

        System.out.println("----------------------------------");

        //将所有字符串出栈，依次输出
        System.out.println("逆序输出字符串如下：");
        for (int i = 0; i < 5; i++) {
            System.out.println("逆序第" + (i + 1) + "个字符串：" + stack.pop());
        }
    }
}
