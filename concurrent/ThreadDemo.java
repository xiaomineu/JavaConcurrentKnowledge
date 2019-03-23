package concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

class MyThread implements Callable<String>
{
    @Override
    public String call() throws Exception {
        for(int x=0;x<10;x++)
        {
            System.out.println("线程执行"+x);
        }
        return "【线程执行完毕】";
    }
}
public class ThreadDemo {
    public static void main(String[] args) throws Exception{
        FutureTask<String> lis=new FutureTask<>(new MyThread());
        new Thread(lis).start();
        System.out.println("【线程返回数据】"+lis.get());

    }
}
