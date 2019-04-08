package cn.Annoatation;

/**
 * JDK中预定义的注解
 * @Override:检测被该注解标注的方法是否是继承自父类（接口）的
 * @Deprected:该注解标注的内容，表示已过时
 * @SuppressWarnings:压制警告
 */

public class DemoAnnoatation01 {
    @Override
    public String toString() {
        return super.toString();
    }

    @Deprecated
    public void show01()
    {
        //有缺陷
    }
    public void show02()
    {
        //替代show01()方法
    }

    public void Demo()
    {
        show01();//表示该方法过时，但是仍可以继续使用，有利于兼容低版本
    }

    /**
     * 自定义注解
     * 格式：
     *      元注解
     *      public @interface 注解名称
     *
     * 本质：注解本质上就是一个接口，该接口默认继承Annotation接口
     *      public interface 注解名称 extends java.annotation.Annotation{}
     *
     * 属性：
     *      要求：
     *          1.属性的返回值类型有下列取值
     *            基本数据类型
     *            String
     *            枚举
     *            注解
     *            以上类型的数组
     *          2.定义了属性，在使用时需要进行对属性赋值
     *              1.如果定义了属性，使用default关键字给属性默认初始化值，使用注解时，可以不进行属性的赋值
     *              2.如果只有一个属性需要赋值，并且属性名称是value,则value可以省略，直接定义即可
     *              3.数组赋值时，值使用{}包裹
     *
     *
     *  元注解：用于描述注解的注解
     * @Target:描述注解能够作用的位置
     * @Retention:描述注解被保留的阶段
     * @Documented:描述注解能否被抽取到api文档中
     * @Inherited:描述注解能否被子类继承
     */
}
