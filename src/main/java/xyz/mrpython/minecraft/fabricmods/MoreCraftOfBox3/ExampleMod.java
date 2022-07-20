package xyz.mrpython.minecraft.fabricmods.MoreCraftOfBox3;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ExampleMod implements ModInitializer {
    //创建方块实例
    public static final Block Dirt = new Block(FabricBlockSettings.of(Material.SOIL).hardness(-1.0f).resistance(3600000.0f));
    public static final Block Grass = new Block(FabricBlockSettings.of(Material.SOIL).hardness(-1.0f).resistance(3600000.0f));
    public static final Block Stone = new Block(FabricBlockSettings.of(Material.SOIL).hardness(-1.0f).resistance(3600000.0f));
    //创建物品组
    public static final ItemGroup NATURE = FabricItemGroupBuilder.build(new Identifier("box3blocks", "nature"), () -> new ItemStack(Dirt));

    @Override
    public void onInitialize() {
        Registry.register(Registry.BLOCK, new Identifier("box3blocks", "dirt"), Dirt);
        Registry.register(Registry.ITEM, new Identifier("box3blocks", "dirt"), new BlockItem(Dirt, new Item.Settings().group(NATURE)));

        Registry.register(Registry.BLOCK, new Identifier("box3blocks", "grass"), Grass);
        Registry.register(Registry.ITEM, new Identifier("box3blocks", "grass"), new BlockItem(Grass, new Item.Settings().group(NATURE)));

        Registry.register(Registry.BLOCK, new Identifier("box3blocks", "stone"), Stone);
        Registry.register(Registry.ITEM, new Identifier("box3blocks", "stone"), new BlockItem(Stone, new Item.Settings().group(NATURE)));
    }
}
