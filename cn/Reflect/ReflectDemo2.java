package cn.Reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Class对象功能
 *      获取功能：
 *          1.获取成员变量
 *          Field[] getFields()
 *          Field[] getField(String name)
 *          Field[] getDeclaredFields()
 *          Field[] getDeclaredField(String name)
 */

public class ReflectDemo2 {
    public static void main(String[] args) throws Exception{

        show03();

    }

    private static void show01()throws Exception
    {
        Class person=Person.class;//获取Person的Class对象

        /**
         * 获取成员变量
         */

        //Field[] getFields()获取所有public修饰的成员变量
        Field[] fields=person.getFields();
        for(Field field:fields)
        {
            System.out.println(field);
        }
        //Field getField(String name),只能获取public修饰成员变量
        Field d=person.getField("d");

        //获取成员变量a的值
        Person per=new Person();
        Object value=d.get(per);
        System.out.println(value);

        //设置d的值
        d.set(per,"zhangmin");

        System.out.println("***************");

        //Field[] getDeclaredFields():获取所有的成员变量，不考虑修饰符

        Field[] declaredFields=person.getDeclaredFields();
        for(Field declaredField:declaredFields)
        {
            System.out.println(declaredField);
        }

        //Field getDeclaredField(String name)
        Field declared=person.getDeclaredField("a");
        //忽略权限修饰符的安全检查
        declared.setAccessible(true);//暴力反射

        Object vlaue2=declared.get(per);
        System.out.println(vlaue2);
    }

    private static void show02()throws Exception
    {
        Class personClass=Person.class;

        /**
         * 获取构造方法
         */
        Constructor constructor=personClass.getConstructor(String.class,int.class);
        System.out.println(constructor);

        //使用构造器创建对象
        Object person=constructor.newInstance("Kobe",38);
        System.out.println(person);

        System.out.println("*************");
        //使用空参创建对象，可以使用Class类中默认的newInstance方法
        Object person1=personClass.newInstance();
        System.out.println(person1);
    }


    private static void show03()throws Exception
    {
        //获取成员方法
        Class personClass=Person.class;

        //获取成员方法，需指定成员方法名以及参数列表
        Method eatMethod=personClass.getMethod("eat",String.class);

        Method eatMethod01=personClass.getMethod("eat");


        //执行方法，需要实例化对象
        Person person=new Person();
        eatMethod.invoke(person,"banana");

        eatMethod01.invoke(person);

        Method[] methods=personClass.getMethods();
        //遍历成员方法列表，会得到Object类的成员方法（继承关系）
        for(Method method:methods)
        {
            System.out.println(method);
        }
    }
}
