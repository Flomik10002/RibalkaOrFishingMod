package ribalka.fishing.register;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import ribalka.fishing.RibalkaOrFishingMod;

public class RegisterBlocks {

    public static final Block FISHING_BLOCK = registerBlock("fishing_block",
            new Block(FabricBlockSettings.copyOf(Blocks.BAMBOO_PLANKS)));

    public static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(RibalkaOrFishingMod.MOD_ID, name), block);
    }

    public static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(RibalkaOrFishingMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerBlocks() {
        RibalkaOrFishingMod.LOGGER.info("Registering Blocks " + RibalkaOrFishingMod.MOD_ID);
    }
}
