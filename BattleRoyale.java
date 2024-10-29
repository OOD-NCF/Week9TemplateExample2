class BattleRoyale extends GameMode {
    @Override
    void initialize() {
        System.out.println("Setting up Battle Royale mode...");
    }

    @Override
    void startPlay() {
        System.out.println("Starting Battle Royale: Survive as the last player!");
    }

    @Override
    void endPlay() {
        System.out.println("Ending Battle Royale: Declaring the last player standing as the winner.");
    }
}
