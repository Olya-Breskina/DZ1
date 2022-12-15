package factory;

public class СontrolPanel {
    private CoffeeMachineFactory coffeeMachineFactory;
    public СontrolPanel (CoffeeMachineFactory coffeeMachineFactory){
        this.coffeeMachineFactory = coffeeMachineFactory;
    }
    public void start(TypeOfCoffee typeOfCoffee){
        CoffeeMachineFactory coffeeMachineFactory =new CoffeeMachineFactory();
        Coffee coffee=CoffeeInCoffeeMachine.getCoffee(typeOfCoffee);
        addWater(coffee.amountOfWater());


    }
    private void addWater(int amountOfWater){
        System.out.println("на одну часть кофе добавлено "+ amountOfWater +" части воды");
    }

}
