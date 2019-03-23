package concurrent;

import sun.awt.windows.ThemeReader;

/**
 *
 */
//class Mythread extends Thread//线程主体类
//{
//    private String title;
//    public Mythread(String title)
//    {
//        this.title=title;
//    }
//
//    @Override
//    public void run() {
//        for(int x=0;x<10;x++)
//        {
//            System.out.println(this.title+"运行,x="+x);
//        }
//    }
//}
    class my implements Runnable{//线程主体类，实现Runnable接口
        private String title;
        public my(String title)
        {
            this.title=title;
        }

    @Override
    public void run() {//线程主体方法
        for(int x=0;x<10000;x++)
        {
            System.out.println(this.title+"运行，x="+x);
        }
    }
}
public class sum {
    public static void main(String[] args) {
        //实现多线程操作，必须在Thread类中，使用start方法实现;
        //Thread构造方法中，有Thread(Runnable)方法
        Thread mythread=new Thread(new my("线程A"));
        Thread mythread1=new Thread(new my("线程B"));
        Thread mythread2=new Thread(new my("线程C"));

        mythread.start();
        mythread1.start();
        mythread2.start();
    }
}
