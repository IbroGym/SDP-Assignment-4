package BehavioralPatterns2.Strategy.WithPattern;

public class Order {
    private PaymentStrategy paymentStrategy;

    public Order(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public double processOrder(double amount) {
        return paymentStrategy.calculateTotal(amount);
    }
}
