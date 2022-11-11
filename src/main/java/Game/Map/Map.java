package Game.Map;

import Game.Utilities.Color;
import Game.Utilities.Generator;
import Game.Utilities.Prompts;
import Structures.Pair;

import java.util.LinkedList;
import java.util.Queue;

public class Map {
    private final Square<?>[][] map;
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
            case 0 -> Generator.generateRandomNumber(8, 11);
            case 1 -> Generator.generateRandomNumber(0, 2);
            case 2 -> Generator.generateRandomNumber(3, 5);
            case 3 -> Generator.generateRandomNumber(6, 8);
            case 4 -> Generator.generateRandomNumber(12, 15);
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
        int choice = Generator.generateRandomNumber(0, 3);
        boolean changed = false;
        while(!changed){
            choice = Generator.generateRandomNumber(0, 3);
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


    public Square<?> getSquare(int x, int y){
        return map[x][y];
    }

    public String toString(){
       return "";
    }
    public void printGameStatus(Pair<Integer> user, Pair<Integer> enemy){
        for(int i = 0; i < 16; i++){
            System.out.println("");
            if(i < 7){
                System.out.print(Color.RESET + "" + Color. WHITE_BACKGROUND + "" + Color.RED_BOLD_BRIGHT+ " " + Math.abs(16-i) + " ");
            }else{
                System.out.print(Color.RESET + "" + Color. WHITE_BACKGROUND + "" + Color.RED_BOLD_BRIGHT + " " + Math.abs(16-i) + "  ");
            }
            for(int j = 0; j < 16; j++){
                switch (map[i][j].getSquare()) {
                    case "FOREST" -> Prompts.forest(user, enemy,new Pair<Integer>(j+1, 16-i));
                    case "MOUNTAIN" -> Prompts.mountain(user, enemy,new Pair<Integer>(j+1, 16-i));
                    case "DESERT" -> Prompts.desert(user, enemy,new Pair<Integer>(j+1, 16-i));
                    case "GRASSLANDS" -> Prompts.grassland(user, enemy,new Pair<Integer>(j+1, 16-i));
                    case "TUNDRA" -> Prompts.tundra(user, enemy,new Pair<Integer>(j+1, 16-i));
                    case "RAINFOREST" -> Prompts.rainforest(user, enemy,new Pair<Integer>(j+1, 16-i));
                    case "LAKE" -> Prompts.lake(user, enemy,new Pair<Integer>(j+1, 16-i));
                    case "OCEAN" -> Prompts.ocean(user, enemy,new Pair<Integer>(j+1, 16-i));
                }
            }
        }
        System.out.println();
        Prompts.mapLastRow();
    }
}

