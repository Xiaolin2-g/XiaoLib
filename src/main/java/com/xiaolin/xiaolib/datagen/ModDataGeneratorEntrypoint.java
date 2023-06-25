package com.xiaolin.xiaolib.datagen;

import com.xiaolin.xiaolib.XiaoLib;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class ModDataGeneratorEntrypoint implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        XiaoLib.LOGGER.info("/////////////DATAGEN INITIALIZED//////////////");
    }
}
