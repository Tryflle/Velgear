package dev.tryfle.velgear.util

import dev.tryfle.velgear.Velgear
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents.ModifyEntries
import net.minecraft.item.Item
import net.minecraft.registry.Registries
import net.minecraft.registry.Registry
import net.minecraft.registry.RegistryKey
import net.minecraft.registry.RegistryKeys
import net.minecraft.util.Identifier


object ModItems {
    fun register(name: String?, itemFactory: (Item.Settings) -> Item, settings: Item.Settings, type: ItemType): Item {
        val itemKey = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Velgear.MOD_ID, name))

        val item: Item = itemFactory(settings.registryKey(itemKey))

        Registry.register(Registries.ITEM, itemKey, item)

        ItemGroupEvents.modifyEntriesEvent(type.itemGroup)
            .register(ModifyEntries { itemGroup: FabricItemGroupEntries -> itemGroup.add(item) })

        return item
    }
}