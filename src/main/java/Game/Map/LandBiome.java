package Game.Map;

public enum LandBiome implements Land{
    FOREST(1, 0.2),
    MOUNTAIN(0.7, 0.35),
    DESERT(0.8, 0.5),
    GRASSLANDS(1, 0.1),
    TUNDRA(0.5, 0.5),
    RAINFOREST(0.6, 0.5);

    private double walkSpeed, danger;
    LandBiome(double walkSpeed, double danger){
        this.walkSpeed = walkSpeed;
        this.danger = danger;
    }
    @Override
    public double getWalkSpeed() {
        return walkSpeed;
    }

    @Override
    public double getDanger() {
        return danger;
    }
}
