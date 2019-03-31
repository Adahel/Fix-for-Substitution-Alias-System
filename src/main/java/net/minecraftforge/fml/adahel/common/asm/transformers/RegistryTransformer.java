package net.minecraftforge.fml.adahel.common.asm.transformers;

import org.apache.commons.io.IOUtils;
import org.apache.logging.log4j.Level;

import com.google.common.base.Throwables;

import net.minecraft.launchwrapper.IClassTransformer;
import net.minecraftforge.fml.relauncher.FMLRelaunchLog;

public class RegistryTransformer implements IClassTransformer
{
    @Override
	public byte[] transform(String name, String transformedName, byte[] basicClass)
	{
    	try
    	{
	    	if (name.equals("FMLControlledNamespacedRegistry"))
	    		return IOUtils.toByteArray(getClass().getResourceAsStream("net.minecraftforge.fml.adahel.common.registry.FMLControlledNamespacedRegistryFix.class"));
	    	else if (name.equals("AddCallback"))
	    		return IOUtils.toByteArray(getClass().getResourceAsStream("net.minecraftforge.fml.adahel.common.registry.AddCallbackFix.class"));
	    	else if (name.equals("GameData"))
	    		return IOUtils.toByteArray(getClass().getResourceAsStream("net.minecraftforge.fml.adahel.common.registry.GameDataFix.class"));
	    	else if (name.equals("BlockStateCapture"))
	    		return IOUtils.toByteArray(getClass().getResourceAsStream("net.minecraftforge.fml.adahel.common.registry.BlockStateCaptureFix.class"));
	    	else if (name.equals("ItemBlockCapture"))
	    		return IOUtils.toByteArray(getClass().getResourceAsStream("net.minecraftforge.fml.adahel.common.registry.ItemBlockCaptureFix.class"));
	    	else if (name.equals("PotionArrayCapture"))
	    		return IOUtils.toByteArray(getClass().getResourceAsStream("net.minecraftforge.fml.adahel.common.registry.PotionArrayCaptureFix.class"));
    	}
    	catch (Exception e)
    	{
    		FMLRelaunchLog.log(Level.FATAL, e, "Cannot fix substitution alias system, this is fatal!", new Object[0]);
    		throw Throwables.propagate(e);
    	}

    	return basicClass;
	}
}