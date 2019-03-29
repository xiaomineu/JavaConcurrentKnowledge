package DemoSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * java.util.Set extends Collection
 * Set特点:
 * 1.不允许存储重复的方法
 * 2.没有索引，没有带索引的方法，不能使用普通for循环遍历
 *
 *
 * java.util.HashSet implements Set
 *
 * HashSet 特点：
 * 1.不允许存储重复元素
 * 2.没有索引，不可使用for循环遍历
 * 3.是一个无序集合，存储元素与取出元素顺序可能不相等;
 * 4.底层是哈希表结构（查询速度非常快）
 */
public class SetTest {
    public static void main(String[] args) {
        Set<String> set=new HashSet<>();
        //添加add方法，向集合中添加元素
        set.add("b");
        set.add("a");
        set.add("c");
        set.add("a");

        //使用迭代器遍历set集合
        Iterator<String> iterator=set.iterator();
        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
        }

        System.out.println("****-----------****");

        for(String s:set)
        {
            System.out.println(s);
        }

    }

}
