package stategy.payment;


public class KakaoPayment implements PaymentStrategy {

    @Override
    public void pay(int amount) {
        System.out.println("카카오 페이로 결제합니다 결제할 금액은 " + amount + "원 입니다.");
    }
}
