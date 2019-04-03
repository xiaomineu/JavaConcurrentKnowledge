package concurrent.CommunicationThread;

public class CommunicateTest {
    public static void main(String[] args) {

        //创建锁对象
        Object object=new Object();

        //消费者
        new Thread(){
            @Override
            public void run() {
                while(true)
                {
                    synchronized (object)
                    {
                        System.out.println("顾客1点包子");
                        try {
                            object.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println("顾客1将包子吃完了");
                        System.out.println("**----------------------**");
                    }
                }
            }
        }.start();

        //消费者2
        new Thread(){
            @Override
            public void run() {
                while(true)
                {
                    synchronized (object)
                    {
                        System.out.println("顾客2点包子");
                        try {
                            object.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println("顾客2将包子吃完了");
                        System.out.println("**----------------------**");
                    }
                }
            }
        }.start();

        //生产者
        new Thread(){
            @Override
            public void run() {
                while(true)
                {
                        try {
                            Thread.sleep(10);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        synchronized (object)
                        {
                            System.out.println("包子已经生产好，可以开始吃了");
                            object.notifyAll();
                        }
                }
            }
        }.start();
    }
}
