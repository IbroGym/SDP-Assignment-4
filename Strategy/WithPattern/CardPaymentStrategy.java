package BehavioralPatterns2.Strategy.WithPattern;

public class CardPaymentStrategy implements PaymentStrategy {
    @Override
    public double calculateTotal(double amount) {
        return amount + (amount * 0.02);
    }
}
