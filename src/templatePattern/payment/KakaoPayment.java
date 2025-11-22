package templatePattern.payment;

public class KakaoPayment extends PaymentTemplate {
    protected void doPay(int amount) {
        System.out.println("KakaoPay processing: " + amount);
    }
}