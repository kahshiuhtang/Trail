package Game.Items;

public enum Fruit implements Item<Fruit> {
    WATERMELON(1),
    APPLE(3),
    STRAWBERRY(5),
    MANGO(7);
    private final int score;
    Fruit(int score){
        this.score = score;
    }
    public int getScore(){
        return score;
    }
}
