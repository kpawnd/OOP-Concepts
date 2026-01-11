public abstract class Subscription {
    protected String subscriptionId, subscriberName;
    protected double baseFee;

    public Subscription(String subID, String subName, double baseF) {
        this.subscriptionId = subID;
        this.subscriberName = subName;
        this.baseFee = baseF;
    }

    public abstract double calculateFee();
}