package File.FileDemo01.FileDemo03;


import java.io.File;

/**
 * File类判断功能方法:
 *      public boolean exists()判断此File文件是否存在
 *      public boolean isDirectory()此File表示的是否是目录
 *      public boolean isFile():此File是否是文件
 */
public class DemoFileJudge {
    public static void main(String[] args) {
        show01();
    }
    private static void show01()
    {
        File file=new File("C:\\Users\\xiaomi\\Desktop\\sel.png");
        if(file.exists())
        {
            System.out.println("C:\\Users\\xiaomi\\Desktop\\sel.png是否为文件："+file.isFile());
            System.out.println("C:\\Users\\xiaomi\\Desktop\\sel.png是否为目录："+file.isDirectory());
        }
        File file01=new File("C:\\Users\\xiaomi\\Desktop");
        if(file01.exists())
        {
            System.out.println("C:\\Users\\xiaomi\\Desktop是否为目录："+file01.isDirectory());
            System.out.println("C:\\Users\\xiaomi\\Desktop是否为文件："+file01.isFile());
        }
    }
}
