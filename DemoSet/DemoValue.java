package DemoSet;

/**
 * 可变参数使用前提:
 *      当方法的参数列表数据类型已经确定，但是参数的个数不确定，就可以使用可变参数
 * 使用格式：定义方法时使用
 *      修饰符 返回类型  方法名(数据类型...变量名){}
 *  可变参数的原理:
 *      可变参数底层为数组，根据传递参数个数不同，会创建不同长度的数组，来存储这些参数
 *      传递的参数个数，可以为0......n多个;
 *
 */

public class DemoValue {
    public static void main(String[] args) {
        System.out.println(add(10,20,30,40,50,60));
    }

    /**
     * 可变参数注意事项：
     *  1.一个方法的参数列表，只能有一个可变参数
     *  2.如果方法的参数有多个，那么可变参数必须写在参数列表的末尾
     * @param
     * @return
     */
    public static void method(String s,int a,int...b)
    {

    }

    public static int add(int...arr)
    {
        System.out.println(arr.length);//底层是数组
        int sum=0;
        for (int i : arr) {
            sum+=i;
        }
        return sum;
    }
}
