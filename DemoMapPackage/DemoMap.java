package DemoMapPackage;

import java.util.HashMap;
import java.util.Map;

/**
 * java.util.Map<K,V>集合;
 * Map集合特点：
 *      1.Map为双列集合，一个元素包含两个值；
 *      2.Map集合元素中，key与value类型不一定相同;
 *      3.Map集合中，key与value是一一对应的;
 *      4.key值唯一;
 *
 *      HashMap<K,T> implements Map<K,T>接口;
 *      1.底层实现为哈希表；
 *      JDK1.8之前：数组+单向链表;
 *      JDK1.9之前，数组+单向链表/红黑树(链表长度超过8)
 *      2.HashMap集合为无序集合，存储元素与取出元素顺序可能不一致;
 *
 *      LinkedHashMap<K,V> extends HashMap<K,V>
 *      1.LinkedHashMap底层为哈希表+链表;
 *      2.有序集合，存储元素与取出元素顺序一致;
 */
public class DemoMap {
    public static void main(String[] args) {
        show01();
        show02();
        show03();
        show04();
    }

    /**
     * public V put(K key,V value):将指定的键与指定的值添加到Map集合中
     * 返回：V
     *      1.存储键值对时，key不重复，返回值为null;
     *      2.存储键值对时，key重复，会使用新的value替换map中重复的value,返回被替换value值;
     */
    public static void show01()
    {
        Map<String,String> map=new HashMap<>();
        String v1=map.put("James","Lackers");
        System.out.println(v1);
        String v2=map.put("James","Hot");
        System.out.println(v2);
        System.out.println(map);
        map.put("Kobe","Lackers");
        map.put("Harden","Rocket");
        map.put("Curry","Worries");
        System.out.println(map);
    }

    /**
     * public V remove(Object key):把指定的键 所对应的键值对元素 在Map集合中删除，返回被删除元素的值;
     * 返回值:V
     *      key存在，v返回被删除的值;
     *      key不存在，v返回null;
     */

    public static void show02()
    {
        Map<String,String>map=new HashMap<>();
        map.put("Kobe","Lackers");
        map.put("Harden","Rocket");
        map.put("Curry","Worries");
        System.out.println(map);
        String str=map.remove("Kobe");
        System.out.println(str);
        System.out.println(map);
    }

    /**
     *public V get(Object key)根据指定的键，在Map集合中获取对应的值;
     * 返回值：
     *      key存在，返回对应的value值；
     *      key不存在，返回null;
     */

    public static void show03()
    {
        //
        Map<String,String>map=new HashMap<>();
        map.put("Kobe","Lackers");
        map.put("Harden","Rocket");
        map.put("Curry","Worries");
        String str=map.get("Kobe");
        System.out.println(str);
        str=map.get("James");
        System.out.println(str);
    }

    /**
     * boolean containsKey(Object key)判断集合是否包含指定的键.
     * 包含返回true,不包含返回false;
     */

    public static void show04()
    {
        Map<String,String>map=new HashMap<>();
        map.put("Kobe","Lackers");
        map.put("Harden","Rocket");
        map.put("Curry","Worries");

        System.out.println(map.containsKey("Kobe"));
        System.out.println(map.containsKey("kobe"));
    }
}
