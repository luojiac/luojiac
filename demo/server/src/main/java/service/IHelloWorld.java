package service;

import org.oasisopen.sca.annotation.Remotable;

@Remotable
public interface IHelloWorld {
    String sayHello(String world);
}