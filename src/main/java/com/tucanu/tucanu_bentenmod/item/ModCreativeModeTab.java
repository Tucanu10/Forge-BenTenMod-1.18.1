package com.tucanu.tucanu_bentenmod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab
{
    public static final CreativeModeTab TUCANU_BENTENMOD = new CreativeModeTab("tucanu_bentenModTab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.OBJECTIVE_ICON.get());
        }
    };
}
