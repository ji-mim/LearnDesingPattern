package stategy.payment;

public class LunaPayment implements PaymentStrategy{

    @Override
    public void pay(int amount) {
        System.out.println("루나 페이로 결제합니다 결제할 금액은 " + amount + "원 입니다.");
    }
}
