package Game.Map;

public class Map {
    private Square[][] map;
    public Map(){
        map = new Square[16][16];
    }
    public void generateNewMap(){

    }
    public Square getSquare(int x, int y){
        return map[x][y];
    }
}
