package com.mofakin.recscom.datagen;

import com.mofakin.recscom.RecscomMain;
import com.mofakin.releqt.RelEqtMain;
import com.mofakin.releqt.register.RegisterRelEqt;

import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.ItemTagsProvider;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.Tags.IOptionalNamedTag;
import net.minecraftforge.common.data.ExistingFileHelper;

public class DataGenITP extends ItemTagsProvider  {
	
	public static final IOptionalNamedTag<Item> HEATSOURCE = recscomTag("heatsource");
	
    public DataGenITP(DataGenerator gen, BlockTagsProvider blockTagProvider, ExistingFileHelper existingFileHelper) {
        super(gen, blockTagProvider, RecscomMain.MODID, existingFileHelper);
    }
    
    @Override
    public void addTags() {
    	
    	this.tag(HEATSOURCE).add (
    			
    			Items.TORCH,
    			Items.REDSTONE_TORCH,
    			Items.SOUL_TORCH,
    			RegisterRelEqt.TOOLSTICKONFIRE.get(),
    			RelEqtMain.BLOCKOILLAMP.asItem()
    	);
    }
    
    private static IOptionalNamedTag<Item> recscomTag(String name) {
        return ItemTags.createOptional(new ResourceLocation(RecscomMain.MODID, name));
    } 
    
    @Override
    public String getName() {
        return "ReCsCom Item Tags";
    } 
}