package File.FileDemo01;

import java.io.File;

/**
 * 路径:
 *      绝对路径：
 *          一个完整的路径
 *          以盘符（C:,D:)开始
 *          c:\\user\\java\\project\\DemoFile.java
 *      相对路径：
 *          相对指相对于当前项目根目录(c:\\user\\java\\project)
 *          如果使用当前项目根目录，路径简化为：
 *              c:\\user\\java\\project\\DemoFile.java->>简化为:DemoFile.java
 *      路径不区分大小写；
 *      windows中文件分隔符为\,\为转义字符，两个\\代表一个普通\
 *
 *
 *
 *
 *    public File(String pathname):通过给定路径名字字符串转换为抽象路径名创建File
 *    public File(String parent,String child):通过从父路径字符串与子路径字符串创建新的File实例
 *    public File(File parent,File chile):从父抽象路径名与子抽象路径名字符串创建File实例
 */
public class DemoFile02 {
    public static void main(String[] args) {
        show03();
    }


    //构造方法1
    private static void show01()
    {
        File file=new File("E:\\java_file:\\untitled:\\file.txt");
        System.out.println(file);
    }
    //构造方法2
    private static void show02()
    {
        File file=new File("E:","file.txt");
        System.out.println(file);
    }

    /**
     * File(File parent,String child)根据parent抽象路径名与child路径名字符串创建一个File实例
     * 参数:
     *      File parent:父路径
     *      String child:子路径
     */

    public static void show03()
    {
        File parent=new File("D:\\");
        File file=new File(parent,"file.txt");
        System.out.println(file);
    }
}
