public class MagazineSubscription extends Subscription {
    public MagazineSubscription(String subscriptionId, String subscriberName, double baseFee) {
        super(subscriptionId,subscriberName,baseFee);
    }

    @Override
    public double calculateFee() {
        return baseFee + 20;
    }
}