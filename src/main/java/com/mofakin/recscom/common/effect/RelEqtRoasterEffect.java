package com.mofakin.recscom.common.effect;

import com.mofakin.releqt.common.block.BlockRoaster;

import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.BlockPos;
import net.momostudios.coldsweat.common.temperature.modifier.block.CampfireBlockEffect;
import net.momostudios.coldsweat.util.CSMath;

public class RelEqtRoasterEffect extends CampfireBlockEffect{
	
    @Override
    public double getTemperature(PlayerEntity player, BlockState state, BlockPos pos, double distance)
    {
        if (this.hasBlock(state) && state.getValue(BlockRoaster.LIT))
        {
            return CSMath.blend(0.27, 0, distance, 0.5, 7);
        }
        return 0;
    }

    @Override
    public boolean hasBlock(BlockState block)
    {
    	return block.getBlock() instanceof BlockRoaster;
    }
}