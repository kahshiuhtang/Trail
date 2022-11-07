package Game.Map;

public enum LandBiome implements Land<LandBiome>{
    FOREST("FOREST", 1, 0.2),
    MOUNTAIN("MOUNTAIN", 0.7, 0.35),
    DESERT("DESERT", 0.8, 0.5),
    GRASSLANDS("GRASSLANDS", 1, 0.1),
    TUNDRA("TUNDRA",0.5, 0.5),
    RAINFOREST("RAINFOREST", 0.6, 0.5);

    private double walkSpeed, danger;
    private final String name;
    LandBiome(String name, double walkSpeed, double danger){
        this.name = name;
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

    @Override
    public String getSquare() {
        return name;
    }
    @Override
    public LandBiome getSquareData(String biome) {
        return switch (biome) {
            case "FOREST" -> LandBiome.FOREST;
            case "MOUNTAIN" -> LandBiome.MOUNTAIN;
            case "DESERT" -> LandBiome.DESERT;
            case "GRASSLANDS" -> LandBiome.GRASSLANDS;
            case "TUNDRA" -> LandBiome.TUNDRA;
            case "RAINFOREST" -> LandBiome.RAINFOREST;
            default -> null;
        };
    }
}
