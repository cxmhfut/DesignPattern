package dp.template;

public class Client {
    public static void main(String[] args) {
        Game basketballGame = new BasketballGame();
        Game footballGame = new FootballGame();

        basketballGame.play();
        footballGame.play();
    }
}
