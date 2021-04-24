public class Exp_3 {
    public static void main(String[] args) {
        //产生随机数
        int rand_num = (int) (Math.random() * 52) + 1;
        String suit;

        //判断花色
        if (rand_num >= 1 && rand_num <= 13)
            suit = "Clubs";
        else if (rand_num <= 26)
            suit = "Diamond";
        else if (rand_num <= 39)
            suit = "Heart";
        else
            suit = "Spades";

        String weight = "0";

        //判断大小
        if (rand_num % 13 >= 2 && rand_num % 13 <= 10)
            weight = String.valueOf(rand_num % 13);
        if (rand_num % 13 == 1)
            weight = "Ace";
        if (rand_num % 13 == 11)
            weight = "Jack";
        if (rand_num % 13 == 12)
            weight = "Queen";
        if (rand_num % 13 == 0)
            weight = "King";

        //输出结果
        System.out.println("The random number is " + rand_num);
        System.out.println("The chard generated just now is " + weight + " in " + suit);
    }
}