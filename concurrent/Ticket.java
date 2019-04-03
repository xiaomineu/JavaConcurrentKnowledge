package concurrent;

import java.util.concurrent.locks.ReentrantLock;

/**
 * 线程安全使用lock锁
 * java.util.concurrent.locks.Lock接口
 * interface Lock:
 *  void lock()获取锁
 *  void unlock()释放锁
 * 接口实现类：
 * java.util.concurrent.locks.ReentrantLock implements Lock接口
 *
 * 步骤:
 *      1.成员位置创建ReentrantLock对象
 *      2.在可能会出现安全问题的代码前调用Lock接口的lock获取锁
 *      3.在可能会出现安全问题的代码后调用Lock接口的unlock释放锁
 */

public class Ticket implements Runnable{
    private  int ticketNumber=100;

    //成员位置创建ReentrantLock对象
    ReentrantLock reentrantLock=new ReentrantLock();
    @Override
    public void run() {
        while(true)
        {
            //在可能会出现安全问题代码前调用Lock接口方法lock上锁
            reentrantLock.lock();
            if(ticketNumber>0)
            {
                try {
                    Thread.sleep(100);
                    System.out.println(Thread.currentThread().getName()+"-->卖出第"+ticketNumber+"张票");
                    ticketNumber--;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //无论是否异常，将锁释放;
                finally {
                    reentrantLock.unlock();
                }
            }
        }
    }
}
