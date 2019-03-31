package DemoCollections;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Comparator;

/**
 * public static <T> void sort(List<T> list>:将集合中元素按照默认规则排序
 *
 *
 * 注：
 * 对于自定义类型排序，必须继承重写Comparable接口
 *
 * Comparable接口排序规则:
 * 自己（this）-参数：升序；
 * 参数-（自己this）：降序;
 *
 * Comparable与Comparator的区别:
 * Comparable:自己（this）与别人(参数)比较，自己需要实现Comparable接口，重写比较方法;
 * Comparator:相当于找第三方裁判，比较两个;
 *
 */

public class Demo02Sort {
    public static void main(String[] args) {
        DemoAdd();
        DemoSort();
        DemoSort03();
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

    public static void DemoSort03()
    {
        ArrayList<Idol> list03=new ArrayList<>();
        list03.add(new Idol("w王嘉尔",20));
        list03.add(new Idol("q权志龙",40));
        list03.add(new Idol("p彭于晏",33));
        list03.add(new Idol("W吴磊",20));
        System.out.println(list03);
//        Collections.sort(list03, new Comparator<Idol>() {
//            @Override
//            public int compare(Idol o1, Idol o2) {
//                return o1.getAge()-o2.getAge();//升序排序
//            }
//        });
        Collections.sort(list03, new Comparator<Idol>() {
            @Override
            public int compare(Idol o1, Idol o2) {
                int result=o1.getAge()-o2.getAge();
                //组合排序
                if(result==0)
                {
                    result=o1.getName().charAt(0)-o2.getName().charAt(0);
                }
                return result;
            }
        });
        System.out.println(list03);
    }
}
