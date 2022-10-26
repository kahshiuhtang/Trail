package Game.Map;

public enum LandBiome implements Land{
    FOREST(),
    MOUNTAIN(),
    DESERT(),
    GRASSLANDS(),
    TUNDRA(),
    RAINFOREST();

    private int walkSpeed, danger;

    @Override
    public int getWalkSpeed() {
        return walkSpeed;
    }

    @Override
    public int getDanger() {
        return danger;
    }
}
