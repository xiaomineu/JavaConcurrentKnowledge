package cn.Demo;

/*
测试框架
 */

import cn.Demo.Calculator;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.lang.reflect.Method;

public class DemoTest {
    public static void main(String[] args) throws Exception{
        //创建计算器对象
        Calculator calculate=new Calculator();
        //获取字节码文件对象
        Class cla=calculate.getClass();
        //获取所有方法
        Method[] methods=cla.getMethods();

        int number=0;//出现异常次数
        //使用字符缓冲输出流写日志
        BufferedWriter bufferedWriter=new BufferedWriter(new FileWriter("log.txt"));

        //判断方法上是否有Check注解
        for(Method method:methods)
        {
            if(method.isAnnotationPresent(Check.class))
            {
                try{
                    method.invoke(calculate);
                }catch (Exception e)
                {
                    //捕获异常
                    number++;
                    bufferedWriter.write(method.getName()+" 方法出错了");
                    bufferedWriter.newLine();
                    bufferedWriter.write("异常名称："+e.getCause().getClass().getSimpleName());
                    bufferedWriter.newLine();
                    bufferedWriter.write("************");
                    bufferedWriter.newLine();
                }

            }
        }
        bufferedWriter.write("本次测试一共出现"+number+"次异常");
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
