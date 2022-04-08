
package com.nkwjg.swood.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import com.nkwjg.swood.itemgroup.SBStickItemGroup;
import com.nkwjg.swood.SwoodModElements;

@SwoodModElements.ModElement.Tag
public class Stick4Item extends SwoodModElements.ModElement {
	@ObjectHolder("swood:stick_4")
	public static final Item block = null;

	public Stick4Item(SwoodModElements instance) {
		super(instance, 9);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(SBStickItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("stick_4");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
