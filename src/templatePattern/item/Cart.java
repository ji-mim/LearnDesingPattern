package templatePattern.item;

import java.util.ArrayList;
import java.util.List;
import templatePattern.payment.PaymentTemplate;

public class Cart {

    private final PaymentTemplate template;
    private List<Item> itemList = new ArrayList<>();
    private int amount;

    public Cart(PaymentTemplate template) {
        this.template = template;
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
        template.pay(getAmount());
    }
}
