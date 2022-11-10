package Game;

import Game.Characters.Enemies.*;
import Game.Characters.Enemy;
import Game.Characters.User;
import Game.Characters.Users.*;
import Game.Map.Map;
import Game.Utilities.Generator;

import java.util.Objects;
import java.util.Scanner;

public class GameHandler {
    private Map m;
    private User user;
    private Enemy boss1;
    private Enemy boss2;
    private User opponent;
    private final Scanner scanner;
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
        boss1 = randomEnemy();
        boss2 = randomEnemy();
        while(Objects.equals(boss1.getCoordinates().x, boss2.getCoordinates().x) && Objects.equals(boss1.getCoordinates().y, boss2.getCoordinates().y)){
            boss2 = randomEnemy();
        }
        opponent = randomUser();
    }
    private void setUser(String choice){
        switch(choice){
            case "A":
                user = new Archer();
                break;
            case "G":
                user = new Giant();
                break;
            case "S":
                user = new Swordsman();
                break;
        }
    }
    private Enemy randomEnemy(){
        int choice = Generator.generateRandomNumber(1,5);
        return switch (choice) {
            case 1 -> new Basilisk();
            case 2 -> new Griffin();
            case 3 -> new Hydra();
            case 4 -> new Sphinx();
            case 5 -> new Werewolf();
            default -> null;
        };
    }
    private User randomUser(){
        int choice = Generator.generateRandomNumber(1,5);
        return switch (choice) {
            case 1 -> new Archer();
            case 2 -> new Giant();
            case 3 -> new Swordsman();
            default -> null;
        };
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
