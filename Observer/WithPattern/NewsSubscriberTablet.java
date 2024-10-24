package BehavioralPatterns2.Observer.WithPattern;

public class NewsSubscriberTablet implements Observer {
    @Override
    public void update(String category, String news) {
        System.out.println("Tablet received news: " + news);
    }
}
