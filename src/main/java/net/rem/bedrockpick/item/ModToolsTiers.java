package net.rem.bedrockpick.item;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.TierSortingRegistry;
import net.rem.bedrockpick.BedRockPick;


import java.util.List;

public class ModToolsTiers {

        public static final Tier BEDROCK_PICK = TierSortingRegistry.registerTier(
                new ForgeTier(5, 1500, -10f, 0f, 25,
                        Tags.Blocks.NEEDS_NETHERITE_TOOL, () -> Ingredient.of(Blocks.BEDROCK)),
                new ResourceLocation(BedRockPick.MOD_ID, "boot"), List.of(Tiers.NETHERITE), List.of());

    }



