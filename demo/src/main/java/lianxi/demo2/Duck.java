package lianxi.demo2;

public class Duck extends Animal {


    public Duck(String head, String foot) {
        this.head=head;
        this.foot=foot;
    }

    public void eat(){
        System.out.println("吃水果");
    }
    public void run(){
        System.out.println("两条腿跑");
    }

}
