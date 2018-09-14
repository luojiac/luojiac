package lianxi.demo;

import java.lang.reflect.InvocationTargetException;

public class Tset2 {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException {
        Class<?> c =Class.forName("lianxi.demo.Person1");
        Object o =c.newInstance();//调用构造方法 适用于无参构造方法
//        System.out.println("o:"+o);
        Object a =c.getConstructor().newInstance();//获得构造器 适用于无参和有参构造方法。
//
        System.out.println("a:"+a);
//        在初始化一个类，生成一个实例的时候；newInstance() 和 new 有什么区别?
//        newInstance: 弱类型。低效率。只能调用无参构造。
//        new: 强类型。相对高效。能调用任何public构造。
//        newInstance()是实现IOC、反射、面对接口编程 和 依赖倒置 等技术方法的必然选择，new 只能实现具体类的实例化，不适合于接口编程。
    }
}
