package lianxi.demo2;

public class Animal {
    public String head;
    public String foot;
    public Animal(String head,String foot){
     this.head=head;
     this.foot=foot;
    }

    public Animal() {

    }

    @Override
    public String toString() {
        return "animal="+head+","+foot;
    }

    public void eat(){
        System.out.println("吃东西");
    }
    public void run(){
        System.out.println("快跑");
    }

}
