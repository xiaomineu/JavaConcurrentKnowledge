package cn.Reflect;

public class Person {
    private int a;
    private int b;
    private int c;
    public String d;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String name;
    private int age;

    public Person() {
    }

    public Person(int a, int b, int c, String d, String name, int age) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", d='" + d + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public String getD() {
        return d;
    }

    public void setD(String d) {
        this.d = d;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void eat()
    {
        System.out.println("Eat...");
    }

    public void eat(String string)
    {
        System.out.println("Eat..."+string);
    }
}
