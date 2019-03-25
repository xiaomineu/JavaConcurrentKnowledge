package concurrent;



//加法线程
class AddThread implements Runnable{
    private Resource resource;
    public AddThread(Resource resource)
    {
        this.resource=resource;
    }

    @Override
    public void run() {
        for(int i=0;i<50;i++)
        {
            try {
                this.resource.add();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
class SubThread implements Runnable{
    private Resource resource;
    public SubThread(Resource resource)
    {
        this.resource=resource;
    }

    @Override
    public void run() {
        for(int i=0;i<50;i++)
        {
            try {
                this.resource.sud();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
//定义操作资源
class Resource{
    private int num=0;//操作数据;
    private boolean flag=true;//线程同步标记符
    /**
     * flag为true时，执行加操作；
     * flag为false时，执行减操作；
     */
    public synchronized void add()throws Exception
    {
        if(this.flag==false)
        {
            super.wait();
        }
        Thread.sleep(1000);
        this.num++;
        System.out.println("【加法操作-"+Thread.currentThread().getName()+"】num=" +num);
        this.flag=false;//加法执行完毕，执行减法
        super.notifyAll();
    }
    public synchronized void sud() throws Exception
    {
        if(this.flag==true)//减法操作需要等待;
        {
            super.wait();
        }

        Thread.sleep(1000);

        this.num--;
        System.out.println("【减法操作-"+Thread.currentThread().getName()+"】num=" +num);
        this.flag=true;//减法执行完毕，需要执行加法;
        super.notifyAll();
    }
}
public class AddSub {
    public static void main(String[] args) {
        Resource resource=new Resource();
        AddThread addThread=new AddThread(resource);
        SubThread subThread=new SubThread(resource);
        new Thread(addThread,"线程A" ).start();
        new Thread(addThread,"线程B").start();
        new Thread(subThread,"线程A-").start();
        new Thread(subThread,"线程B-").start();
    }


}
