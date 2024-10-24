package BehavioralPatterns2.State.WithPattern;

public class StoppedState implements PlayerState {
    @Override
    public void play(Player player) {
        System.out.println("Starting playback.");
        player.setState(new PlayingState());
    }

    @Override
    public void pause(Player player) {
        System.out.println("Cannot pause, player is stopped.");
    }

    @Override
    public void stop(Player player) {
        System.out.println("Already stopped.");
    }
}
