package com.xiaolin.xiaolib.util;

import net.minecraft.block.Blocks;
import net.minecraft.structure.rule.BlockMatchRuleTest;
import net.minecraft.structure.rule.RuleTest;

public class RuleTestGlobals {

    public static final RuleTest END_STONE = new BlockMatchRuleTest(Blocks.END_STONE);

    public static final RuleTest SAND = new BlockMatchRuleTest(Blocks.SAND);

    public static final RuleTest AIR = new BlockMatchRuleTest(Blocks.AIR);
}
