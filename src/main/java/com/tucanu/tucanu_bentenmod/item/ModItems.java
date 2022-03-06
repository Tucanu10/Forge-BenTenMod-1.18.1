package com.tucanu.tucanu_bentenmod.item;

import com.tucanu.tucanu_bentenmod.Tucanu_BenTenMod;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems
{
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Tucanu_BenTenMod.MOD_ID);

    public static final RegistryObject<Item> GALVANIC_SHARD = ITEMS.register("galvanic_shard",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TUCANU_BENTENMOD)));

    public static final RegistryObject<Item> GALVANIC_CORE = ITEMS.register("galvanic_core",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TUCANU_BENTENMOD)));

    public static final RegistryObject<Item> OMNITRIX_ICON = ITEMS.register("omnitrix_icon",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> OBJECTIVE_ICON = ITEMS.register("objective_icon",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }
}
