package cn.Test.Junit.itcast;

import cn.itcast.junit.Calculate;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculateTest {

    /**
     * 初始化方法
     * 用于自愿申请，所有测试方法在执行之前都会执行该方法
     */
    @Before
    public void init()
    {
        System.out.println("init.....");
    }

    /**
     * 释放资源
     * 在所有测试方法执行之后，都会自动执行该方法
     */
    @After
    public void close()
    {
        System.out.println("close....");
    }

    /**
     * 添加测试方法
     */
    @Test
    public void testAdd()
    {
        Calculate cal=new Calculate();

        int result=cal.add(1,2);

        //设置断言
        Assert.assertEquals(3,result);
    }
}
