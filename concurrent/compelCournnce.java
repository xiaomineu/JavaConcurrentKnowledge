package concurrent;

public class compelCournnce {
    public static void main(String[] args) throws Exception{
        Thread ma=Thread.currentThread();
        Thread thread=new Thread(()->{
                for(int i=0;i<100;i++)
                {
                    if(i>3)
                    {
                        try
                        {
                            ma.join();
                        }catch (InterruptedException e)
                        {
                            e.printStackTrace();
                        }
                    }
                    try
                    {
                        Thread.sleep(100);
                    }catch (InterruptedException e)
                    {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName()+"执行 i= "+i);
                }
        },"子线程");

        thread.start();
        for(int i=0;i<100;i++)
        {
            Thread.sleep(100);
            System.out.println("【主线程】number= "+i);
        }
    }
}
