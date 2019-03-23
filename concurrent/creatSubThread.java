package concurrent;

public class creatSubThread {
    public static void main(String[] args) throws Exception{
        System.out.println("1.执行操作任务1");
        System.out.println("2.执行操作任务2");

        new Thread(()->//子线程负责统计
        {
            int temp=0;
            for(int x=0;x<Integer.MAX_VALUE;x++)
            {
                temp+=x;
            }

        });

        System.out.println("N.执行操作任务N");
    }
}
