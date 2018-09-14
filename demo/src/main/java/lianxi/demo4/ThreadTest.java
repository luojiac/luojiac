package lianxi.demo4;

public class ThreadTest implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "正在运行");
    }

    public static void main(String[] args) {
        TicketThreadR ticketThread = new TicketThreadR();
    }
}
