package Exception;

/**
 * 自定义异常类:
 *      1.以Exception结尾，表示该类是一个异常类
 *      2.自定义异常类，必须继承Exception或者RuntimeException
 *          继承Exception,表示该异常类是编译期异常，方法内部抛出编译期异常，必须处理异常，throws或者try...catch
 *          继承RuntimeException:自定义类异常为运行期异常，无需处理，交由虚拟机处理
 *
 *  格式：
 *      public class ***Exception extends Exception|RuntimeException{}
 */

public class RegisterException extends RuntimeException{
    //构造方法
    public RegisterException(){
        super();
    }
    //添加带异常信息的构造方法
    public RegisterException(String message)
    {
        super(message);
    }

}
