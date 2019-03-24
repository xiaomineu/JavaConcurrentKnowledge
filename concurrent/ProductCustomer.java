package concurrent;

/**
 * 设置生产消费标记
 * symbol,当symbol为true时，允许生产，不允许消费；
 * 当symbol为false,允许消费，不允许生产;
 */
class Message
{
    private String name;
    private String character;
    private boolean symbol=true;


    public synchronized String get() {
        if(symbol)//还未生产;
        {
            try {
                super.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        finally {
            this.symbol=true;
            super.notify();
        }

        return this.name+"*********"+this.character;
    }

    public synchronized void set(String name,String character) {
        if(!symbol)
        {
            try {
                super.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.name=name;
        this.character = character;
        this.symbol=false;//已经生产过了;
        super.notify();//唤醒等待线程;
    }
}

class Product implements Runnable{
    private Message mes;

    public Product(Message mes)
    {
        this.mes=mes;
    }

    @Override
    public void run() {
        for(int i=0;i<100;i++)
        {
            if(i%2==00)
            {
                this.mes.set("杨幂","演技差");
            }
            else
            {
                this.mes.set("陈坤","演技好");
            }
        }
    }
}

class Customer implements  Runnable
{
    private Message mes;
    public Customer(Message mes)
    {
        this.mes=mes;
    }

    @Override
    public void run() {
        for(int i=0;i<100;i++)
        {
            System.out.println(this.mes.get());
        }
    }
}
public class ProductCustomer {


    public static void main(String[] args) {
        Message mes=new Message();
        new Thread(new Product(mes)).start();
        new Thread(new Customer(mes)).start();
    }
}
