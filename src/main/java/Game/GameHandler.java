package Game;

import Game.Characters.Enemies.*;
import Game.Characters.Enemy;
import Game.Characters.User;
import Game.Characters.Users.*;
import Game.Map.Map;
import Game.Utilities.*;
import Structures.Pair;

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
              try{
                  switch(s.substring(0,1)){
                      case "A":
                        int x = Integer.parseInt(s.substring(1,3));
                        int y = Integer.parseInt(s.substring(3,5));
                        attack(new Pair<Integer>(x,y));
                        break;
                      case "U":
                        
                        break;
                      case "M":
                        x = Integer.parseInt(s.substring(1,3));
                        y = Integer.parseInt(s.substring(3,5));
                        moveUser(x,y);
                        break;
                      case "E":
                          changeTurn();
                          break;
                      default:
                          Prompts.inputError();
                          break;
                  }
              }catch(IllegalArgumentException e){
                  System.out.println(e.toString());
              }
           }

        }
    }
    private void startGame(){
        Prompts.selectCharacter();
        String choice = scanner.nextLine();
        System.out.println(choice.length());
        setUser(choice.toUpperCase());
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
        int choice = Generator.generateRandomNumber(1,3);
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
    public void attack(Pair<Integer> location){
        int validRange = user.getRange();
        if (validRange*validRange > ComparePoints.distance(user.getCoordinates(), location)){
            throw new IllegalArgumentException("Out Of Range!");
        }
        Game.Characters.Character<?> attacked = findAttacker(location);
        if(attacked == null){
            throw new IllegalArgumentException("No Opponent Found");
        }
        double percent = Generator.generateRandomDecimal();
        double damage = user.getAttack();
        if(percent > attacked.getDefense()) damage = damage/2;
        attacked.reduceHealth(damage);
    }
    public void moveUser(int x, int y){
        int moves = user.getMoves();
        moves = moves * moves;
        int sum = x*x+y*y;
        if(sum > moves){
            throw new IllegalArgumentException("Too Far Away!");
        }
        user.updateCoordinates(x,y);
    }
    public void moveOpponent(){

    }
    public void useItem(){

    }
    public Game.Characters.Character<?> findAttacker(Pair<Integer> loc){
        if(ComparePoints.compare(loc, boss1.getCoordinates())){
            return  boss1;
        }else if(ComparePoints.compare(loc, boss2.getCoordinates())){
            return boss2;
        }else if(ComparePoints.compare(loc, opponent.getCoordinates())){
            return opponent;
        }
        return null;
    }

}
