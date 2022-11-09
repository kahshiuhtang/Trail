package Game.Map;

import Game.Utilities.Color;
import Structures.Pair;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class Map {
    private final Square<?>[][] map;
    private final Random r = new Random();
    public Map(){
        map = new Square[16][16];
        generateNewMap();
    }
    //TODO: Better Space Out Biomes && Randomize Biome Chosen
    public void generateNewMap(){
        int[][] biomeArr = new int[16][16];
        boolean[][] colored = new boolean[16][16];
        Queue<Pair> q = new LinkedList();
        int plates = 5;
        final Square[] biomes = {LandBiome.FOREST, LandBiome.MOUNTAIN, LandBiome.DESERT, LandBiome.GRASSLANDS, LandBiome.TUNDRA, WaterBiome.LAKE, LandBiome.RAINFOREST, WaterBiome.OCEAN};
        for(int i = 1; i < plates+1; i++){
            int x = generateRandom(i%5);
            int y = generateRandom((i+1)%5);
            while(colored[x][y]){
                x = generateRandom(i%3);
                y = generateRandom((i+1)%3);
            }//TODO: need to figure out how to assign the biomes
            map[x][y] = biomes[i];
            biomeArr[x][y] = i;
            colored[x][y] = true;
            addBorders(q, colored, x, y);
        }
        while(!q.isEmpty()){
            Pair<Integer> temp = q.poll();
            if(colored[temp.x][temp.y]){
                continue;
            }
            assign(colored,biomeArr,temp.x,temp.y, biomes);
            addBorders(q,colored,temp.x,temp.y);
        }
        ensure(colored,biomeArr,biomes);
    }
    public int generateRandom(int point){
        return switch (point) {
            case 0 -> generateRandomNumber(8, 11);
            case 1 -> generateRandomNumber(0, 2);
            case 2 -> generateRandomNumber(3, 5);
            case 3 -> generateRandomNumber(6, 8);
            case 4 -> generateRandomNumber(12, 15);
            default -> 0;
        };
    }

    private void ensure(boolean[][] colored, int[][] biomeArr, Square[] biomes){
        for(int i = 0; i < 16;i++){
            for(int j = 0; j < 16; j++){
                if(map[i][j] == null){
                    assign(colored, biomeArr,i,j, biomes);
                }
            }
        }
    }
    private void assign(boolean[][] colored, int[][] biomeArr, int x, int y, Square[] biomes){
        int choice = generateRandomNumber(0, 3);
        boolean changed = false;
        while(!changed){
            choice = generateRandomNumber(0, 3);
            switch(choice){
                case 0:
                    if(x+1 < 16 && colored[x+1][y]) {
                        colored[x][y] = true;
                        biomeArr[x][y] = biomeArr[x + 1][y];
                        this.map[x][y] = biomes[biomeArr[x + 1][y]];
                        changed = true;
                    }
                    break;
                case 1:
                    if(x-1 >= 0 && colored[x-1][y]){
                        colored[x][y] = true;
                        biomeArr[x][y] = biomeArr[x-1][y];
                        this.map[x][y] = biomes[biomeArr[x - 1][y]];
                        changed = true;
                    }
                    break;
                case 2:
                    if(y+1 < 16 && colored[x][y+1]){
                        colored[x][y] = true;
                        biomeArr[x][y] = biomeArr[x][y+1];
                        this.map[x][y] = biomes[biomeArr[x][y+1]];
                        changed = true;
                    }
                    break;
                case 3:
                    if(y-1 >= 0 && colored[x][y-1]){
                        colored[x][y] = true;
                        biomeArr[x][y] = biomeArr[x][y-1];
                        this.map[x][y] = biomes[biomeArr[x][y-1]];
                        changed = true;
                    }
                    break;
            }
        }
    }
    private void addBorders(Queue<Pair> q, boolean[][] colored, int x, int y){
        if(x+1 < 16 && !colored[x+1][y]){
            q.add(new Pair<Integer>(x+1,y));
        }
        if(x-1 >= 0 && !colored[x-1][y]){
            q.add(new Pair<Integer>(x-1,y));
        }
        if(y+1 < 16 && !colored[x][y+1]){
            q.add(new Pair<Integer>(x,y+1));
        }
        if(y-1 >= 0 && !colored[x][y-1]){
            q.add(new Pair<Integer>(x,y-1));
        }
        if(x+1 < 16 && y+1 < 16 && !colored[x+1][y+1]){
            q.add(new Pair<Integer>(x+1,y+1));
        }
        if(x+1 < 16 && y-1 >= 0 && !colored[x+1][y-1]){
            q.add(new Pair<Integer>(x+1,y-1));
        }
        if(y+1 < 16 && x-1 >= 0 && !colored[x-1][y+1]){
            q.add(new Pair<Integer>(x-1,y+1));
        }
        if(y-1 >= 0 && x-1 >= 0 && !colored[x-1][y-1]){
            q.add(new Pair<Integer>(x-1,y-1));
        }
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
        for(int i = 0; i < 16; i++){
            System.out.println("");
            if(i < 7){
                System.out.print(Color.RESET + "" + Color. WHITE_BACKGROUND + "" + Color.RED_BOLD_BRIGHT+ " " + Math.abs(16-i) + " ");
            }else{
                System.out.print(Color.RESET + "" + Color. WHITE_BACKGROUND + "" + Color.RED_BOLD_BRIGHT + " " + Math.abs(16-i) + "  ");
            }
            for(int j = 15; j >= 0 && i < 16; j--){
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
        System.out.print(Color. WHITE_BACKGROUND + "" + Color.RED_BOLD_BRIGHT+ " 0  " + Color.RESET);
        for(int i = 1; i <= 16; i++){
            if(i < 10){
                System.out.print(Color. WHITE_BACKGROUND+ "" + Color.RED_BOLD_BRIGHT + " " + i + "  ");
            }else{
                System.out.print(Color. WHITE_BACKGROUND + "" + Color.RED_BOLD_BRIGHT + " " + i + " ");
            }
        }
    }


}

