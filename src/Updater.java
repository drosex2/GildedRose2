public interface Updater {
    public void updateItem(Item item);
    public void updateQualityOfExpiredItem(Item item);
    public void updateSellIn(Item item);
    public void updateQualityOfItem(Item item);
    public boolean isExpired(Item item);

}
