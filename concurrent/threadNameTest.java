package concurrent;

class testThread implements Runnable
{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
public class threadNameTest {
    public static void main(String[] args)throws Exception {
        testThread mt=new testThread();
        new Thread(mt,"线程A").start();
        new Thread(mt).start();
        new Thread(mt,"线程B").start();
    }
}
