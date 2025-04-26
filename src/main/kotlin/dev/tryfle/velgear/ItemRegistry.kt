package dev.tryfle.velgear

import dev.tryfle.velgear.armor.VelvetNetheriteArmorMaterial
import dev.tryfle.velgear.util.ItemType
import dev.tryfle.velgear.util.ModItems
import net.minecraft.item.*
import net.minecraft.item.equipment.EquipmentType
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

    val VELVET_NETHERITE_AXE: Item = ModItems.register(
        "velvet_netherite_axe",
        { AxeItem(VELVET_NETHERITE_TOOL_MATERIAL, 9f, -2.9F, it) },
        Item.Settings()
            .maxCount(1)
            .rarity(Rarity.EPIC)
            .useCooldown(1.4f)
            .fireproof(),
        ItemType.TOOLS
    )

    val VELVET_NETHERITE_SHOVEL: Item = ModItems.register(
        "velvet_netherite_shovel",
        { ShovelItem(VELVET_NETHERITE_TOOL_MATERIAL, 5f, -3.0F, it) },
        Item.Settings()
            .maxCount(1)
            .rarity(Rarity.EPIC)
            .useCooldown(1.4f)
            .fireproof(),
        ItemType.TOOLS
    )

    val VELVET_NETHERITE_HOE: Item = ModItems.register(
        "velvet_netherite_hoe",
        { HoeItem(VELVET_NETHERITE_TOOL_MATERIAL, 0f, -2.5F, it) },
        Item.Settings()
            .maxCount(1)
            .rarity(Rarity.EPIC)
            .useCooldown(1.4f)
            .fireproof(),
        ItemType.TOOLS
    )

    val VELVET_NETHERITE_HELMET: Item = ModItems.register(
        "velvet_netherite_helmet",
        { ArmorItem(VelvetNetheriteArmorMaterial.INSTANCE, EquipmentType.HELMET, it) },
        Item.Settings()
            .maxCount(1)
            .rarity(Rarity.EPIC)
            .maxDamage(VelvetNetheriteArmorMaterial.BASE_DURABILITY)
            .fireproof(),
        ItemType.COMBAT
    )

    val VELVET_NETHERITE_CHESTPLATE: Item = ModItems.register(
        "velvet_netherite_chestplate",
        { ArmorItem(VelvetNetheriteArmorMaterial.INSTANCE, EquipmentType.CHESTPLATE, it) },
        Item.Settings()
            .maxCount(1)
            .rarity(Rarity.EPIC)
            .maxDamage(VelvetNetheriteArmorMaterial.BASE_DURABILITY)
            .fireproof(),
        ItemType.COMBAT
    )

    val VELVET_NETHERITE_LEGGINGS: Item = ModItems.register(
        "velvet_netherite_leggings",
        { ArmorItem(VelvetNetheriteArmorMaterial.INSTANCE, EquipmentType.LEGGINGS, it) },
        Item.Settings()
            .maxCount(1)
            .rarity(Rarity.EPIC)
            .maxDamage(VelvetNetheriteArmorMaterial.BASE_DURABILITY)
            .fireproof(),
        ItemType.COMBAT
    )

    val VELVET_NETHERITE_BOOTS: Item = ModItems.register(
        "velvet_netherite_boots",
        { ArmorItem(VelvetNetheriteArmorMaterial.INSTANCE, EquipmentType.BOOTS, it) },
        Item.Settings()
            .maxCount(1)
            .rarity(Rarity.EPIC)
            .maxDamage(VelvetNetheriteArmorMaterial.BASE_DURABILITY)
            .fireproof(),
        ItemType.COMBAT
    )

    fun register() {
        // Calling this initializes this object.
    }
}