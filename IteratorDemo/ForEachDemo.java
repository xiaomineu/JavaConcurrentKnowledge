package IteratorDemo;

import java.util.ArrayList;

public class ForEachDemo {
    public static void main(String[] args) {
        demo2();
    }
    public static void demo2()
    {
        ArrayList<String> col=new ArrayList<>();
        col.add("奔驰");
        col.add("沃尔沃");
        col.add("奥迪");
        col.add("宝马");
        col.add("兰博基尼");
        col.add("法拉利");
        for(String s:col)
        {
            System.out.println(s);
        }
    }
}
