import java.util.*;

public class Starter {
    public static void main(String[] args) {
        ArrayList<Item> items=new ArrayList<Item>();

        items.add(new Item("Spada",10,20));
        items.add(new Item("Aged Brie",2,0));
        items.add(new Item ("Elisir",2,0));
        items.add(new Item("Sulfuras, Hand of Ragnaros",0,80));
        items.add(new Item("Sulfuras, Hand of Ragnaros",-1,80));
        items.add(new Item("Backstage passes to a TAFKAL80ETC concert",15,20));
        items.add(new Item("Backstage passes to a TAFKAL80ETC concert",10,49));
        items.add(new Item("Backstage passes to a TAFKAL80ETC concert",5,49));
        items.add(new Item("Conjured Cake",3,6));

        GildedRose gd=new GildedRose(items);
        for (Item value : items) {
            System.out.println(value);
        }
        gd.DailyUpdate();
        System.out.println("-------------------");
        for (Item item : items) {
            System.out.println(item);
        }
    }
}
