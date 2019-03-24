package concurrent;
class Jian
{
    public synchronized void say(XiaoQiang xq)
    {
        System.out.println("阿健说:此路是我开，要想过此路，留下10块钱");
        xq.get();
    }
    public synchronized  void get()
    {
        System.out.println("阿健说：得到了10块钱，可以吃饭了");
    }
}
class XiaoQiang
{
    public synchronized void say(Jian JJ)
    {
        System.out.println("小强说:我先过，然后给你钱");
        JJ.get();
    }
    public synchronized void get()
    {
        System.out.println("小强说：省下10块钱");
    }
}
public class DeadLock implements Runnable{
    private Jian JJ=new Jian();
    private XiaoQiang xq=new XiaoQiang();

    public DeadLock()
    {
        new Thread(this).start();//子线程;
        xq.say(JJ);//主线程;
    }

    @Override
    public void run() {
          JJ.say(xq);
    }

    public static void main(String[] args) {
        new DeadLock();
    }
}
