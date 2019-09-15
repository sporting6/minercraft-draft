package minercraft.block;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class TungstenOre extends Block {
	
	public TungstenOre(String name, Material material) {
		super(material);
		this.setUnlocalizedName(name);
		this.setRegistryName(name);
	}
}
