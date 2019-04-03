package Exception;

import java.util.Scanner;

public class RegistExceptionTest02 {
    private static String [] UserNamedata={"zhangmin","root","xiaomi"};
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("请输入需要注册的用户名：");
        String username=in.nextLine();
        checkUsername(username);
    }

    public static void checkUsername(String username)
    {
        for(int i=0;i<UserNamedata.length;i++)
        {
            if(username.equals(UserNamedata[i]))
            {
                throw new RegisterException("该用户名已经被注册");//运行期异常，抛出异常，交由JVM处理，JVM中断;
            }
        }
        System.out.println("恭喜您，注册成功！");
    }
}

