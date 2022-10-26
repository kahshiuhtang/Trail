package Game.Map;

public enum WaterBiome implements Water{
    RIVER(-1, 0.2),
    LAKE(1, 0.1),
    OCEAN(-2, 0.4);
    private final int travelSpeed;
    private final double danger;
    WaterBiome(int speed, double danger){
        this.travelSpeed = speed;
        this.danger = danger;
    }

    @Override
    public int getWalkSpeed() {
        return travelSpeed;
    }

    @Override
    public double getDanger() {
        return danger;
    }
}
