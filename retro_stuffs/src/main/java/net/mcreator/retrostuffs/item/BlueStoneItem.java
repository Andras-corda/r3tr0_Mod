
package net.mcreator.retrostuffs.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class BlueStoneItem extends Item {
	public BlueStoneItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
