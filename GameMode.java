abstract class GameMode {

    // Template method that defines the game sequence
    public final void playGame() {
        initialize();
        startPlay();
        endPlay();
    }

    // Abstract methods to be implemented by each game mode
    abstract void initialize();
    abstract void startPlay();
    abstract void endPlay();
}