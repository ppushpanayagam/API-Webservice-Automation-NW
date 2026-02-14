package utils;

import models.Item;
import models.ItemData;

public class ItemBuilder {

    public static Item buildItem(
            String name, String year, String price, String cpuModel, String hardDiskSize
    ){
        ItemData itemData = new ItemData();
        itemData.setYear(Integer.parseInt(year));
        itemData.setPrice(Integer.parseInt(price));
        itemData.setCpuModel(cpuModel);
        itemData.setHardDiskSize(hardDiskSize);

        Item item = new Item();
        item.setData(itemData);
        item.setName(name);

        return item;
    }
}
