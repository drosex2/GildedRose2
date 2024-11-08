public class UpdaterFactory {
    public Updater instantiateUpdater(Item item){
        if(isAgedBrie(item)){
            return new AgedBrieUpdater();
        } else if (isBackstagePasses(item)) {
            return new BackstagePassesUpdater();
        } else if (isSulfuras(item)) {
           return new SulfurasUpdater();
        }else if (isConjured(item)) {
            return new ConjuredUpdater();
        }else{
            return new ItemUpdater();
        }


    }

    private boolean isConjured(Item item) {
        return item.name.contains("Conjured");
    }

    private boolean isSulfuras(Item item) {
        return item.name.equals("Sulfuras, Hand of Ragnaros");
    }

    private boolean isBackstagePasses(Item item) {
        return item.name.equals("Backstage passes to a TAFKAL80ETC concert");
    }

    private boolean isAgedBrie(Item item) {
        return item.name.equals("Aged Brie");
    }
}
