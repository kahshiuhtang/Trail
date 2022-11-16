package Game.Utilities;

import Structures.Pair;

public class Prompts {
    public static void selectCharacter(){
        System.out.println("Select Character: ");
        System.out.println("Archer: A");
        System.out.println("Giant: G");
        System.out.println("Swordsman: S");
    }
    public static void printMenus(){
        System.out.println("What would you like to see?");
        System.out.println("1: Biome Map");
        System.out.println("2: Item Map");
        System.out.println("3: Boss Map");
    }
    public static void inputError(){
        System.out.println("Error! Please Enter Valid Input.");
    }
    public static void forest(Pair<Integer> user, Pair<Integer> enemy, Pair<Integer> currentPoint){
        if(ComparePoints.compare(user, currentPoint)){
            System.out.print(Color.RESET + "" + Color.BLACK_BACKGROUND + ""+  Color.RED_USER +" " + "F" + "  " + Color.RESET);
        }else if(ComparePoints.compare(enemy, currentPoint)){
            System.out.print(Color.RESET + "" + Color.BLACK_BACKGROUND + ""+  Color.LIGHT_GREEN_SIG +" " + "F" + "  " + Color.RESET);
        }else{
            System.out.print(Color.RESET + "" + Color.BLACK_BACKGROUND + ""+  Color.LIGHT_GREEN +" " + "F" + "  " + Color.RESET);
        }
    }
    public static void mountain(Pair<Integer> user, Pair<Integer> enemy, Pair<Integer> currentPoint){
        if(ComparePoints.compare(user, currentPoint)){
            System.out.print(Color.RESET + "" + Color.BLACK_BACKGROUND + ""+ Color.RED_USER +" " + "M" + "  "+ Color.RESET);
        }else if(ComparePoints.compare(enemy, currentPoint)){
            System.out.print(Color.RESET + "" + Color.BLACK_BACKGROUND + ""+ Color.WHITE_SIG +" " + "M" + "  "+ Color.RESET);
        }else{
            System.out.print(Color.RESET + "" + Color.BLACK_BACKGROUND + ""+ Color.WHITE +" " + "M" + "  "+ Color.RESET);
        }
    }
    public static void desert(Pair<Integer> user, Pair<Integer> enemy, Pair<Integer> currentPoint){
        if(ComparePoints.compare(user, currentPoint)){
            System.out.print(Color.RESET + "" + Color.BLACK_BACKGROUND + ""+ Color.RED_USER +" " + "D" + "  "+ Color.RESET);
        }else if(ComparePoints.compare(enemy, currentPoint)){
            System.out.print(Color.RESET + "" + Color.BLACK_BACKGROUND + ""+ Color.YELLOW_SIG +" " + "D" + "  "+ Color.RESET);
        }else{
            System.out.print(Color.RESET + "" + Color.BLACK_BACKGROUND + ""+ Color.YELLOW +" " + "D" + "  "+ Color.RESET);
        }
    }
    public static void grassland(Pair<Integer> user, Pair<Integer> enemy, Pair<Integer> currentPoint){
        if(ComparePoints.compare(user, currentPoint)){
            System.out.print(Color.RESET + "" + Color.BLACK_BACKGROUND + ""+ Color.RED_USER +" " + "G" + "  "+ Color.RESET);
        }else if(ComparePoints.compare(enemy, currentPoint)){
            System.out.print(Color.RESET + "" + Color.BLACK_BACKGROUND + ""+ Color.GREEN_SIG +" " + "G" + "  "+ Color.RESET);
        }else{
            System.out.print(Color.RESET + "" + Color.BLACK_BACKGROUND + ""+ Color.GREEN +" " + "G" + "  "+ Color.RESET);
        }
    }
    public static void tundra(Pair<Integer> user, Pair<Integer> enemy, Pair<Integer> currentPoint){
        if(ComparePoints.compare(user, currentPoint)){
            System.out.print(Color.RESET + "" + Color.BLACK_BACKGROUND + ""+ Color.RED_USER + " " + "T" + "  "+ Color.RESET);
        }else if(ComparePoints.compare(enemy, currentPoint)){
            System.out.print(Color.RESET + "" + Color.BLACK_BACKGROUND + ""+ Color.MAGENTA_SIG + " " + "T" + "  "+ Color.RESET);
        }else{
            System.out.print(Color.RESET + "" + Color.BLACK_BACKGROUND + ""+ Color.MAGENTA + " " + "T" + "  "+ Color.RESET);
        }
    }
    public static void rainforest(Pair<Integer> user, Pair<Integer> enemy, Pair<Integer> currentPoint){
        if(ComparePoints.compare(user, currentPoint)){
            System.out.print(Color.RESET + "" + Color.BLACK_BACKGROUND + ""+ Color.RED_USER +" " + "R" + "  "+ Color.RESET);
        }else if(ComparePoints.compare(enemy, currentPoint)){
            System.out.print(Color.RESET + "" + Color.BLACK_BACKGROUND + ""+ Color.CYAN_SIG +" " + "R" + "  "+ Color.RESET);
        }else{
            System.out.print(Color.RESET + "" + Color.BLACK_BACKGROUND + ""+ Color.CYAN +" " + "R" + "  "+ Color.RESET);
        }
    }
    public static void lake(Pair<Integer> user, Pair<Integer> enemy, Pair<Integer> currentPoint){
        if(ComparePoints.compare(user, currentPoint)){
            System.out.print(Color.RESET + "" + Color. WHITE_BACKGROUND_BRIGHT + ""+ Color.RED_USER +" " + "L" + "  "+ Color.RESET);
        }else if(ComparePoints.compare(enemy, currentPoint)){
            System.out.print(Color.RESET + "" + Color. WHITE_BACKGROUND_BRIGHT + ""+ Color.CYAN_SIG +" " + "L" + "  "+ Color.RESET);
        }else{
            System.out.print(Color.RESET + "" + Color. WHITE_BACKGROUND_BRIGHT + ""+ Color.CYAN +" " + "L" + "  "+ Color.RESET);
        }
    }
    public static void ocean(Pair<Integer> user, Pair<Integer> enemy, Pair<Integer> currentPoint){
        if(ComparePoints.compare(user, currentPoint)){
            System.out.print(Color.RESET + "" + Color. WHITE_BACKGROUND_BRIGHT + ""+ Color.RED_USER +" " + "O" + "  "+ Color.RESET);
        }else if(ComparePoints.compare(enemy, currentPoint)){
            System.out.print(Color.RESET + "" + Color. WHITE_BACKGROUND_BRIGHT + ""+ Color.BLUE_SIG +" " + "O" + "  "+ Color.RESET);
        }else{
            System.out.print(Color.RESET + "" + Color. WHITE_BACKGROUND_BRIGHT + ""+ Color.BLUE +" " + "O" + "  "+ Color.RESET);
        }
    }
    public static void mapLastRow(){
        System.out.print(Color. WHITE_BACKGROUND + "" + Color.RED_BOLD_BRIGHT+ " 0  " + Color.RESET);
        for(int i = 1; i <= 16; i++){
            if(i < 10){
                System.out.print(Color. WHITE_BACKGROUND+ "" + Color.RED_BOLD_BRIGHT + " " + i + "  ");
            }else{
                System.out.print(Color. WHITE_BACKGROUND + "" + Color.RED_BOLD_BRIGHT + " " + i + " ");
            }
        }
        System.out.print(Color.RESET);
        System.out.println();
    }
    public static void whichBoosts(){
        System.out.println("Which Boost Would You Like To Use?");
        System.out.println("1: Health");
        System.out.println("2: Damage");
        System.out.println("3: Speed");
    }
}
