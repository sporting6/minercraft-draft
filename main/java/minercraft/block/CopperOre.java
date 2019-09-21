package minercraft.block;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class CopperOre extends Block {
	
	public CopperOre(String name, Material material) {
		super(material);
		this.setUnlocalizedName(name);
		this.setRegistryName(name);
	}
}
