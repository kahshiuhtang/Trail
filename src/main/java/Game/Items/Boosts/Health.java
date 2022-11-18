package Game.Items.Boosts;

public class Health implements Boosts<Health>{
    private final int dIncrease = 0;
    private final int sIncrease = 0;
    private final int hIncrease = 5;
    private final double rarity = 0.5;
    @Override
    public double damageIncrease() {
        return dIncrease;
    }

    @Override
    public double speedIncrease() {
        return sIncrease;
    }

    @Override
    public double healthIncrease() {
        return hIncrease;
    }

    @Override
    public double rarity() {
        return rarity;
    }

    @Override
    public Health getItem() {
        return new Health();
    }
}
