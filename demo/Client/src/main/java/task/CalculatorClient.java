package task;

import service.ICalculator;
import service.IHelloWorld;

import java.rmi.Naming;

public class CalculatorClient {
    public static void main(String[] args) throws Exception{
        ICalculator c= (ICalculator) Naming.lookup("//127.0.0.1:9099/CalculatorRMIService");
        System.out.println(c.add(1, 2));

        IHelloWorld h=(IHelloWorld)Naming.lookup("//127.0.0.1:9099/HelloWorldRMIService");
        System.out.println(h.sayHello("spring"));
    }
}