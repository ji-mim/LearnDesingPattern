package templatePattern.payment;

public abstract class PaymentTemplate {

    public final void pay(int amount) {
        validate();
        doPay(amount);   // ✅ 바뀌는 부분
        sendReceipt();
    }

    protected abstract void doPay(int amount);

    private void validate() {
        System.out.println("결제 방식을 검증합니다.");
    }
    private void sendReceipt() {
        System.out.println("영수증을 출력합니다.");
    }
}