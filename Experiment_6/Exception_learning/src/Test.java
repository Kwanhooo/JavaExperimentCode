public class Test {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = i;
        }
        String s = "2.33333";
        try {
            Integer.parseInt(s);
            System.out.println(array[50]);
            System.out.println("继续执行了吗？？？");
        }catch (NumberFormatException e1){
            System.out.println("catch了NumberFormatException");
        }
        catch (ArrayIndexOutOfBoundsException e2){
            System.out.println("catch了ArrayIndexOutOfBoundsException");
        }
    }
}
