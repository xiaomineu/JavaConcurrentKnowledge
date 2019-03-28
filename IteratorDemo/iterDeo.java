package IteratorDemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class iterDeo {
    public static void main(String[] args) {
        Collection<String> coll=new ArrayList<>();
        coll.add("Kobe");
        coll.add("James");
        coll.add("Jordan");
        coll.add("Iversion");
        //获取迭代器
        Iterator<String> iterator=coll.iterator();
        //使用迭代器方法hasNext()判断是否还有下一个元素
        while(iterator.hasNext())
        {
            System.out.println(iterator.next());//获取下一个元素;
        }
    }
}
