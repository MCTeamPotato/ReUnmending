package com.teampotato.reunmending;

import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

@Mod(Unmending.ID)
@Mod.EventBusSubscriber(modid = Unmending.ID)
public class Unmending {
    public static final String ID = "reunmending";
    public static final Logger LOGGER = LoggerFactory.getLogger("ReUnmending");

    public static ForgeConfigSpec CONFIG;
    public static ForgeConfigSpec.BooleanValue TOOLTIPS;
    public static ForgeConfigSpec.ConfigValue<Integer> COLOR;
    static {
        ForgeConfigSpec.Builder builder = new ForgeConfigSpec.Builder();
        builder.push("ReUnmending");
        TOOLTIPS = builder
                .comment("If true, display tooltips after using an anvil; if false, do not display.")
                .define("Tooltips", true);
        COLOR = builder
                .comment("Set the color of tooltips.")
                .define("Color", 0xFFFF55);
        builder.pop();
        CONFIG = builder.build();
    }
    public Unmending() {
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, CONFIG);
    }
}
