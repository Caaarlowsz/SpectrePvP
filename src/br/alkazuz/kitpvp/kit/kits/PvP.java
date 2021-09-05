package br.alkazuz.kitpvp.kit.kits;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import br.alkazuz.kitpvp.kit.Kit;

public class PvP extends Kit {

	public PvP() {
		super("PvP", 0, true, new ItemStack(Material.STONE_SWORD), false, "kit.pvp", true,
				new String[] { " ", " §e§l⚊ §7Kit sem habilidade." });
	}

}
