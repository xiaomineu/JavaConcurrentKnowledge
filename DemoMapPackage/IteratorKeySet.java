package DemoMapPackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Map集合遍历方式：
 * 1.通过键找值方式：
 *      set<K> keySet()返回此映射中包含的键的set;
 */

public class IteratorKeySet {
    public static void main(String[] args) {
        show01();
        show02();
    }
    public static void show01()
    {
        Map<String,Integer> map=new HashMap<>();
        map.put("赵丽颖",30);
        map.put("高圆圆",36);
        map.put("张柏芝",45);
        map.put("古力娜扎",29);
        Set<String>set=map.keySet();
        for(String s:set)
        {
            System.out.println(s+"="+map.get(s));
        }
        System.out.println("******************");

        Iterator<String> iterator=set.iterator();
        while(iterator.hasNext())
        {
            String key=iterator.next();
            System.out.println(key+"="+map.get(key));
        }
        System.out.println("******************");
    }

    /**
     * 使用Entry对象遍历
     * Set<Map.Entry<K,V>> entrySet() 返回此映射中包含的映射关系Set视图;存储键值对的类的实例化对象;
     * 步骤：
     *      1.使用Map集合中的方法entrySet(),将Map集合中多个Entry对象取出，存在一个Set集合中;
     *      2.遍历Set集合;
     *      3.Entry中的方法;
     */
    public static void show02()
    {
        Map<String,Integer> map=new HashMap<>();
        map.put("赵丽颖",30);
        map.put("高圆圆",36);
        map.put("张柏芝",45);
        map.put("古力娜扎",29);
        Set<Map.Entry<String,Integer>>set=map.entrySet();

        Iterator<Map.Entry<String,Integer>> iterator=set.iterator();
        while(iterator.hasNext())
        {
            Map.Entry<String,Integer> entry=iterator.next();
            String key=entry.getKey();
            Integer integer=entry.getValue();
            System.out.println(key+"="+integer);
        }
    }


}
