package lianxi.demo2;

public class Cat extends Animal {
    public Cat(String  head, String foot) {
        this.head=head;
        this.foot=foot;

    }

    public void eat(){
        System.out.println("吃猫粮");
    }
    public void run(){
        System.out.println("两条腿跑");
    }

}