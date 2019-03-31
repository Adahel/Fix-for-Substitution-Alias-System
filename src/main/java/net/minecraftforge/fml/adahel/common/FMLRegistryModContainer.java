package net.minecraftforge.fml.adahel.common;

import java.util.Arrays;

import com.google.common.eventbus.EventBus;

import net.minecraftforge.fml.common.DummyModContainer;
import net.minecraftforge.fml.common.LoadController;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.ModMetadata;

@Mod(modid = FMLRegistryModContainer.MODID, name = FMLRegistryModContainer.NAME, version = FMLRegistryModContainer.VERSION, acceptedMinecraftVersions = FMLRegistryModContainer.MC_VERSION)
public class FMLRegistryModContainer extends DummyModContainer
{
    public static final String MODID = "FMLRegistryMod";
    public static final String NAME = "Fix for Substitution Alias System";
    public static final String VERSION = "1.0";
    public static final String MC_VERSION = "1.8.9";

    public FMLRegistryModContainer()
    {
    	super(new ModMetadata());
    	ModMetadata modmetadata = super.getMetadata();
    	modmetadata.modId = MODID;
    	modmetadata.name = NAME;
    	modmetadata.version = VERSION;
    	modmetadata.description = "This mod fixes the substitution alias system.";
    	modmetadata.authorList = Arrays.asList(new String[] { "Adahel" });
    	modmetadata.url = "https://github.com/Adahel/Fix-for-Substitution-Alias-System";
    }

    @Override
    public boolean registerBus(EventBus bus, LoadController controller)
    {
    	return true;
    }
}