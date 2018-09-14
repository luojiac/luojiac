package lianxi.demo;


interface Fruit{
    public void eat();
}
class Apple implements Fruit{
    public void eat(){
        System.out.println("吃苹果");
    }
}
class Orange implements Fruit{
    public void eat(){
        System.out.println("吃橘子");
    }
}
class Orangebad implements Fruit{
    public void eat(){
        System.out.println("吃坏橘子");
    }
}
class  Factory{
    public static Fruit getInstance(String className){
        if ("apple".equals(className)){
            return new Apple();
        }
        if("orange".equals(className)) {
            return new Orange();
        }
        return null;
    }
}


public class Test3 {
    public static void main(String[] args) {
        Fruit f =Factory.getInstance("apple");
        f.eat();
    }
}
class Factory1 {
        public static Fruit getInstance(String className) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Fruit f = (Fruit) Class.forName(className).newInstance();

        return f ;
        }
        }
class FactoryDemo {
        public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
            System.out.println("a===:"+Class.forName("lianxi.demo.Orangebad"));
            Fruit f = Factory1.getInstance("lianxi.demo.Orangebad") ;
            f.eat() ;
        }
        }


