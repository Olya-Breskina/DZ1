package factory;

public class Main {
    public static void main(String[] arg){
        CoffeeMachineFactory coffeeMachineFactory =new CoffeeMachineFactory();
        СontrolPanel controlPanel=new СontrolPanel(coffeeMachineFactory);
        controlPanel.start(TypeOfCoffee.AMERICANO);
    }
}
