package lianxi.demo4;

public class ThreadTestDrive {
    public static void main(String[] args) {

        Runnable thread = new MyRunnable();
        Thread myThread =new Thread(thread);
        Thread myThreadt =new Thread(thread);
        myThread.start();
        myThreadt.start();
        new MyThread().start();


        System.out.println("111");
        System.out.println(myThread+"存活状态："+myThread.isAlive());


    }

}
