public class BackstagePassesUpdater implements Updater {
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
        item.quality=0;
    }

    @Override
    public void updateSellIn(Item item) {
        item.sellIn= item.sellIn-1;
    }

    @Override
    public void updateQualityOfItem(Item item) {
        if(item.sellIn>10){
            item.quality+=1;
        }else if (item.sellIn<=10 && item.sellIn>5){
            item.quality+=2;
        }else{
            item.quality+=3;
        }
        if(item.quality>50){
            item.quality=50;
        }
    }

    @Override
    public boolean isExpired(Item item) {
        return item.sellIn<=0;
    }
}
