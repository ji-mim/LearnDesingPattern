package templatePattern;

import templatePattern.item.Cart;
import templatePattern.item.Item;
import templatePattern.payment.KakaoPayment;
import templatePattern.payment.LunaPayment;
import templatePattern.payment.PaymentTemplate;

public class Main {

    public static void main(String[] args) {
//        Cart cart = new Cart(new KakaoPayment());
//        Cart cart = new Cart(new LunaPayment());
        Cart cart = new Cart(new PaymentTemplate() {
            @Override
            protected void doPay(int amount) {
                System.out.println("신규 페이로 결제합니다 결제 금액은 " + amount + "원 입니다.");
            }
        });
        cart.addItem(new Item(1000, "우유"));
        cart.addItem(new Item(5000, "시리얼"));
        cart.checkout();
    }

}
