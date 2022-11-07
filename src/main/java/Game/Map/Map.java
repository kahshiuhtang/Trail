package Game.Map;

import Game.Utilities.Color;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class Map {
    private Square[][] map;
    private Random r = new Random();
    public Map(){
        map = new Square[16][16];
        generateNewMap();
    }
    //TODO: figure out to generate new list
    public void generateNewMap(){
        int[][] biomeArr = new int[16][16];
        boolean[][] colored = new boolean[16][16];
        Queue<Pair> q = new LinkedList();
        int plates = generateRandomNumber(4,6);
        final String[] biomes = chooseBiomes(plates);
        for(int i = 1; i < plates+1; i++){
            int x = generateRandomNumber(3,12);
            int y = generateRandomNumber(3,12);
            while(colored[x][y]){
                x = generateRandomNumber(3,12);
                y = generateRandomNumber(3,12);
            }//TODO: need to figure out how to assign the biomes
            biomeArr[x][y] = i;
            colored[x][y] = true;
            addBorders(q, colored, x, y);
        }
        while(!q.isEmpty()){
            Pair temp = q.poll();
            if(colored[temp.x][temp.y]){
                continue;
            }
            assign(colored,biomeArr,temp.x,temp.y);
            addBorders(q,colored,temp.x,temp.y);
        }
        for(int i = 0; i < 16; i++){
            System.out.println();
            for(int j = 0; j < 16; j++){
                System.out.print(biomeArr[i][j] + " ");
            }
        }
    }
    private void assign(boolean[][] colored, int[][] biomeArr, int x, int y){
        int choice = generateRandomNumber(0, 3);
        boolean changed = false;
        while(!changed){
            switch(choice){
                case 0:
                    if(x+1 < 16 && colored[x+1][y]) {
                        colored[x][y] = true;
                        biomeArr[x][y] = biomeArr[x + 1][y];
                    }
                    changed = true;
                    break;
                case 1:
                    if(x-1 >= 0 && colored[x-1][y]){
                        colored[x][y] = true;
                        biomeArr[x][y] = biomeArr[x-1][y];
                    }
                    changed = true;
                    break;
                case 2:
                    if(y+1 < 16 && colored[x][y+1]){
                        colored[x][y] = true;
                        biomeArr[x][y] = biomeArr[x][y+1];
                    }
                    changed = true;
                    break;
                case 3:
                    if(y-1 >= 0 && colored[x][y-1]){
                        colored[x][y] = true;
                        biomeArr[x][y] = biomeArr[x][y-1];
                    }
                    changed = true;
                    break;
            }
        }
    }
    private void addBorders(Queue<Pair> q, boolean[][] colored, int x, int y){
        if(x+1 < 16 && !colored[x+1][y]){
            q.add(new Pair(x+1,y));
        }
        if(x-1 >= 0 && !colored[x-1][y]){
            q.add(new Pair(x-1,y));
        }
        if(y+1 < 16 && !colored[x][y+1]){
            q.add(new Pair(x,y+1));
        }
        if(y-1 >= 0 && !colored[x][y-1]){
            q.add(new Pair(x,y-1));
        }
    }
    private class Pair{
        int x;
        int y;
        Pair(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
    private String[] chooseBiomes(int count){
        String[] biomes = new String[count];
        final String[] selection = {"FOREST","MOUNTAIN", "DESERT", "GRASSLANDS", "TUNDRA", "RAINFOREST","LAKE","OCEAN"};
        boolean[] selected = new boolean[8];
        for(int i = 0; i < count; i++){
            int choice = generateRandomNumber(0,7);
            while(selected[choice]){
                choice = generateRandomNumber(0,7);
            }
            selected[choice] = true;
            biomes[i] = selection[choice];
        }
        return biomes;
    }
    private int generateRandomNumber(int lowerBound, int upperBound){
        return r.nextInt((upperBound-lowerBound)+1)+lowerBound;
    }
    public Square getSquare(int x, int y){
        return map[x][y];
    }

    public String toString(){
       return "";
    }
    public void printGameStatus(){
        for(int i = 0; i < 17; i++){
            System.out.println("");
            if(i < 7){
                System.out.print(Color.RESET + "" + Color. WHITE_BACKGROUND + "" + Color.RED_BOLD_BRIGHT+ " " + Math.abs(15-i) + " ");
            }else{
                System.out.print(Color.RESET + "" + Color. WHITE_BACKGROUND + "" + Color.RED_BOLD_BRIGHT + " " + Math.abs(15-i) + "  ");
            }
            for(int j = 15; j >= 0; j--){
                switch (map[i][j].getSquare()) {
                    case "FOREST" -> System.out.print(Color.RESET + "" + Color.BLACK_BACKGROUND + ""+  Color.GREEN_BOLD +" " + "F" + "  " + Color.RESET);
                    case "MOUNTAIN" -> System.out.print(Color.RESET + "" + Color.BLACK_BACKGROUND + ""+ Color.WHITE_BOLD_BRIGHT +" " + "M" + "  "+ Color.RESET);
                    case "DESERT" -> System.out.print(Color.RESET + "" + Color.BLACK_BACKGROUND + ""+ Color.YELLOW_BOLD_BRIGHT +" " + "D" + "  "+ Color.RESET);
                    case "GRASSLANDS" -> System.out.print(Color.RESET + "" + Color.BLACK_BACKGROUND + ""+ Color.GREEN_BOLD_BRIGHT +" " + "G" + "  "+ Color.RESET);
                    case "TUNDRA" -> System.out.print(Color.RESET + "" + Color.BLACK_BACKGROUND + ""+ Color.MAGENTA_BOLD + " " + "T" + "  "+ Color.RESET);
                    case "RAINFOREST" -> System.out.print(Color.RESET + "" + Color.BLACK_BACKGROUND + ""+ Color.CYAN_BOLD_BRIGHT +" " + "R" + "  "+ Color.RESET);
                    case "LAKE" -> System.out.print(Color.RESET + "" + Color. WHITE_BACKGROUND_BRIGHT + ""+ Color.CYAN_BOLD_BRIGHT +" " + "L" + "  "+ Color.RESET);
                    case "OCEAN" -> System.out.print(Color.RESET + "" + Color. WHITE_BACKGROUND_BRIGHT + ""+ Color.BLUE_BOLD +" " + "O" + "  "+ Color.RESET);
                }
            }
        }
        System.out.println();
        System.out.print(Color. WHITE_BACKGROUND + "    " + Color.RESET);
        for(int i = 1; i <= 16; i++){
            if(i < 10){
                System.out.print(Color. WHITE_BACKGROUND+ "" + Color.RED_BOLD_BRIGHT + " " + i + "  ");
            }else{
                System.out.print(Color. WHITE_BACKGROUND + "" + Color.RED_BOLD_BRIGHT + " " + i + " ");
            }
        }
    }


}

