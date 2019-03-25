package concurrent;

public class ThreadDemoProtected {
    /**
     * 守护线程围绕在用户线程周围，程序执行完毕，守护线程也随之消失;
     * @param args
     */
    public static void main(String[] args) {
        Thread userThread=new Thread(()->{
            for(int i=0;i<10;i++) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "正在运行，x= " +i);
            }
        },"用户线程");//完成核心业务

        Thread daemonThread=new Thread(()->{
            for(int i=0;i<Integer.MAX_VALUE;i++)
            {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+"正在运行，i= "+i);
            }
        },"守护线程");
        daemonThread.setDaemon(true);//设为守护线程;
        userThread.start();
        daemonThread.start();
    }

}
