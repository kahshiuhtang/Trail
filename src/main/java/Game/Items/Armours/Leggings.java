package Game.Items.Armours;

import Game.Items.Armour;

public class Leggings implements Armour<Leggings> {
    private final double critReduction, damageReduction, rarity;

    public Leggings(){
        critReduction = 0.5;
        damageReduction = 4.0;
        rarity = 0.1;
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
    public Leggings getItem() {
        return new Leggings();
    }
}
