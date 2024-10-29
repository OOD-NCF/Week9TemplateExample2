class Deathmatch extends GameMode {
    @Override
    void initialize() {
        System.out.println("Setting up Deathmatch mode...");
    }

    @Override
    void startPlay() {
        System.out.println("Starting Deathmatch: Last player standing wins!");
    }

    @Override
    void endPlay() {
        System.out.println("Ending Deathmatch: Announcing the winner.");
    }
}