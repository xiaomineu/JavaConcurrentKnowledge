package Exception;

/**
 * 父子类异常
 *      1.父类抛出多个异常，子类重写父类方法时，抛出和父类相同的异常或者是父类异常的子类或者不抛出
 *      2.父类方法没有抛出异常，子类重写父类方法时也可不抛出异常。子类产生该异常，只能捕获，不能抛出
 *
 *  子类异常以父类异常保持一致
 */

public class Fu {
    public void show01()throws NullPointerException,ClassCastException{}
    public void show02()throws IndexOutOfBoundsException{}
    public void show03()throws IndexOutOfBoundsException{}
    public void show04()throws Exception{}
}


class Zi extends Fu{
    //子类重写父类方法时，抛出与父类相同的异常
    public void show01()throws NullPointerException,ClassCastException{}
    //子类重写父类方法时，抛出与父类异常的子类
    public void show02() throws ArrayIndexOutOfBoundsException{}
    //子类重写父类方法时，不抛出异常
    public void show03(){}

    public void show04()
    {
        try{
            throw new Exception("编译期异常");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

}
