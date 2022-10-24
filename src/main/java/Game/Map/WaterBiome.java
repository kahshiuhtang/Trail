package Game.Map;

public enum WaterBiome implements Water{
    RIVER(),
    LAKE(),
    OCEAN();
    private int travelSpeed;
    private int danger;
    WaterBiome(){

    }
}
