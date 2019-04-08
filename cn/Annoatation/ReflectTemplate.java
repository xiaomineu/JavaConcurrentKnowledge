package cn.Annoatation;


import java.lang.reflect.Method;

@Properfile(className = "cn.Annoatation.DemoClass",classMethod = "show")
public class ReflectTemplate {
    public static void main(String[] args)throws Exception {
        /**
         * 创建任意类对象，执行任意方法
         */

        /*
        解析注解
        获取该类字节码文件对象
         */
        Class<ReflectTemplate> reflectTemplateClass=ReflectTemplate.class;
        /*
        获取注解对象
        其实就是在内存中生成了一个该注解接口的子类实现对象

        public class ProImpl implements Properfile{
            public String className()
            {
                return "cn.Annoatation.DemoClass";
            }
            public String classMethod()
            {
                return "show"
            }
        }
         */
        Properfile pro=reflectTemplateClass.getAnnotation(Properfile.class);
        //调用注解对象中定义的抽象方法，获取返回值
        String className=pro.className();
        String classMethod=pro.classMethod();

        //加载类至内存
        Class cla=Class.forName(className);

        //创建对象
        Object obj=cla.newInstance();

        //获取对象方法
        Method method=cla.getMethod(classMethod);

        method.invoke(obj);

    }
}
