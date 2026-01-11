public class PaymentReceipt implements Payable {
    private Subscription subscription;
    private double serviceFee;

    public PaymentReceipt(Subscription subscription, double serviceFee) {
        this.subscription = subscription;
        this.serviceFee = serviceFee;
    }

    @Override
    public double calculateTotalPayment() {
        return subscription.calculateFee() + serviceFee;
    }
}