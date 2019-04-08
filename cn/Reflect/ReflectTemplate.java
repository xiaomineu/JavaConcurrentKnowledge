package cn.Reflect;

import java.io.InputStream;
import java.util.Properties;
import java.lang.reflect.Method;

public class ReflectTemplate {
    public static void main(String[] args)throws Exception {
        /**
         * 创建任意类对象，执行任意方法
         */

        //1.加载配置文件
        //创建Properties对象
        Properties properties=new Properties();

        //加载配置文件，转换为一个集合
        //获取class目录下的配置文件
        ClassLoader classLoader=ReflectTemplate.class.getClassLoader();//获取类加载器,将类加载进内存
        InputStream inputStream=classLoader.getResourceAsStream("cn//pro.properties");//使用类加载器加载配置文件
        properties.load(inputStream);

        //获取配置文件中定义的数据
        String className=properties.getProperty("className");
        String methodName=properties.getProperty("methodName");

        //加载该类的内存
        Class cla=Class.forName(className);
        //创建对象
        Object obj=cla.newInstance();
        //获取方法对象
        Method method=cla.getMethod(methodName);
        //执行方法
        method.invoke(obj);
    }
}
