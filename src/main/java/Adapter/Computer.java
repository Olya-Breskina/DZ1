package Adapter;

import sun.awt.geom.AreaOp;

public class Computer {
    public void connect(ComputerInterface computerInterface){
        System.out.println("подключен носитель информации");
        computerInterface.read();

    }
}
