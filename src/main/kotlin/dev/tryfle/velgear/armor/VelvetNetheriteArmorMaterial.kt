package dev.tryfle.velgear.armor

import dev.tryfle.velgear.ItemRegistry
import dev.tryfle.velgear.Velgear
import dev.tryfle.velgear.util.ItemType
import dev.tryfle.velgear.util.ModItems
import net.minecraft.item.ArmorItem
import net.minecraft.item.Item
import net.minecraft.item.equipment.ArmorMaterial
import net.minecraft.item.equipment.EquipmentAsset
import net.minecraft.item.equipment.EquipmentAssetKeys
import net.minecraft.item.equipment.EquipmentType
import net.minecraft.registry.RegistryKey
import net.minecraft.registry.RegistryKeys
import net.minecraft.registry.tag.TagKey
import net.minecraft.sound.SoundEvents
import net.minecraft.util.Identifier
import net.minecraft.util.Rarity

object VelvetNetheriteArmorMaterial {

    const val BASE_DURABILITY: Int = 27

    val VELVET_NETHERITE_TAG: TagKey<Item> = TagKey.of(RegistryKeys.ITEM, Identifier.of("velgear", "velvet_netherite_tag"))

    val VELVET_NETHERITE_ARMOR_MATERIAL_KEY: RegistryKey<EquipmentAsset> = RegistryKey.of(
        EquipmentAssetKeys.REGISTRY_KEY,
        Identifier.of(Velgear.MOD_ID, "velvet_netherite_armor_material")
    )

    val INSTANCE: ArmorMaterial = ArmorMaterial(
        BASE_DURABILITY,
        mapOf(
        EquipmentType.HELMET to 2,
        EquipmentType.CHESTPLATE to 7,
        EquipmentType.LEGGINGS to 6,
        EquipmentType.BOOTS to 2
        ),
        10,
        SoundEvents.ITEM_ARMOR_EQUIP_CHAIN,
        2.5F,
        0F,
        VELVET_NETHERITE_TAG,
        VELVET_NETHERITE_ARMOR_MATERIAL_KEY
    )
}