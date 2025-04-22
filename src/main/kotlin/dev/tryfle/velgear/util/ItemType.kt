package dev.tryfle.velgear.util

import net.minecraft.item.ItemGroup
import net.minecraft.item.ItemGroups
import net.minecraft.registry.RegistryKey

enum class ItemType(val itemGroup: RegistryKey<ItemGroup>) {
    INGREDIENTS(ItemGroups.INGREDIENTS),
    TOOLS(ItemGroups.TOOLS),
    BLOCKS(ItemGroups.BUILDING_BLOCKS),
    COMBAT(ItemGroups.COMBAT),
    FOOD(ItemGroups.FOOD_AND_DRINK),

}