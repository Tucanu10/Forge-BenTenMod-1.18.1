package com.tucanu.tucanu_bentenmod.item.custom;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class Omnitrix extends Item{
    public Omnitrix(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level pLevel, Player pPlayer, InteractionHand pUsedHand) {
        if(pUsedHand == InteractionHand.OFF_HAND && pPlayer.isShiftKeyDown()){
            pPlayer.displayClientMessage(Component.nullToEmpty(pPlayer.getDisplayName().getString()
                            +" has used their omnitrix"),false);

            addNbtToOmnitrix(pPlayer);
        }

        return super.use(pLevel, pPlayer, pUsedHand);
    }

    private void addNbtToOmnitrix(Player pPlayer){
        ItemStack dataTablet = pPlayer.getOffhandItem();

        CompoundTag nbtData = new CompoundTag();
        nbtData.putString("tucanu_bentenmod.owner",pPlayer.UUID_TAG);
        dataTablet.setTag(nbtData);
    }

    @Override
    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents
            , TooltipFlag pIsAdvanced) {
        if(Screen.hasShiftDown()){
            pTooltipComponents.add(new TranslatableComponent("tooltip.tucanu_bentenmod.omnitrix.tooltip.shift"));

        } else {
            pTooltipComponents.add(new TranslatableComponent("tooltip.tucanu_bentenmod.omnitrix.tooltip"));
        }
    }
}
