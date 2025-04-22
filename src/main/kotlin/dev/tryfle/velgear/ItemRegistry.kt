package dev.tryfle.velgear

import dev.tryfle.velgear.util.ItemType
import dev.tryfle.velgear.util.ModItems
import net.minecraft.item.Item
import net.minecraft.item.PickaxeItem
import net.minecraft.item.SwordItem
import net.minecraft.item.ToolMaterial
import net.minecraft.registry.tag.BlockTags
import net.minecraft.util.Rarity

object ItemRegistry {

    val VELVET_NETHERITE: Item = ModItems.register(
        "velvet_netherite",
        { Item(it) },
        Item.Settings()
            .maxCount(64)
            .rarity(Rarity.EPIC)
            .fireproof(),
        ItemType.INGREDIENTS
    )

    val VELVET_DUST: Item = ModItems.register(
        "velvet_dust",
        { Item(it) },
        Item.Settings()
            .maxCount(64)
            .rarity(Rarity.RARE)
            .fireproof(),
        ItemType.INGREDIENTS
    )

    val HEAVY_NETHERITE: Item = ModItems.register(
        "heavy_netherite",
        { Item(it) },
        Item.Settings()
            .maxCount(64)
            .rarity(Rarity.EPIC)
            .fireproof(),
        ItemType.INGREDIENTS
    )

    val VELVET_NETHERITE_TOOL_MATERIAL = ToolMaterial(
        BlockTags.INCORRECT_FOR_NETHERITE_TOOL,
        1250,
        12F,
        1.0F,
        14,
        null
    )

    val VELVET_NETHERITE_SWORD: Item = ModItems.register(
        "velvet_netherite_sword",
        { SwordItem(VELVET_NETHERITE_TOOL_MATERIAL, 7F, -2.2F, it) },
        Item.Settings()
            .maxCount(1)
            .rarity(Rarity.EPIC)
            .fireproof(),
        ItemType.COMBAT
    )

    val VELVET_NETHERITE_PICKAXE: Item = ModItems.register(
        "velvet_netherite_pickaxe",
        { PickaxeItem(VELVET_NETHERITE_TOOL_MATERIAL, 4f, -2.8F, it) },
        Item.Settings()
            .maxCount(1)
            .rarity(Rarity.EPIC)
            .useCooldown(1.4f)
            .fireproof(),
        ItemType.TOOLS
    )

    fun register() {
        // Calling this initializes this object.
    }
}