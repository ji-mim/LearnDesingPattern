import factoryPattern.Coffee;
import factoryPattern.CoffeeFactory;

public class Main {

    public static void main(String[] args) {
        Coffee latte = CoffeeFactory.getCoffee("Latte", 4000);
        Coffee ame = CoffeeFactory.getCoffee("Americano",3000);
        System.out.println("Factory latte ::"+latte);
        System.out.println("Factory ame ::"+ame);
    }
}