package com.mofakin.recscom.config;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import com.mofakin.recscom.RecscomMain;

import net.minecraft.client.Minecraft;

public final class RecscomConfig{
	
    /*private static final ForgeConfigSpec SPEC;
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    
    private static final ForgeConfigSpec.ConfigValue<List<? extends List<?>>> boilerItems;
    private static final ForgeConfigSpec.ConfigValue<List<? extends List<?>>> iceBoxItems;
    private static final ForgeConfigSpec.ConfigValue<List<? extends List<?>>> hearthItems;
    private static final ForgeConfigSpec.ConfigValue<List<? extends String>> soulLampItems;
    private static final ForgeConfigSpec.ConfigValue<List<? extends String>> insulatingItems;
    private static final ForgeConfigSpec.ConfigValue<List<? extends List<?>>> insulatingArmor;
    private static final ForgeConfigSpec.ConfigValue<List<? extends List<?>>> temperatureFoods;
    
    public static final RecscomConfig INSTANCE = new RecscomConfig();
    
    static
    {

        BUILDER.push("BoilerFuelItems");
        boilerItems = BUILDER
            .comment("Defines the items that the Boiler can use as fuel and their values",
                    "Format: [[item-id-1, fuel-amount-1], [item-id-2, fuel-amount-2], ...etc]")
            .defineList("Boiler", Arrays.asList
                    (
                        Arrays.asList("minecraft:coal", 37),
                        Arrays.asList("minecraft:charcoal", 37),
                        Arrays.asList("minecraft:coal_block", 333),
                        Arrays.asList("minecraft:magma_block", 333),
                        Arrays.asList("minecraft:lava_bucket", 1000),
                        Arrays.asList("matlib:organicbitumen", 37),
                        Arrays.asList("matlib:organicblackcoal", 74),
                        Arrays.asList("matlib:organicbrowncoal", 55),
                        Arrays.asList("matlib:organicgraphite", 89),
                        Arrays.asList("matlib:organicpitch", 18),
                        Arrays.asList("matlib:bucketoil", 500)
                    ),
                    it -> ((List) it).get(0) instanceof String && ((List) it).get(1) instanceof Number);
        BUILDER.pop();
        
        BUILDER.push("IceboxFuelItems");
        iceBoxItems = BUILDER
            .comment("Defines the items that the Ice Box can use as fuel and their values",
                    "Format: [[item-id-1, fuel-amount-1], [item-id-2, fuel-amount-2], ...etc]")
            .defineList("Icebox", Arrays.asList
                    (
                        Arrays.asList("minecraft:snowball", 37),
                        Arrays.asList("minecraft:clay", 37),
                        Arrays.asList("minecraft:snow_block", 333),
                        Arrays.asList("minecraft:water_bucket", 333),
                        Arrays.asList("minecraft:ice", 333),
                        Arrays.asList("minecraft:packed_ice", 1000)
                    ),
                    it -> ((List) it).get(0) instanceof String && ((List) it).get(1) instanceof Number);
        BUILDER.pop();        

        BUILDER.push("HearthFuelItems");
        hearthItems = BUILDER
            .comment("Defines the items that the Hearth can use as fuel and their values",
                    "Format: [[item-id-1, fuel-amount-1], [item-id-2, fuel-amount-2], ...etc]",
                    "(negative values indicate cold fuel)")
            .defineList("Hearth", Arrays.asList
                    (
                        Arrays.asList("minecraft:coal", 37),
                        Arrays.asList("minecraft:charcoal", 37),
                        Arrays.asList("minecraft:coal_block", 333),
                        Arrays.asList("minecraft:magma_block", 333),
                        Arrays.asList("minecraft:lava_bucket", 1000),
                        
                        Arrays.asList("matlib:organicbitumen", 37),
                        Arrays.asList("matlib:organicblackcoal", 74),
                        Arrays.asList("matlib:organicbrowncoal", 55),
                        Arrays.asList("matlib:organicgraphite", 89),
                        Arrays.asList("matlib:organicpitch", 18),
                        Arrays.asList("matlib:bucketoil", 500),
                        
                        Arrays.asList("minecraft:snowball", -37),
                        Arrays.asList("minecraft:clay", -37),
                        Arrays.asList("minecraft:snow_block", -333),
                        Arrays.asList("minecraft:water_bucket", -333),
                        Arrays.asList("minecraft:ice", -333),
                        Arrays.asList("minecraft:packed_ice", -1000)
                    ),
                    it -> ((List) it).get(0) instanceof String && ((List) it).get(1) instanceof Number);
        BUILDER.pop();
        
        BUILDER.push("HellspringLampItems");
        soulLampItems = BUILDER
            .comment("Defines the items that the Ice Box can use as fuel and their values",
                    "Format: [[item-id-1, fuel-amount-1], [item-id-2, fuel-amount-2], ...etc]")
            .defineList("Soulfire Lamp", Arrays.asList
                    (
                            "minecraft:warped_stem",
                            "minecraft:warped_hyphae",
                            "minecraft:stripped_warped_stem",
                            "minecraft:stripped_warped_hyphae",
                            "minecraft:crimson_stem",
                            "minecraft:crimson_hyphae",
                            "minecraft:stripped_crimson_stem",
                            "minecraft:stripped_crimson_hyphae"
                    ),
                    it -> it instanceof String);
        BUILDER.pop();        
        
        BUILDER.push("InsulatorItems");
        insulatingItems = BUILDER
            .comment("Defines the items that can be used for insulating armor in the Sewing Table",
                    "Format: [[item-id-1], [item-id-2], ...etc]")
            .defineList("Sewing Table", Arrays.asList
                    (
                        "minecraft:leather_helmet",
                        "minecraft:leather_chestplate",
                        "minecraft:leather_leggings",
                        "minecraft:leather_boots",
                    		
                        "releqt:bootscanvas",
                        "releqt:chestplatecanvas",
                        "releqt:leggingscanvas",
                        "releqt:helmetcanvas",
                        "releqt:bootsfur",
                        "releqt:chestplatefur",
                        "releqt:leggingsfur",
                        "releqt:helmetfur",
                        "releqt:bootsleather",
                        "releqt:chestplateleather",
                        "releqt:leggingsleather",
                        "releqt:helmetleather"
                    ),
                    it -> it instanceof String);
        BUILDER.pop();

        BUILDER.push("InsulatingArmor");
        insulatingArmor = BUILDER
            .comment("Defines the items that provide insulation when worn",
                    "Format: [[item-id-1, amount-1], [item-id-2, amount-2], ...etc]")
            .defineList("Insulating Armor Items", Arrays.asList
                    (
                            Arrays.asList("minecraft:leather_helmet", 4),
                            Arrays.asList("minecraft:leather_chestplate", 7),
                            Arrays.asList("minecraft:leather_leggings", 5),
                            Arrays.asList("minecraft:leather_boots", 4),
                    		
                            Arrays.asList("releqt:bootscanvas", 5),
                            Arrays.asList("releqt:chestplatecanvas", 8),
                            Arrays.asList("releqt:leggingscanvas", 6),
                            Arrays.asList("releqt:helmetcanvas", 5),
                            Arrays.asList("releqt:bootsfur", 6),
                            Arrays.asList("releqt:chestplatefur", 9),
                            Arrays.asList("releqt:leggingsfur", 7),
                            Arrays.asList("releqt:helmetfur", 6),
                            Arrays.asList("releqt:bootsleather", 4),
                            Arrays.asList("releqt:chestplateleather", 7),
                            Arrays.asList("releqt:leggingsleather", 5),
                            Arrays.asList("releqt:helmetleather", 4)
                    ),
                    it -> ((List) it).get(0) instanceof String && ((List) it).get(1) instanceof Number);
        BUILDER.pop();
        
        BUILDER.push("TemperatureFoods");
        temperatureFoods = BUILDER
            .comment("Defines items that affect the player's temperature when consumed",
                    "Format: [[item-id-1, amount-1], [item-id-2, amount-2], ...etc]",
                    "Negative values are cold foods, positive values are hot foods")
            .defineList("Temperature-Affecting Foods", Arrays.asList
                    (
                            // nothing here
                    ),
                    it -> ((List<?>) it).get(0) instanceof String && ((List<?>) it).get(1) instanceof Number);
        BUILDER.pop();        

        SPEC = BUILDER.build();
    }*/
    
