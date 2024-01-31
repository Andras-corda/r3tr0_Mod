
package net.mcreator.retrostuffs.item;

import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.InteractionResult;

import net.mcreator.retrostuffs.procedures.RemoteToolRightclickedOnBlockProcedure;

public class RemoteToolItem extends Item {
	public RemoteToolItem() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.COMMON));
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		super.useOn(context);
		RemoteToolRightclickedOnBlockProcedure.execute(context.getLevel(), context.getClickedPos().getX(), context.getClickedPos().getY(), context.getClickedPos().getZ(), context.getPlayer(), context.getItemInHand());
		return InteractionResult.SUCCESS;
	}
}
