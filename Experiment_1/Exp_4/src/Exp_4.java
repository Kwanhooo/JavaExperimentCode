public class Exp_4 {
    public static void main(String[] args) {
        printNum();
    }

    //判断传入的数值是否符合要求
    public static boolean isValid(int i){
        return (i % 5 == 0 || i % 6 == 0) && !(i % 5 == 0 && i % 6 == 0);
    }

    //打印符合要求的数字
    public static void printNum(){
        byte valid_case = 0;
        for (int i = 100;i<=200;i++){
            if (isValid(i)){
                valid_case++;
                System.out.print(i+"\t");
            }
            else
                continue;
            if (valid_case%10==0)//每输出10个数，换一次行
                System.out.print('\n');
        }
    }
}
