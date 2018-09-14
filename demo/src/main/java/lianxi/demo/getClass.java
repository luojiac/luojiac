package lianxi.demo;

import java.util.Date;

public class getClass {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
//        Date d =new Date();
//        Class<?> c =d.getClass();
//        System.out.println("c:"+c);

//        Class<?> a =Date.class;
//        System.out.println("a:"+a);
//
        Class<?> b = Class.forName("java.util.Date");
        System.out.println("b:"+b);


    }
}
