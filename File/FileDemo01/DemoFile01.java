package File.FileDemo01;

import java.io.File;

/**
 *      java.io.File类
 *      文件和目录路径名的抽象表示形式
 *          java将电脑中的文件和文件夹（目录）封装为File类，可以使用File类对文件和文件夹进行操作
 *          可以使用File类的方法
 *              创建一个文件/文件夹
 *              删除文件/文件夹
 *              获取文件/文件夹
 *              判断文件/文件夹是否存在
 *              对文件夹进行遍历
 *              获取文件大小
 *          File类为与系统无关的类，任何操作系统都可以使用类中方法
 *
 *          重点：
 *              1.file
 *              2.directory:文件夹/目录
 *              3.path：路径;
 *
 *    public File(String pathname):通过给定路径名字字符串转换为抽象路径名创建File
 *    public File(String parent,String child):通过从父路径字符串与子路径字符串创建新的File实例
 *    public File(File parent,File chile):从父抽象路径名与子抽象路径名字符串创建File实例
 */

public class DemoFile01 {

    public static void main(String[] args) {
        /**
         * static String pathSeparator 与系统有关的路径分隔符，表示一个字符串
         * static char pathSeparatorChar 与系统有关路径分隔符
         * static String separator 与系统有关默认名称分隔符，被表示为一个String
         * static char separatorChar 与系统有关默认名称分隔符
         *
         *
         * 操作路径依据操作系统
         * windows  C:\develop\a\a.txt
         * linux    C:/develop/a/a.txt
         *
         * 分隔符使用File静态变量替换
         * "C:"+File.separator+"develop"+File.separator+"a"+File.separator+"a.txt"
         */
        String pathSeparator= File.pathSeparator;
        System.out.println(pathSeparator);//路径分隔符;
        System.out.println(File.pathSeparatorChar);//;

        System.out.println(File.separator);//文件名称分隔符windows为\   linux为/
    }
}
