package IteratorDemo;

import java.util.ArrayList;

import java.util.Iterator;

//通配符的使用
public class symbolTest {
    public static void main(String[] args) {
        ArrayList<String> list01=new ArrayList<>();
        ArrayList<Integer> list02=new ArrayList<>();
        list01.add("China");
        list01.add("American");
        list02.add(10);
        list02.add(20);
        printArray(list01);
        printArray(list02);
    }
    public static void printArray(ArrayList<?> arrayList)
    {
        Iterator<?> iterator=arrayList.iterator();
        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
        }

    }
}
