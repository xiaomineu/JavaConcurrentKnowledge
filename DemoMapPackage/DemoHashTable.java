package DemoMapPackage;


import java.util.HashMap;
import java.util.Hashtable;

/**
 * HashTable:底层为哈希表，为线程安全集合，是单线程集合，速度慢;
 * HashMap:底层为哈希表，为线程不安全集合，为多线程集合，速度快;
 *
 * HashMap可以存储null值，null键
 * HashTable:不可以存储null值
 *
 * Hashtable的子类:Properties依然被经常使用，该集合是唯一一个与IO流相结合的集合;
 */
public class DemoHashTable {
    public static void main(String[] args) {
        HashMap<String,String >map=new HashMap<>();
        map.put(null,"a");
        map.put(null,null);
        map.put("b",null);
        System.out.println(map);

//        Hashtable<String,String >table=new Hashtable<>();
//        table.put(null,null);
//        System.out.println(table);


    }
}
