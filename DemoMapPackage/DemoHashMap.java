package DemoMapPackage;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DemoHashMap {
    public static void main(String[] args) {
        show01();
    }

    /**
     * HashMap存储自定义键值
     * Map集合保证Key唯一：
     *      作为key元素，需重写hashCode与equals方法，保证key唯一;
     */
    public static void show01()
    {
        HashMap<Person,String> map=new HashMap<>();
        map.put(new Person("James",38),"Basketball");
        map.put(new Person("Messi",38),"Football");
        map.put(new Person("Peter",38),"Movie");
        map.put(new Person("Jackson",38),"Singer");
        Set<Map.Entry<Person,String>>set=map.entrySet();
        for(Map.Entry<Person,String>entry:set)
        {
            Person person=entry.getKey();
            String job=entry.getValue();

            System.out.println(person.getName()+"--->"+job);
        }
    }
}
