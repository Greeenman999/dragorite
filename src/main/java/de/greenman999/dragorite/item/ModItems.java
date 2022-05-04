package de.greenman999.dragorite.item;

import de.greenman999.dragorite.Dragorite;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item DRAGORITE_INGOT = registerItem("dragorite_ingot", new Item(new FabricItemSettings().group(ItemGroup.MISC)));
    public static final Item DRAGORITE_NUGGET = registerItem("dragorite_nugget", new Item(new FabricItemSettings().group(ItemGroup.MISC)));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Dragorite.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Dragorite.LOGGER.info("Registering Mod Items for " + Dragorite.MOD_ID);
    }

}
