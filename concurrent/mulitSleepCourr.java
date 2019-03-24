package concurrent;

public class mulitSleepCourr {
    public static void main(String[] args) throws Exception{
        for(int j=0;j<5;j++)
        {
            new Thread(()->{
                for(int i=0;i<10;i++)
                {
                    System.out.println(Thread.currentThread().getName()+" "+i);
                    try{
                        //休眠1s,再重新执行;
                        Thread.sleep(1000);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
            },"线程对象- "+j).start();
        }
    }
}
