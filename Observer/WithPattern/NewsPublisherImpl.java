package BehavioralPatterns2.Observer.WithPattern;

import java.util.ArrayList;
import java.util.List;

public class NewsPublisherImpl implements NewsPublisher {
    private List<Observer> subscribers = new ArrayList<>();

    @Override
    public void subscribe(Observer observer) {
        subscribers.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
        subscribers.remove(observer);
    }

    @Override
    public void notifySubscribers(String category, String news) {
        for (Observer observer : subscribers) {
            observer.update(category, news);
        }
    }

    public void publishNews(String category, String news) {
        System.out.println("Published news: [" + category + "] " + news);
        notifySubscribers(category, news);
    }
}
