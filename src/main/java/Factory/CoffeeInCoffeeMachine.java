package Factory;

public class CoffeeInCoffeeMachine {

    public static Coffee getCoffee(TypeOfCoffee typeOfCoffee){
         Coffee coffee ;
        switch (typeOfCoffee){
            case ESPRESSO:coffee= new Espresso(); break;
            case AMERICANO:coffee=new Americano();break;
            default: throw new IllegalArgumentException("выберите кофе");
        }
        return coffee;
    }
}
