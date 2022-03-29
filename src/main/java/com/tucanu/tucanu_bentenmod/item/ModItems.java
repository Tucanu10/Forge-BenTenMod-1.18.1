package com.tucanu.tucanu_bentenmod.item;

import com.tucanu.tucanu_bentenmod.Tucanu_BenTenMod;
import com.tucanu.tucanu_bentenmod.item.custom.Omnitrix;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems
{
    //Registering Items

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Tucanu_BenTenMod.MOD_ID);

    //Registered Items

    public static final RegistryObject<Item> GALVANIC_SHARD = ITEMS.register("galvanic_shard",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TUCANU_BENTENMOD)));

    public static final RegistryObject<Item> GALVANIC_CORE = ITEMS.register("galvanic_core",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TUCANU_BENTENMOD)));

    public static final RegistryObject<Item> OMNITRIX_ICON = ITEMS.register("omnitrix_icon",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> OBJECTIVE_ICON = ITEMS.register("objective_icon",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> OMNITRIX = ITEMS.register("omnitrix"
            , () -> new Omnitrix(new Item.Properties().tab(ModCreativeModeTab.TUCANU_BENTENMOD).stacksTo(1)));

    public static final RegistryObject<Item> OMNITRIX_AF = ITEMS.register("af_omnitrix"
            , () -> new Omnitrix(new Item.Properties().tab(ModCreativeModeTab.TUCANU_BENTENMOD).stacksTo(1)));

    public static final RegistryObject<Item> ULTIMATRIX = ITEMS.register("ultimatrix"
            , () -> new Omnitrix(new Item.Properties().tab(ModCreativeModeTab.TUCANU_BENTENMOD).stacksTo(1)));

    public static final RegistryObject<Item> NEGATIVE_ULTIMATRIX = ITEMS.register("negative_ultimatrix"
            , () -> new Omnitrix(new Item.Properties().tab(ModCreativeModeTab.TUCANU_BENTENMOD).stacksTo(1)));

    public static final RegistryObject<Item> THE_OMNITRIX = ITEMS.register("the_omnitrix"
            , () -> new Omnitrix(new Item.Properties().tab(ModCreativeModeTab.TUCANU_BENTENMOD).stacksTo(1)));

    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }
}
