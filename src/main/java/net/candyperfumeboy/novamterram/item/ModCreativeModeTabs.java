package net.candyperfumeboy.novamterram.item;

import net.candyperfumeboy.novamterram.NovamTerram;
import net.candyperfumeboy.novamterram.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.checkerframework.checker.units.qual.C;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, NovamTerram.MODID);;

  public static final Supplier<CreativeModeTab> NOVAMTERRAM_TAB = CREATIVE_MODE_TAB.register("novamterram_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.OPAL_BLOCK.get()))
                    .title(Component.translatable("creativetab.novamterram"))
                    .withSearchBar()
                    .withTabsBefore(CreativeModeTabs.SPAWN_EGGS)
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.OPAL);
                        output.accept(ModItems.RAW_OPAL);
                        output.accept(ModBlocks.OPAL_BLOCK);
                        output.accept(ModBlocks.OPAL_ORE);

                    }).build());

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TAB.register(eventBus);
    }




}
