package BehavioralPatterns2.State.WithPattern;

public interface PlayerState {
    void play(Player player);
    void pause(Player player);
    void stop(Player player);
}
