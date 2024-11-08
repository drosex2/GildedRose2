import java.util.ArrayList;

class GildedRose {
    ArrayList<Item> items;
    UpdaterFactory myUpdaterFactory=new UpdaterFactory();

    public GildedRose(ArrayList<Item> items) {
        this.items = items;
    }

    public void DailyUpdate() {
        for (Item item : items) {
            Updater updater=myUpdaterFactory.instantiateUpdater(item);
            updater.updateItem(item);
        }
    }


}