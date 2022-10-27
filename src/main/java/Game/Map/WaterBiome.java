package Game.Map;

public enum WaterBiome implements Water{
    RIVER(0.5, 0.2),
    LAKE(0.8, 0.1),
    OCEAN(0.3, 0.3);
    private final double danger, travelSpeed;
    WaterBiome(double speed, double danger){
        this.travelSpeed = speed;
        this.danger = danger;
    }

    @Override
    public double getWalkSpeed() {
        return travelSpeed;
    }

    @Override
    public double getDanger() {
        return danger;
    }
}
