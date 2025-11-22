package templatePattern.payment;

public class LunaPayment extends PaymentTemplate {
    protected void doPay(int amount) {
        System.out.println("Luna processing: " + amount);
    }
}