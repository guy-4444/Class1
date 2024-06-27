package exceptions;


import java.util.Random;

public class ExceptionGameMain {


    public static void start() {
        System.out.println("!START!");

        GameManager gameManager = new GameManager();


        int player = 0;
        while (true) {
            int i = new Random().nextInt(GameManager.SIZE);
            int j = new Random().nextInt(GameManager.SIZE);

            try {
                gameManager.draw(player, i, j);
                player = 1 - player;
            } catch (GameManager.GameException e) { }

            if (gameManager.isDone()) {
                break;
            }
        }

        gameManager.print();

    }

}
