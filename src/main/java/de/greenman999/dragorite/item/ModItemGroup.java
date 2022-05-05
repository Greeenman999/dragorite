package de.greenman999.dragorite.item;

import de.greenman999.dragorite.Dragorite;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import org.lwjgl.system.CallbackI;

public class ModItemGroup {

    public static final ItemGroup DRAGORITE = FabricItemGroupBuilder.build(new Identifier(Dragorite.MOD_ID, "dragorite"), () -> new ItemStack(ModItems.DRAGORITE_INGOT));

}
