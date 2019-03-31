package net.minecraftforge.fml.adahel.relauncher;

import java.util.Map;

import net.minecraftforge.fml.relauncher.IFMLLoadingPlugin;

@IFMLLoadingPlugin.MCVersion("1.8.9")
public class FMLRegistryPlugin implements IFMLLoadingPlugin
{
	@Override
	public String[] getASMTransformerClass()
	{
		return new String[] { "net.minecraftforge.fml.adahel.common.asm.transformers.RegistryTransformer" };
	}

	@Override
	public String getModContainerClass()
	{
		return "net.minecraftforge.fml.adahel.common.FMLRegistryModContainer";
	}

	@Override
	public String getSetupClass()
	{
		return null;
	}

	@Override
	public void injectData(Map<String, Object> data) {}

	@Override
	public String getAccessTransformerClass() 
	{
		return null;
	}
}