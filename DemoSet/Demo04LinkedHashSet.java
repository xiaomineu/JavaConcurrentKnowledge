package DemoSet;

import java.util.HashSet;
import java.util.LinkedHashSet;


/**
 * java.util.LinkedHashSet集合 extends HashSet集合
 * LinkedHashSet集合特点:
 *  底层是一个哈希表（数组+链表/红黑树)+链表：链表记录元素存储顺序，保证元素有序
 *
 */
public class Demo04LinkedHashSet {
    public static void main(String[] args) {
        HashSet<String> set=new HashSet<>();
        set.add("WWW");
        set.add("abc");
        set.add("itcast");
        System.out.println(set);//无序，不允许重复;

        LinkedHashSet<String> linked=new LinkedHashSet<>();
        linked.add("www");
        linked.add("abc");
        linked.add("abc");
        linked.add("itcast");
        System.out.println(linked);
    }
}
