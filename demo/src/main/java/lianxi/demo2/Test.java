package lianxi.demo2;


import java.awt.*;

public class Test {


    public static void main(String[] args) {


//        Color c=new Color();
        Animal[] animals = new Animal[3];
        animals[0]=new Cat("twohead","twofoods");
        animals[1]=new Dog("twohead","twofoods");
        animals[2]=new Cat("twohead","twofoods");

        for (Animal animal : animals) {
            animal.eat();
            animal.run();
            System.out.println(animal);
        }
    }
}
