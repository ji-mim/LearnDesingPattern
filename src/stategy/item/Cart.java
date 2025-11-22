package stategy.item;

import java.util.ArrayList;
import java.util.List;
import stategy.payment.PaymentStrategy;

public class Cart {

    private final PaymentStrategy strategy;
    private List<Item> itemList = new ArrayList<>();
    private int amount;

    public Cart(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public int getAmount() {
        for (Item item : itemList) {
            amount += item.getPrice();
        }
        return amount;
    }

    public void addItem(Item item) {
        this.itemList.add(item);
    }

    public void checkout() {
        strategy.pay(getAmount());
    }
}
