package DemoMapPackage;


import java.util.HashMap;
import java.util.Hashtable;
import java.util.Scanner;

/**
 * 计算一个字符串中每个字符出现的次数：
 * 分析：
 *      1.使用Scanner获取用户输入字符串;
 *      2.创建Map集合，key是字符串字符，value为频率；
 *      3.使用获得的字符，与map进行匹配:
 *      存在，value++;
 *      不存在,put(key,1)
 */
public class DemoMapTest {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("请输入字符串:");
        String s=in.nextLine();
        HashMap<Character,Integer>map=new HashMap<>();
        char [] c=s.toCharArray();
        for(int i=0;i<c.length;i++)
        {
            if(map.get(c[i])==null)
            {
                map.put(c[i],1);
            }
            else
            {
                Integer value=map.get(c[i]);
                value++;
                map.put(c[i],value);
            }
        }
        System.out.println(map);
    }
}
