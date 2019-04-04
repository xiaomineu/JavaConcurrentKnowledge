package File.FileDemo01.FileDemo06;

import java.io.File;

/**
 * 遍历文件中以.java结束的文件
 */
public class DemoFile06 {
    public static void main(String[] args) {
        File file=new File("E:\\Java_file\\offer_12\\src");
        findAll(file);
    }
    private static void findAll(File file)
    {
        File [] strings=file.listFiles();
        for (File f : strings) {
            if(f.isDirectory())
            {
                findAll(f);
            }
            else
            {
                String string=f.getName();
                if(string.endsWith(".java"))
                {
                    System.out.println(string);
                }

            }
        }
    }
}
