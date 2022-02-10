package com.mofakin.recscom.event;

import com.mofakin.recscom.common.effect.RelEqtBloomeryEffect;
import com.mofakin.recscom.common.effect.RelEqtCampfireEffect;
import com.mofakin.recscom.common.effect.RelEqtFirepitEffect;
import com.mofakin.recscom.common.effect.RelEqtKilnEffect;
import com.mofakin.recscom.common.effect.RelEqtRoasterEffect;
import com.mofakin.recscom.common.effect.RelEqtStoveEffect;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.momostudios.coldsweat.ColdSweat;
import net.momostudios.coldsweat.core.event.csevents.TempModifierEvent;

@Mod.EventBusSubscriber
public class InitEventHandler {
	
    @SubscribeEvent
    public static void registerBlockEffects(TempModifierEvent.Init.Block event)
    {
        try
        {
        	event.addBlockEffect(new RelEqtBloomeryEffect().getClass());
        	event.addBlockEffect(new RelEqtCampfireEffect().getClass());
        	event.addBlockEffect(new RelEqtFirepitEffect().getClass());
        	event.addBlockEffect(new RelEqtKilnEffect().getClass());
        	event.addBlockEffect(new RelEqtRoasterEffect().getClass());
        	event.addBlockEffect(new RelEqtStoveEffect().getClass());
        }
        catch (Exception e) {
            ColdSweat.LOGGER.error("Registering BlockEffects failed!");
            e.printStackTrace();
        }
    }
}