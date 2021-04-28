import java.util.Scanner;

public class Exp_2_5 {
    public static void main(String[] args) {
        System.out.println("=========================================================================================");
        System.out.println("Tips:此程序用于检验银行卡卡号的合法性，支持的种类有：Mastercard,Visa,American Express,Discovery");
        System.out.println("========================================================================================");

        Scanner input = new Scanner(System.in);

        long cardNumber;
        System.out.print("请输入您的银行卡号：");
        cardNumber = input.nextLong();

        if (isValid(cardNumber))
            System.out.println("您的卡号*符合*我们的验证规则！");
        else
            System.out.println("您的卡号*不符合*我们的验证规则！");
    }

    /*Return true if the card number is valid*/
    public static boolean isValid(long number) {
        System.out.println("********************开始验证********************");
        System.out.println("Length = " + getSize(number));
        if (!(getSize(number) >= 13 && getSize(number) <= 16))
            return false;

        System.out.println("************通过长度验证，进入前缀验证*************");

        long prefix = getPrefix(number, 2);
        System.out.println("prefix = " + prefix);
        if (prefix / 10 != 4 && prefix / 10 != 5 && prefix / 10 != 6 && prefix != 37)
            return false;

        System.out.println("************通过前缀验证，进入Mod10验证************");
        int evenSum = sumOfDoubleEvenPlace(number);
        int oddSum = sumOfOddPlace(number);
        int sum = evenSum + oddSum;

        if (sum % 10 == 0) {
            System.out.println(sum + " % 10 = 0");
            return true;
        } else {
            System.out.println(sum + " % 10 = " + sum % 10 + " ≠ 0");
            return false;
        }
    }

    /*Get the result from step 2*/
    public static int sumOfDoubleEvenPlace(long number) {
        String cardNumber = String.valueOf(number);

        int evenSum = 0;
        for (int i = cardNumber.length() - 2; i >= 0; i -= 2) {
            int temp = ((int) (cardNumber.charAt(i)) - '0') * 2;
            evenSum += getDigit(temp);
        }
        return evenSum;
    }

    /*Return sum of odd place digits in number*/
    public static int sumOfOddPlace(long number) {
        String cardNumber = String.valueOf(number);

        int oddSum = 0;
        for (int i = cardNumber.length() - 1; i >= 0; i -= 2) {
            int temp = ((int) (cardNumber.charAt(i)) - '0');
            oddSum += temp;
        }
        return oddSum;
    }

    /*Return this number if it is a single digit, otherwise return the sum of the two digits*/
    public static int getDigit(int number) {
        if (number < 10)
            return number;
        else {
            return number / 10 + (number - number / 10 * 10);
        }
    }

    /*Return the number of digits in d*/
    public static int getSize(long d) {
        String cardNumber = String.valueOf(d);
        return cardNumber.length();
    }

    /*Return the first k number of digits from number. If the number of digits in number is less than k, return number*/
    public static long getPrefix(long number, int k) {
        String s = String.valueOf(number);
        return Integer.parseInt((s.substring(0, k)));
    }
}
