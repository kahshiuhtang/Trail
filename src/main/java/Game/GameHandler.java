package Game;

import Game.Characters.Enemy;
import Game.Map.Map;

import java.util.Scanner;

public class GameHandler {
    private Map m;
    private Character user;
    private Enemy boss1;
    private Enemy boss2;
    private Character opponent;
    private Scanner scanner;
    private boolean userTurn = true;

    public GameHandler(){
        scanner = new Scanner(System.in);
        startGame();
        while(true){
           m.printGameStatus();
           String s = scanner.nextLine();
        }
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
