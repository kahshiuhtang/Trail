package Game.Items;

public enum Fruit implements Item<Fruit> {
    WATERMELON(1, 0.5),
    APPLE(3, 0.3),
    STRAWBERRY(5, 0.2),
    MANGO(7, 0.1);
    private final int score;
    private final double rarity;
    Fruit(int score, double rarity){
        this.score = score;
        this.rarity = rarity;
    }
    public int getScore(){
        return score;
    }

    @Override
    public boolean getEquipped() {
        return false;
    }

    @Override
    public int getStorageSize() {
        return 1;
    }

    @Override
    public double rarity() {
        return rarity;
    }

    @Override
    public Fruit getItem() {
        return null;
    }
}
