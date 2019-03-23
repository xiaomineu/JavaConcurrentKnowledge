package concurrent;

public class StruggleTicket implements Runnable{
    private int ticket=100;

    private String name;

    StruggleTicket(String name)
    {
        this.name=name;
    }


    @Override
    public void run() {
            for(int i=0;i<1000;i++)
            {
                if(ticket>0){
                    System.out.println(name+"**"+this.ticket--);
                }
            }
    }

    //1000个人抢100张票
    public static void main(String[] args) {
        StruggleTicket exp=new StruggleTicket("station:");
        new Thread(exp).start();
        new Thread(exp).start();
        new Thread(exp).start();
    }
}
