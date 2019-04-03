package Exception;

import java.util.Scanner;

/**
 * 模拟注册操作：若用户名已经存在，抛出异常并提示：“用户名已注册”
 *
 *      1.使用String存储已注册用户名
 *      2.Scanner获取用户输入的注册名
 *      3.定义方法，匹配注册名
 *          true:用户名已存在，抛出RegisterException异常，告知已注册
 *          false:继续遍历比较
 *        遍历至结尾，未找到重复用户名，注册成功;
 */


public class RegistExceprionTest {
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
                try{
                    throw new RegisterException("该用户名已经被注册");
                }catch (RegisterException w)
                {
                    w.printStackTrace();
                    return;
                }
            }
        }
        System.out.println("恭喜您，注册成功！");
    }
}
