package Game;

import Game.Characters.Enemy;
import Game.Map.Map;

public class GameHandler {
    private Map m;
    private Character user;
    private Enemy boss1;
    private Enemy boss2;
    private Character opponent;
    private boolean userTurn = true;

    public GameHandler(){
       startGame();
    }
    private void startGame(){
        m = new Map();
    }
    public void changeTurn(){
        userTurn = !userTurn;
    }
    public void attack(){

    }
    public void move(){

    }
    public void useItem(){

    }

}
