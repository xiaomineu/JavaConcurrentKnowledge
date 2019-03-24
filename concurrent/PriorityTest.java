package concurrent;

public class PriorityTest {
    public static void main(String[] args) throws Exception{
        Runnable run=()->{
            for(int i=0;i<10;i++)
            {
                System.out.println(Thread.currentThread().getName()+"执行");
            }
        };

        Thread threadA=new Thread(run,"线程对象A");
        Thread threadB=new Thread(run,"线程对象B");
        Thread threadC=new Thread(run,"线程对象C");
        threadA.setPriority(Thread.MAX_PRIORITY);
        threadB.setPriority(Thread.MIN_PRIORITY);
        threadC.setPriority(Thread.MIN_PRIORITY);
        threadA.start();
        threadB.start();
        threadC.start();
    }
}
