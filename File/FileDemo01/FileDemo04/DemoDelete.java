package File.FileDemo01.FileDemo04;



import java.io.File;
import java.io.IOException;

/**
 * File类删除功能方法
 *      public boolean creatNewFile():当且仅当该名称文件不存在时，创建一个新的空文件
 *      public boolean delete():删除此File表示的文件或目录
 *      public boolean mkdir():创建由此File表示的目录
 *      public boolean mkdirs():创建由此File表示的目录，包括任何必须但不存在的父目录
 */
public class DemoDelete {
    public static void main(String[] args)throws IOException {
        show02();
    }
    private static void show01() throws IOException
    {
        File file=new File("E:\\Java_file\\untitled\\test.txt");
        System.out.println(file.createNewFile());
        System.out.println(file.delete());
    }

    /**
     * public boolean mkdir():创建单级空文件夹
     * public boolean mkdirs():创建多级/单级空文件夹
     * 返回值:
     *      true:文件夹不存在，创建文件夹，返回true
     *      false:文件夹存在，不能创建；此File类对象表示的为文件也不可被创建
     */
    private static void show02()
    {
        File file=new File("E:\\Java_file\\untitled\\aaa\\bbb\\ccc");
        System.out.println(file.mkdirs());
        System.out.println(file.delete());//文件夹中有内容，不会删除返回false;
        File file01=new File("E:\\Java_file\\untitled\\111.txt");
        System.out.println(file01.mkdir());
        File file02=new File("E:\\Java_f\\untitled\\111");
        System.out.println(file02.mkdirs());//不会抛出异常，路径不存在，不会创建
    }
}
