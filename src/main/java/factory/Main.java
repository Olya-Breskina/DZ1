package factory;

public class Main {
    public static void main(String[] arg){
        CoffeeMachineFactory coffeeMachineFactory =new CoffeeMachineFactory();
        –°ontrolPanel controlPanel=new –°ontrolPanel(coffeeMachineFactory);
        controlPanel.start(TypeOfCoffee.AMERICANO);
    }
}
