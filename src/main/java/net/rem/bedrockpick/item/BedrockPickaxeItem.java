package net.rem.bedrockpick.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Tier;

/**
 * A simple pickaxe item with one durability for breaking bedrock once.
 */
public class BedrockPickaxeItem extends PickaxeItem {
    public BedrockPickaxeItem(Tier tier, Item.Properties properties) {
        super(tier, 1, -2.8F, properties.durability(1));
    }
}