import java.io.*;

public class FileStatistic {
    public static void main(String[] args) throws Exception {
        System.out.println("**********读取文档**********\n");

        try {
            Reader reader = new FileReader(args[0]);
            BufferedReader bufferedReader = new BufferedReader(reader);

            int charAmount = 0;
            int wordAmount = 0;
            int lineAmount = 0;

            //读取文档
            String s = bufferedReader.readLine();
            while (s != null) {
                String[] content = s.split("\\s");
                for (String value : content) {
                    wordAmount++;
                    charAmount += value.length();
                }
                lineAmount++;
                s = bufferedReader.readLine();
            }
            reader.close();
            bufferedReader.close();

            //输出信息
            System.out.println("文件" + args[0] + "有：");
            System.out.println(charAmount + "个字符；");
            System.out.println(wordAmount + "个单词；");
            System.out.println(lineAmount + "行；");
            System.out.println("\n**********统计结束**********");
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("您尚未指定文件路径！");
            System.out.println("\n**********运行失败**********");
            System.exit(0xabcedf);
        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println("找不到指定路径中的文件！");
            System.out.println("\n**********运行失败**********");
            System.exit(0xcccccc);
        }
    }
}