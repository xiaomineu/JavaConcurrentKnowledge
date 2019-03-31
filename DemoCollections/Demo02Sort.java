package DemoCollections;

import java.util.ArrayList;

import java.util.Collections;

public class Demo02Sort {
    public static void main(String[] args) {
        DemoAdd();
    }

    public static void DemoAdd()
    {
        ArrayList<Integer> list=new ArrayList<>();
        Collections.addAll(list,1,2,3,4,5,6,7,8,9);
        System.out.println(list);
        Collections.shuffle(list);
        System.out.println(list);
    }
}
