package lianxi.demo2;

public class Dog extends Animal {
    public Dog(String head, String foot) {
        this.head=head;
        this.foot=foot;
    }

    public void eat(){
        System.out.println("吃肉");
    }
    public void run(){
        System.out.println("四条腿跑");
    }

}