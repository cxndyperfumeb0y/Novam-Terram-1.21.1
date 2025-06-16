package net.candyperfumeboy.novamterram.item;

import net.candyperfumeboy.novamterram.NovamTerram;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(NovamTerram.MODID);

    public static final DeferredItem<Item> OPAL = ITEMS.register("opal",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAW_OPAL = ITEMS.register("raw_opal",
            () -> new Item(new Item.Properties()));



    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }

}

