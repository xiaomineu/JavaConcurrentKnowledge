package concurrent;
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
public class DemoLock {
    public static void main(String[] args) {
        Ticket ticket=new Ticket();
        new Thread(ticket).start();
        new Thread(ticket).start();
        new Thread(ticket).start();
    }
}
