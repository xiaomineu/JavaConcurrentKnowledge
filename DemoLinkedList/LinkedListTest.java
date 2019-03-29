package DemoLinkedList;

import java.util.LinkedList;

/**
 * java.util.LinkedList implements List接口
 * LinkedList 特点：
 *  1.底层为链表，查询慢，增删快;
 *  2.集合中有大量操作首尾元素的方法;
 *  3.LinkedList中特有方法时，不可使用多态；
 *
 *
 *  方法介绍：
 *  public void addFirst(E e):将指定元素插入此列表的开头
 *  public void addLast(E e):将指定元素添加到此列表的结尾
 *  public E getFirst():返回此列表的第一个元素
 *  public E getLast():返回此列表的最后一个元素
 *  public E removeFirst():移除并返回此列表的第一个元素
 *  public E removeLast():移除并返回此列表的最后一个元素
 *  public E pop():从此列表中表示的堆栈弹出一个元素
 *  public void push(E e):将元素推入此列表所表示的堆栈
 *  public boolean isEmpty();如果列表不包含元素，则返回true
 */


public class LinkedListTest {
    public static void main(String[] args) {
        show03();
    }


    private static void show03()
    {
        //创建LinkedList集合对象
        LinkedList<String> linked=new LinkedList<>();
        //使用add方法添加元素
        linked.add("a");
        linked.add("b");
        linked.add("c");

        String first=linked.removeFirst();
        String last=linked.removeLast();
        System.out.println(linked);
    }

    private static void show02()
    {
        //创建LinkedList集合对象
        LinkedList<String> linked=new LinkedList<>();
        //使用add方法添加元素
        linked.add("a");
        linked.add("b");
        linked.add("c");

        linked.clear();//清空集合中元素，之后获取结合中的元素会抛出NoSuchElementException

        //使用isEmpty()方法;
        if(linked.isEmpty())
        {
            return;
        }

        //使用get方法获取元素
        String first=linked.getFirst();
        System.out.println(first);

    }

    private static void show01()
    {
        //创建LinkedList集合对象
        LinkedList<String> linked=new LinkedList<>();
        //使用add方法添加元素
        linked.add("a");
        linked.add("b");
        linked.add("c");
        System.out.println("使用add方法"+linked);
        //linked.addFirst("www");
        linked.push("www");
        System.out.println("使用addFirst方法"+linked);
        linked.addLast("com");
        System.out.println("使用addLast方法"+linked);
    }
}
