package com.xiaolin.xiaolib.util;

import com.xiaolin.xiaolib.XiaoLib;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModTags {

    public static class Blocks {

        public static final TagKey<Block> TRIPWIRE_HOOKS = TagKey.of(Registry.BLOCK_KEY, new Identifier(
                XiaoLib.MOD_ID, "tripwire_hooks"));
    }

    public static class Items{

        public static final TagKey<Item> TRIPWIRE_HOOKS = TagKey.of(Registry.ITEM_KEY, new Identifier(
                XiaoLib.MOD_ID, "tripwire_hooks"));

        public static final TagKey<Item> HOES = TagKey.of(Registry.ITEM_KEY, new Identifier(
                XiaoLib.MOD_ID, "hoes"));

        public static final TagKey<Item> SWORDS = TagKey.of(Registry.ITEM_KEY, new Identifier(
                XiaoLib.MOD_ID, "swords"));

    }

}
