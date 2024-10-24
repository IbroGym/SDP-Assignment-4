package BehavioralPatterns2.Observer.WithPattern;

public class Main {
    public static void main(String[] args) {
        NewsPublisherImpl publisher = new NewsPublisherImpl();

        Observer smartphone = new NewsSubscriberSmartphone();
        Observer laptop = new NewsSubscriberLaptop();
        Observer tablet = new NewsSubscriberTablet();

        publisher.subscribe(smartphone);
        publisher.subscribe(laptop);
        publisher.subscribe(tablet);

        publisher.publishNews("Sports", "Team A won the match!");
        publisher.publishNews("Science", "New discovery in space!");
        publisher.publishNews("Politics", "Elections are coming soon.");
    }
}
