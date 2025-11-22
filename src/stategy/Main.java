package stategy;

import stategy.item.Cart;
import stategy.item.Item;
import stategy.payment.KakaoPayment;
import stategy.payment.LunaPayment;
import stategy.payment.PaymentStrategy;

public class Main {

    public static void main(String[] args) {
//        Cart cart = new Cart(new KakaoPayment());
//        Cart cart = new Cart(new LunaPayment());
        Cart cart = new Cart(amount -> System.out.println("신규 페이로 결제합니다 결제 금액은 " + amount + "원 입니다."));
        cart.addItem(new Item(1000, "우유"));
        cart.addItem(new Item(5000, "시리얼"));
        cart.checkout();
    }

}
