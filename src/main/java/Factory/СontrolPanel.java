package Factory;

public class СontrolPanel {
    private CoffeeMachine coffeeMachine;
    public СontrolPanel (CoffeeMachine coffeeMachine){
        this.coffeeMachine=coffeeMachine;
    }
    public void start(TypeOfCoffee typeOfCoffee){
        CoffeeMachine coffeeMachine=new CoffeeMachine();
        Coffee coffee=CoffeeInCoffeeMachine.getCoffee(typeOfCoffee);
        addWater(coffee.amountOfWater());


    }
    private void addWater(int amountOfWater){
        System.out.println("на одну часть кофе добавлено "+ amountOfWater +" части воды");
    }

}
