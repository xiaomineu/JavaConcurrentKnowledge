package concurrent;

public class interruptCourrent {
    public static void main(String[] args) throws Exception{
        Thread thread=new Thread(()->{
            System.out.println("Too tired to work");
            try {
                Thread.sleep(10000);
                System.out.println("Get up to work");
            }catch (InterruptedException e)
            {
                System.out.println("老子宰了你");
            }
        });
        thread.start();//开始睡;
        Thread.sleep(1000);
        if(!thread.isInterrupted())
        {
            thread.interrupt();
            System.out.println("悄悄打扰一下");
        }
    }
}
