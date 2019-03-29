package DemoSet;

import java.util.HashSet;

/**
 * HashSet存储自定义类型元素
 *
 * Set集合报错元素唯一:
 *      必须重写hashCode方法和equals方法
 *
 */
public class DemoHashCode02 {
    public static void main(String[] args) {
        //创建HashSet集合存储Person
        HashSet<Person> set=new HashSet<>();
        Person s1=new Person("杨幂","39");
        Person s5=new Person("杨幂","39");
        Person s2=new Person("高圆圆","45");
        Person s3=new Person("赵丽颖","34");

        set.add(s1);
        set.add(s2);
        set.add(s3);
        System.out.println(s1==s5);
        System.out.println(s1.equals(s5));

        System.out.println(s1.hashCode());
        System.out.println(s5.hashCode());
        System.out.println(set);
    }

}
