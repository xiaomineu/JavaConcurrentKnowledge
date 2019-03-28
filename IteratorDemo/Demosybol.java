package IteratorDemo;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 泛型的上限限定：？ extends E 代表使用泛型只能是E类型的子类、本身;
 *泛型的下限限定：？super E 代表使用的泛型只能是E类型的父类,本身;
 */
public class Demosybol {
    public static void main(String[] args) {
        Collection<Integer> listInt=new ArrayList<>();
        Collection<String> listString=new ArrayList<>();
        Collection<Number> listNumber=new ArrayList<>();
        Collection<Object> listObject=new ArrayList<>();

        getElements1(listInt);
        getElements1(listString);//报错
        getElements1(listNumber);
        getElements1(listObject);//报错



        getElements2(listInt);//报错
        getElements2(listString);//报错
        getElements2(listNumber);
        getElements2(listObject);

        /**
         * 类与类之间的继承关系
         * Integer extends Number extends Object
         * String extends Object
         */


    }

    //泛型上限，此时的泛型？，必须是Number类型或者Number类型的子类
    public static void getElements1(Collection<? extends Number> coll){}

    //泛型下限，此时的类型?,必须是Number类型或者Number类型的父类
    public static void getElements2(Collection<? super Number> coll){}
}
