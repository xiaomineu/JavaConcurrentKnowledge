package concurrent;

class ticket implements Runnable
{
    private int ticketNumber=10;
    public synchronized boolean sale() {
                if(ticketNumber>0)
                {
                    try{
                        Thread.sleep(1000);
                    }catch (InterruptedException e)
                    {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName()+"卖票，ticket="+this.ticketNumber--);
                    return true;
                }
                else
                {
                    System.out.println("******票已卖光*******");
                    return false;
                }
    }

    @Override
    public void run() {
        while(this.sale())
        {
            ;
        }
    }
}
public class buyTicket {
    public static void main(String[] args)throws Exception {
        ticket mt=new ticket();
        new Thread(mt,"票贩子A").start();
        new Thread(mt,"票贩子B").start();
        new Thread(mt,"票贩子C").start();
    }
}
