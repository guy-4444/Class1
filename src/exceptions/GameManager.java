package exceptions;

public class GameManager {

    public static final int SIZE = 3;
    private final char EMPTY = '▢';
    private final char P0 = '✘';
    private final char P1 = '◉';

    char[][] map = new char[SIZE][SIZE];

    public GameManager() {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                map[i][j] = EMPTY;
            }
        }
    }


    public void print() {
        String str = "";
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                str += map[i][j] + " ";
            }
            str += "\n";
        }
        System.out.println(str);
    }

    public void draw(int player, int i, int j) throws GameException {
        if (i < 0 || i >= SIZE || j < 0 || j >= SIZE) {
            throw new GameException("Invalid index in map");
        }
        if (map[i][j] != EMPTY) {
            throw new GameException("Cell already selected");
        }

        char symbol = (player == 0) ? P0 : P1;
        map[i][j] = symbol;
    }

    public boolean isDone() {
        boolean firstPlayerWins = isPlayerWins(P0);
        boolean secondPlayerWins = isPlayerWins(P1);
        boolean isFull = isMapFull();

        return firstPlayerWins || secondPlayerWins || isFull;
    }

    private boolean isMapFull() {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                if (map[i][j] == EMPTY) {
                    return false;
                }
            }
        }

        return true;
    }

    private boolean isPlayerWins(char pSymbol) {
        int[][] wins = new int[][] {
                {00, 01, 02},
                {10, 11, 12},
                {20, 21, 22},
                {00, 10, 20},
                {01, 11, 21},
                {02, 12, 22},
                {00, 11, 22},
                {02, 11, 20},
        };

        for (int x = 0; x < wins.length; x++) {
            int count = 0;
            for (int y = 0; y < wins[0].length; y++) {
                int i = wins[x][y] / 10;
                int j = wins[x][y] % 10;
                if (map[i][j] == pSymbol) {
                    count++;
                }
            }

            if (count == 3) {
                return true;
            }
        }

        return false;
    }

    public class GameException extends Exception {
        public GameException(String message) {
            super(message);
        }
    }
}