    public static void setup() {
    	
        /*Path configPath = FMLPaths.CONFIGDIR.get();
        Path csConfigPath = Paths.get(configPath.toAbsolutePath().toString(), "coldsweat");

        try {
            Files.createDirectory(csConfigPath);
        }
        catch (Exception e) {}

        ModLoadingContext.get().registerConfig(net.minecraftforge.fml.config.ModConfig.Type.COMMON, SPEC, "coldsweat/recscom_settings.toml");*/
    	
    	@SuppressWarnings("resource")
		File configPath = new File(Minecraft.getInstance().gameDirectory + "/config/coldsweat", "item_settings.toml");
    	InputStream inputStream = RecscomMain.class.getResourceAsStream("/assets/recscom/item_settings.toml");
    	
    	try {
    		com.google.common.io.Files.asByteSink(configPath).writeFrom(inputStream);
			inputStream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
    
    /*public static RecscomConfig getInstance() {
        return new RecscomConfig();
    }

    public List<? extends List<?>> boilerItems() {
        return boilerItems.get();
    }
    
    public List<? extends List<?>> iceboxItems() {
        return iceBoxItems.get();
    }

    public List<? extends List<?>> hearthItems() {
        return hearthItems.get();
    }

    public List<? extends String> insulatingItems() {
        return insulatingItems.get();
    }

    public List<? extends List<?>> insulatingArmor() {
        return insulatingArmor.get();
    }
    
    public List<? extends String> soulLampItems() {
        return soulLampItems.get();
    }

    public List<? extends List<?>> temperatureFoods() {
        return temperatureFoods.get();
    }*/
}