package Game;

import Game.Characters.Enemy;
import Game.Map.Map;

public class GameHandler {
    private Map m;
    private Character user;
    private Enemy boss1;
    private Enemy boss2;
    private Character opponent;
    public GameHandler(){
        m = new Map();
    }

}
