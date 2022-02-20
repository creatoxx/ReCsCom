package com.mofakin.recscom;

import com.mofakin.recscom.config.RecscomConfig;

import net.minecraftforge.fml.common.Mod;

@Mod(RecscomMain.MODID)
public class RecscomMain {
	
	public static final String MODID = "recscom";

	public RecscomMain() {
		
		RecscomConfig.setup();
	}
}