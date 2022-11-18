package Game.Items.Boosts;
import Game.Items.Item;

public interface Boosts<T> extends Item<T>{

    public double damageIncrease();

    public double speedIncrease();

    public double healthIncrease();

}
