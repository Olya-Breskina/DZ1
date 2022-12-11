package Factory;

public class Main {
    public static void main(String[] arg){
        CoffeeMachine coffeeMachine=new CoffeeMachine();
        СontrolPanel controlPanel=new СontrolPanel(coffeeMachine);
        controlPanel.start(TypeOfCoffee.AMERICANO);
    }
}
