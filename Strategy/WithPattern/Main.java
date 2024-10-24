package BehavioralPatterns2.Strategy.WithPattern;

public class Main {
    public static void main(String[] args) {
        Order cardOrder = new Order(new CardPaymentStrategy());
        Order walletOrder = new Order(new WalletPaymentStrategy());
        Order codOrder = new Order(new CashOnDeliveryStrategy());

        System.out.println("Card Payment: " + cardOrder.processOrder(1000));
        System.out.println("Wallet Payment: " + walletOrder.processOrder(1000));
        System.out.println("Cash on Delivery: " + codOrder.processOrder(1000));
    }
}
