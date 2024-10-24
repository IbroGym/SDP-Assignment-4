package BehavioralPatterns2.Observer.WithPattern;

public class NewsSubscriberSmartphone implements Observer {
    @Override
    public void update(String category, String news) {
        if (category.equals("Sports")) {
            System.out.println("Smartphone received news: " + news);
        }
    }
}
