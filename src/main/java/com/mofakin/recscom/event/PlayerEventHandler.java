package com.mofakin.recscom.event;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.momostudios.coldsweat.common.temperature.modifier.HearthTempModifier;
import net.momostudios.coldsweat.util.PlayerHelper;

import com.mofakin.recscom.RecscomMain;
import com.mofakin.recscom.datagen.DataGenITP;

@Mod.EventBusSubscriber(modid = RecscomMain.MODID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class PlayerEventHandler {
	
    @SubscribeEvent
    public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
    	
        if (event.phase == TickEvent.Phase.END) {
        	
            PlayerEntity player = event.player;

            if (player.tickCount % 20 == 0) {
            	
            	if (!player.isInWater() && !player.level.isRainingAt(player.blockPosition())) {
            		
	            	if(DataGenITP.HEATSOURCE.contains(player.getMainHandItem().getItem()) || DataGenITP.HEATSOURCE.contains(player.getOffhandItem().getItem())) {
	            		PlayerHelper.addModifier(player, new HearthTempModifier(30), PlayerHelper.Types.AMBIENT, false);     		
	            	} else {
	            		PlayerHelper.removeModifiers(player, PlayerHelper.Types.AMBIENT, 1, modifier -> modifier instanceof HearthTempModifier);
	            	}
            	}
            }
        }
    }
}