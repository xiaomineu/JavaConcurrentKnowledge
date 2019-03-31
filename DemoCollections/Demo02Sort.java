package DemoCollections;

import java.util.ArrayList;

import java.util.Collections;

/**
 * public static <T> void sort(List<T> list>:将集合中元素按照默认规则排序
 *
 *
 * 注：
 * 对于自定义类型排序，必须继承重写Comparable接口
 */

public class Demo02Sort {
    public static void main(String[] args) {
        DemoAdd();
        DemoSort();
    }

    public static void DemoAdd()
    {
        ArrayList<Integer> list=new ArrayList<>();
        Collections.addAll(list,1,2,3,4,5,6,7,8,9);
        System.out.println(list);
        Collections.shuffle(list);
        System.out.println(list);
    }

    //
    public static void DemoSort()
    {
        ArrayList<Integer>list01=new ArrayList<>();
        Collections.addAll(list01,3,4,2,4,55,3,45,6,65,7,4,5666,774,4545,564,356,2,2,3,4);
        Collections.sort(list01);
        System.out.println(list01);

        ArrayList<String>list02=new ArrayList<>();
        Collections.addAll(list02,"asn","sabs","assafdguaf","chinese","American","Canada","Germany","English","France");
        Collections.sort(list02);
        System.out.println(list02);

        ArrayList<Person> list03=new ArrayList<>();
        list03.add(new Person("Kobe",40));
        list03.add(new Person("James",35));
        list03.add(new Person("Curry",32));
        System.out.println(list03);
        Collections.sort(list03);
        System.out.println(list03);
    }
}
