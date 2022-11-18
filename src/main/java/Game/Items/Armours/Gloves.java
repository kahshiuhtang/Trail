package Game.Items.Armours;

import Game.Items.Armour;

public class Gloves implements Armour<Gloves> {
    private final double critReduction, damageReduction, rarity;

    public Gloves(){
        critReduction = 0.2;
        damageReduction = 1.0;
        rarity = 0.4;
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
    public Gloves getItem() {
        return new Gloves();
    }
}
