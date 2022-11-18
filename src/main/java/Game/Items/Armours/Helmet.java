package Game.Items.Armours;

import Game.Items.Armour;

public class Helmet implements Armour<Helmet> {
    private final double critReduction, damageReduction, rarity;

    public Helmet(){
        critReduction = 0.3;
        damageReduction = 3.0;
        rarity = 0.25;
    }
    @Override
    public double critReduction() {
        return critReduction;
    }

    @Override
    public double damageReduction() {
        return damageReduction;
    }

    @Override
    public double rarity() {
        return rarity;
    }

    @Override
    public Helmet getItem() {
        return new Helmet();
    }
}
