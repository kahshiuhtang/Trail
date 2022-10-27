package Game.Items;

public interface Item<T> {
    /*
     * Is the user using the item?
     */
    public boolean getEquipped();
    /*
     * How big is item to fit in bag?
     */
    public int getStorageSize();

    public double rarity();

    public T getItem();
}
