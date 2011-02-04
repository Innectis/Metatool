package com.bukkit.Innectis.Metatool;

import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.block.BlockRightClickEvent;

/**
 * @author Innectis
 */
public class BlockListener extends org.bukkit.event.block.BlockListener {

	public BlockListener()
	{
		// ...
	}

	@Override
	public void onBlockRightClick(BlockRightClickEvent event)
	{
		Player p = event.getPlayer();
		if (MetatoolMain.main.getStatus(p) >= 0) {
			Block b = event.getBlock();
			b.setData((byte) MetatoolMain.main.getStatus(p));
		}
	}
}
