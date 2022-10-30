package Game.Map;

public class Map {
    private Square[][] map;
    public Map(){
        map = new Square[16][16];
    }
    public void generateNewMap(){

        //TODO: figure out to generate new list
    }
    public Square getSquare(int x, int y){
        return map[x][y];
    }

    public void toString(){
        for(int i = 0; i < 16; i++){
            for(int j = 0; j < 16; j++){
                switch(map[i][j]){

                }
            }
        }
    }


}

