public class TemplateMethodGameExample {
    public static void main(String[] args) {
        GameMode deathmatch = new Deathmatch();
        GameMode captureTheFlag = new CaptureTheFlag();
        GameMode battleRoyale = new BattleRoyale();

        System.out.println("Deathmatch Mode:");
        deathmatch.playGame();

        System.out.println("\nCapture The Flag Mode:");
        captureTheFlag.playGame();

        System.out.println("\nBattle Royale Mode:");
        battleRoyale.playGame();
    }
}
