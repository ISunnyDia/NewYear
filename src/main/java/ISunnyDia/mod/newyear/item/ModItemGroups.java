package ISunnyDia.mod.newyear.item;

import ISunnyDia.mod.newyear.Newyear;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModItemGroups {
    public static void initialize() {}
    public static final ResourceKey<CreativeModeTab> GROUP_ID = ResourceKey.create(BuiltInRegistries.CREATIVE_MODE_TAB.key(), Identifier.fromNamespaceAndPath(Newyear.MOD_ID, "item_group"));
    public static final CreativeModeTab CUSTOM_ITEM_GROUP = FabricItemGroup.builder()
            .icon(() -> new ItemStack(ModItems.CANDY))
            .title(Component.translatable("itemGroup.newyear"))
            .build();
    public static void registerItemGroups() {
        Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, GROUP_ID, CUSTOM_ITEM_GROUP);

        ItemGroupEvents.modifyEntriesEvent(GROUP_ID).register(itemGroup -> {
            itemGroup.accept(ModItems.CANDY);
            itemGroup.accept(ModItems.KRENDEL);
            itemGroup.accept(ModItems.SNOWBALLS);
        });
    }
;
}
