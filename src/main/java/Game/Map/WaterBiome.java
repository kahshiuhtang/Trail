package Game.Map;

public enum WaterBiome implements Water<WaterBiome>{
    RIVER("RIVER",0.5, 0.2),
    LAKE("LAKE", 0.8, 0.1),
    OCEAN("OCEAN", 0.3, 0.3);
    private final double danger, travelSpeed;
    private final String name;
    WaterBiome(String name, double speed, double danger){
        this.travelSpeed = speed;
        this.danger = danger;
        this.name = name;
    }

    @Override
    public double getWalkSpeed() {
        return travelSpeed;
    }

    @Override
    public double getDanger() {
        return danger;
    }

    @Override
    public String getSquare() {
        return name;
    }

    @Override
    public WaterBiome getSquareData(String biome) {
        return switch (biome) {
            case "RIVER" -> WaterBiome.RIVER;
            case "LAKE" -> WaterBiome.LAKE;
            case "OCEAN" -> WaterBiome.OCEAN;
            default -> null;
        };
    }

}
