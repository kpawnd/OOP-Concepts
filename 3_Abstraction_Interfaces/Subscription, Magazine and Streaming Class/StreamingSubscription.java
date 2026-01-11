public class StreamingSubscription extends Subscription {
    public StreamingSubscription(String subscriptionId, String subscriberName, double baseFee) {
        super(subscriptionId,subscriberName,baseFee);
    }

    @Override
    public double calculateFee() {
        return baseFee + 100;
    }
}