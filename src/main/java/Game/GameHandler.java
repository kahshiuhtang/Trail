package Game;

import Game.Characters.Enemies.*;
import Game.Characters.Enemy;
import Game.Characters.User;
import Game.Characters.Users.*;
import Game.Map.Map;
import Game.Utilities.ComparePoints;
import Game.Utilities.Generator;
import Game.Utilities.Prompts;

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
           while(userTurn){
               m.printGameStatus(user.getCoordinates(), opponent.getCoordinates());
               String s = scanner.nextLine();
               int x = Integer.parseInt(s.substring(1,3));
               int y = Integer.parseInt(s.substring(3,5));
               System.out.println(x + "" + y);
               switch(s){
                   case "A":
                        attack();
                       break;
                   case "U":
                       break;
                   case "M":
                       move();
                       break;
                   case "P":

                       break;
                   case "E":
                        changeTurn();
                       break;

               }
           }

        }
    }
    private void startGame(){
        Prompts.selectCharacter();
        String choice = scanner.nextLine();
        setUser(choice);
        m = new Map();
        boss1 = randomEnemy();
        boss2 = randomEnemy();
        while(ComparePoints.compare(boss1.getCoordinates(), boss2.getCoordinates())){
            boss2 = randomEnemy();
        }
        opponent = randomUser();
    }
    private void setUser(String choice){
        switch (choice) {
            case "A" -> user = new Archer();
            case "G" -> user = new Giant();
            case "S" -> user = new Swordsman();
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
