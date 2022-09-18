package game;

import java.util.ArrayList;

public class Game {

    public static int score = 0, highscore = 0, scoreToAdd = 0;
    public static boolean spawnNewBlock = false, speedup = false;

    public static ArrayList<Block> blocks = new ArrayList<Block>();
    public static Block currentBlock, nextBlock;

    public static int[][] map = new int[10][18];

    public static GameState gameState = GameState.start;

    public static void clear(){
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                map[i][j] = 0;
            }
        }
        score = 0;
    }
}
