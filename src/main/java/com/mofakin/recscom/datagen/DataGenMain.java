package com.mofakin.recscom.datagen;

import com.mofakin.recscom.RecscomMain;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(modid = RecscomMain.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public final class DataGenMain {
	
    private DataGenMain() {}

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {	
    	
        DataGenerator gen = event.getGenerator();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();

        DataGenBTP blockTags = new DataGenBTP(gen, existingFileHelper);
        gen.addProvider(blockTags);
        gen.addProvider(new DataGenITP(gen, blockTags, existingFileHelper));
    }
}