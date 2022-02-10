package com.mofakin.recscom.datagen;

import com.mofakin.recscom.RecscomMain;

import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;

public class DataGenBTP extends BlockTagsProvider  {
	
    public DataGenBTP(DataGenerator gen, ExistingFileHelper existingFileHelper) {
        super(gen, RecscomMain.MODID, existingFileHelper);
    }
}