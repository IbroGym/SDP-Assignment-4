package BehavioralPatterns2.Observer.WithPattern;

public interface NewsPublisher {
    void subscribe(Observer observer);
    void unsubscribe(Observer observer);
    void notifySubscribers(String category, String news);
}

