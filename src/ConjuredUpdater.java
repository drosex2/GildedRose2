public class ConjuredUpdater implements Updater {

    @Override
    public void updateItem(Item item) {
        updateSellIn(item);
        if(!isExpired(item)){
            updateQualityOfItem(item);
        }else {
            updateQualityOfExpiredItem(item);
        }
    }

    @Override
    public void updateQualityOfExpiredItem(Item item) {
        item.quality=item.quality-4;
        if(item.quality<0){
            item.quality=0;
        }
    }

    @Override
    public void updateSellIn(Item item) {
        item.sellIn=item.sellIn-1;
    }

    @Override
    public void updateQualityOfItem(Item item) {
        item.quality=item.quality-2;
        if(item.quality<0){
            item.quality=0;
        }
    }

    @Override
    public boolean isExpired(Item item) {
        return item.sellIn<=0;
    }
}
