package DemoMapPackage;

import java.util.LinkedHashMap;

public class DemoLinkedHashMap {
    public static void main(String[] args) {
        LinkedHashMap<String,String>map=new LinkedHashMap<>();
        map.put("a","a");
        map.put("b","b");
        map.put("c","c");
        map.put("d","d");
        System.out.println(map);//LinkedHashMap中，key不允许重复，但key有映射关系;
    }
}
