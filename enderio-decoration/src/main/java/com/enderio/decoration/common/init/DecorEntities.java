package com.enderio.decoration.common.init;

import com.enderio.decoration.EIODecor;
import com.enderio.decoration.client.renderer.entity.PaintedSandRenderer;
import com.enderio.decoration.common.entity.PaintedSandEntity;
import com.tterrag.registrate.Registrate;
import com.tterrag.registrate.util.entry.EntityEntry;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;

public class DecorEntities {

    private static final Registrate REGISTRATE = EIODecor.registrate();

    public static final EntityEntry<PaintedSandEntity> PAINTED_SAND = REGISTRATE
        .entity("painted_sand", (EntityType.EntityFactory<PaintedSandEntity>) PaintedSandEntity::new, MobCategory.MISC)
        .renderer(() -> PaintedSandRenderer::new)
        .lang("Painted Sand")
        .register();

    public static void classload() {}
}
