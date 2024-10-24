package BehavioralPatterns2.Strategy.WithPattern;

public class WalletPaymentStrategy implements PaymentStrategy {
    @Override
    public double calculateTotal(double amount) {
        return amount;
    }
}
