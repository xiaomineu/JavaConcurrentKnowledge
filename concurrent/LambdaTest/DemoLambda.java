package concurrent.LambdaTest;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Lambda表达式格式:
 *      1.参数
 *      2.一个箭头
 *      3.代码
 *   格式
 *      （参数列表)->{一些重写方法代码};
 *      ()：接口中抽象方法的参数列表，无参数时为空;有参数时，列出参数，多个参数间使用逗号分隔;
 *      ->:传递，将参数传递给方法体；
 *      {}：重写接口的抽象方法的方法体
 */

public class DemoLambda {
    public static void main(String[] args) {
        //使用Lambda表达式，实现多线程;
        new Thread(()->{
            System.out.println(Thread.currentThread().getName()+"被创建");
        }).start();


        //定义厨子接口，使用Lambda重写抽象方法;
        ivokeCook(()->{
            System.out.println("制作食物");
        });

        //使用Lambda对数组进行排序
        Person[] arr={
                new Person("杨幂",37),
                new Person("古力娜扎",29),
                new Person("迪丽热巴",28)
        };

//        Arrays.sort(arr, new Comparator<Person>() {
//            @Override
//            public int compare(Person o1, Person o2) {
//                return o1.getAge()-o2.getAge();
//            }
//        });

        Arrays.sort(arr,(Person o1,Person o2)->{
            return o1.getAge()-o2.getAge();
        });
        for (Person person : arr) {
            System.out.println(person);
        }

        ivokeCalculate(100,122,(int a,int b)->{
            return a+b;
        });
    }
    public static int ivokeCalculate(int num1,int num2,Calculate calculate)
    {
        int sum=calculate.add(num1,num2);
        System.out.println(sum);
        return sum;
    }

    public static void ivokeCook(Cook cook)
    {
        cook.makeFood();
    }
}
