class CaptureTheFlag extends GameMode {
    @Override
    void initialize() {
        System.out.println("Setting up Capture the Flag mode...");
    }

    @Override
    void startPlay() {
        System.out.println("Starting Capture the Flag: Secure the enemy flag!");
    }

    @Override
    void endPlay() {
        System.out.println("Ending Capture the Flag: Calculating captured flags.");
    }
}
