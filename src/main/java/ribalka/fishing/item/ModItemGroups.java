package ribalka.fishing.item;


import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import ribalka.fishing.RibalkaOrFishingMod;
import ribalka.fishing.register.RegisterBlocks;

public class ModItemGroups {
    public static final ItemGroup RIBALKA_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(RibalkaOrFishingMod.MOD_ID, "ribalka"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.ribalka"))
                    .icon(() -> new ItemStack(Items.FISHING_ROD)).entries((displayContext, entries) -> {
                        entries.add(RegisterBlocks.FISHING_BLOCK);
                    }).build());

    public static void registerItemGroups() {
        RibalkaOrFishingMod.LOGGER.info("Registering ItemGroups " + RibalkaOrFishingMod.MOD_ID);
    }
}
