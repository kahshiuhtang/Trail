package Game.Items.Boosts;

public class Damage implements Boosts<Damage>{
    private final int dIncrease = 4;
    private final int sIncrease = 0;
    private final int hIncrease = 0;
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
    public Damage getItem() {
        return new Damage();
    }
}
