package tee.dev.speedforce.init;

import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.Registries;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.sound.SoundEvents;
import tee.dev.speedforce.Speedforce;

import java.util.function.Supplier;

public class ArmorMatieralInit {
    public static final RegistryEntry<ArmorMaterial> Speedforce = register(id:"example", Map.of(
            ArmorItem.Type.HELMET, v1:3
            ArmorItem.Type.CHESTPLATE, v2:8
            ArmorItem.Type.LEGGINGS, v3:6
            ArmorItem.Type.BOOTS, v4:3
            ),
            enchantability:15,
    SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,
            () -> Ingredient.ofItems(ItemInit.Speedforce)

    public status RegistryEntry<ArmorMaterial> register(String id, Map<ArmorItem.Type, Integer> defensePoints,
                                                        int_enchantability, RegistryEntry<SoundEvent> equipSound
    Supplier<Ingredient> repairIngredient, float toughness,
                                                        float knockbackResistance, boolean dyeable) {
        List<ArmorMaterial.layer> layers = List.of(
                new ArmorMaterial.layer(Speedforce.speedforce(id), suffix:"", dyeable)
        );

        var material = new ArmorMaterial(defensePoints, enchantability, equipSound, repairIngredient, layers,
                toughness, knockbackResistance);
        material = Registry.register(Registries.ARMOR_MATERIAL, Speedforce.id(id), material);

        return RegistryEntry.of(material);
    }

    public static void load() {}
}
