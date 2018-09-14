package lianxi.demo;


import java.lang.reflect.*;
//访问构造，成员，方法
class Person{
    //成员变量
    private String name;
    private int age;
    //无参构造
    public Person(){

    }
    //普通方法
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
    //构造方法
    public Person(String name, int age){
        this.name=name;
        this.age=age;
    }
    public String toString(){
        return "姓名:"+name+",年龄:"+age+"岁";
    }
}




public class Test {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
        Class<?> c =Class.forName("lianxi.demo.Person");//得到类
        System.out.println("类:"+c);
        System.out.println("-----------------构造方法---------------------------");
        Constructor<?> con =c.getConstructor(String.class,int.class);//得到构造方法
        Person p =(Person)con.newInstance("小黑",18);//相当于调用构造方法
        System.out.println("p:"+p);



        System.out.println("-----------------普通方法---------------------------");
        Object o =c.newInstance();//得到无参构造方法
        System.out.println("o:"+o);
        Method ms[]=c.getMethods();//得到所有方法
        for(Method methodName : ms){
            System.out.println(methodName);
        }
        Method set =c.getMethod("setName", String.class);
        set.invoke(o,"小白");//调用了book对象.setName("小白")
        Method get = c.getMethod("getName");
        Object n =get.invoke(o);
        System.out.println(o);



        System.out.println("-----------------成员变量---------------------------");
        Field fs[]=c.getDeclaredFields();//得到所有声明字段(属性)
        for (Field f:fs){
            System.out.println(f);
        }
        Field f = c.getDeclaredField("name");//获得name属性
        System.out.println("f:"+f);
        f.setAccessible(true);//解除私有
        f.set(o,"小黄");
        Object oname =f.get(o);
        System.out.println("oname:"+oname);
    }
}

