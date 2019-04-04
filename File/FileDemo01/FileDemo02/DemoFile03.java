package File.FileDemo01.FileDemo02;


import java.io.File;

/**
 * File类获取功能方法
 *      public String getAbsolutePath();获取该File实例对象的绝对路劲名字符串
 *      public String getPath();将此File转换为路径名字符串
 *      public String getName();返回由此File表示的文件或目录名称
 *      public long length();返回此File表示的文件的长度
 */
public class DemoFile03 {
    public static void main(String[] args) {
        show01();
    }

    /**
     * public long length()
     * 返回：此File类实例对象表示的文件的长度，获取构造方法指定的文件的大小
     * 注意：
     *      文件夹没有大小概念，不能获取文件夹大小
     *      File路径不正确，length方法返回0;
     */
    private static void show01(){
        File file=new File("C:\\Users\\xiaomi\\Desktop\\sel.png");
        System.out.println(file.length());
        File file01=new File("C:\\Users\\xiaomi\\Desktop\\seh.png");
        System.out.println(file01.length());//路径错误，返回0;


        File file02=new File("test.txt");
        System.out.println(file.getName());//获取此对象的文件或目录名称
        System.out.println(file.getPath());//获取此对象的路径名字符串
        System.out.println(file.getAbsolutePath());//获取绝对路径名字符串

        System.out.println(file02.getPath());
        System.out.println(file02.getAbsolutePath());

    }


}
