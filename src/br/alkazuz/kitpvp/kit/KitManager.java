package br.alkazuz.kitpvp.kit;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;

import br.alkazuz.kitpvp.kit.kits.Achilles;
import br.alkazuz.kitpvp.kit.kits.Ajnin;
import br.alkazuz.kitpvp.kit.kits.Anchor;
import br.alkazuz.kitpvp.kit.kits.AntiStomper;
import br.alkazuz.kitpvp.kit.kits.Batman;
import br.alkazuz.kitpvp.kit.kits.Camel;
import br.alkazuz.kitpvp.kit.kits.Critical;
import br.alkazuz.kitpvp.kit.kits.FireLauncher;
import br.alkazuz.kitpvp.kit.kits.Fisherman;
import br.alkazuz.kitpvp.kit.kits.Flash;
import br.alkazuz.kitpvp.kit.kits.Frosty;
import br.alkazuz.kitpvp.kit.kits.Gaara;
import br.alkazuz.kitpvp.kit.kits.Gladiator;
import br.alkazuz.kitpvp.kit.kits.Hulk;
import br.alkazuz.kitpvp.kit.kits.Kangaroo;
import br.alkazuz.kitpvp.kit.kits.Lucky;
import br.alkazuz.kitpvp.kit.kits.Magma;
import br.alkazuz.kitpvp.kit.kits.Monk;
import br.alkazuz.kitpvp.kit.kits.Ninja;
import br.alkazuz.kitpvp.kit.kits.Phantom;
import br.alkazuz.kitpvp.kit.kits.Poseidon;
import br.alkazuz.kitpvp.kit.kits.PvP;
import br.alkazuz.kitpvp.kit.kits.Quickdrop;
import br.alkazuz.kitpvp.kit.kits.Snail;
import br.alkazuz.kitpvp.kit.kits.Specialist;
import br.alkazuz.kitpvp.kit.kits.Stomper;
import br.alkazuz.kitpvp.kit.kits.Strong;
import br.alkazuz.kitpvp.kit.kits.Switcher;
import br.alkazuz.kitpvp.kit.kits.Thor;
import br.alkazuz.kitpvp.kit.kits.Timelord;
import br.alkazuz.kitpvp.kit.kits.Viper;
import com.github.caaarlowsz.spectremc.kitpvp.SpectrePvP;

public class KitManager {

	public static ArrayList<Kit> kits = new ArrayList<Kit>();

	public KitManager() {
		PluginManager pm = Bukkit.getServer().getPluginManager();
		kits.add(new PvP());
		kits.add(new Kangaroo());
		pm.registerEvents(new Kangaroo(), SpectrePvP.getPlugin());
		kits.add(new Ajnin());
		pm.registerEvents(new AntiStomper(), SpectrePvP.getPlugin());
		kits.add(new AntiStomper());
		pm.registerEvents(new Ajnin(), SpectrePvP.getPlugin());
		kits.add(new Gladiator());
		pm.registerEvents(new Gladiator(), SpectrePvP.getPlugin());
		kits.add(new Stomper());
		pm.registerEvents(new Stomper(), SpectrePvP.getPlugin());
		kits.add(new Anchor());
		pm.registerEvents(new Anchor(), SpectrePvP.getPlugin());
		kits.add(new FireLauncher());
		pm.registerEvents(new FireLauncher(), SpectrePvP.getPlugin());
		kits.add(new Fisherman());
		pm.registerEvents(new Fisherman(), SpectrePvP.getPlugin());
		kits.add(new Flash());
		pm.registerEvents(new Flash(), SpectrePvP.getPlugin());
		kits.add(new Hulk());
		pm.registerEvents(new Hulk(), SpectrePvP.getPlugin());
		kits.add(new Magma());
		pm.registerEvents(new Magma(), SpectrePvP.getPlugin());
		kits.add(new Monk());
		pm.registerEvents(new Monk(), SpectrePvP.getPlugin());
		kits.add(new Ninja());
		pm.registerEvents(new Ninja(), SpectrePvP.getPlugin());
		kits.add(new Phantom());
		pm.registerEvents(new Phantom(), SpectrePvP.getPlugin());
		kits.add(new Poseidon());
		pm.registerEvents(new Poseidon(), SpectrePvP.getPlugin());
		kits.add(new Snail());
		pm.registerEvents(new Snail(), SpectrePvP.getPlugin());
		kits.add(new Strong());
		pm.registerEvents(new Strong(), SpectrePvP.getPlugin());
		kits.add(new Quickdrop());
		pm.registerEvents(new Quickdrop(), SpectrePvP.getPlugin());
		kits.add(new Switcher());
		pm.registerEvents(new Switcher(), SpectrePvP.getPlugin());
		kits.add(new Thor());
		pm.registerEvents(new Thor(), SpectrePvP.getPlugin());
		kits.add(new Timelord());
		pm.registerEvents(new Timelord(), SpectrePvP.getPlugin());
		kits.add(new Viper());
		pm.registerEvents(new Viper(), SpectrePvP.getPlugin());
		kits.add(new Specialist());
		pm.registerEvents(new Specialist(), SpectrePvP.getPlugin());
		kits.add(new Camel());
		pm.registerEvents(new Camel(), SpectrePvP.getPlugin());
		kits.add(new Frosty());
		pm.registerEvents(new Frosty(), SpectrePvP.getPlugin());
		kits.add(new Gaara());
		pm.registerEvents(new Gaara(), SpectrePvP.getPlugin());
		kits.add(new Achilles());
		pm.registerEvents(new Achilles(), SpectrePvP.getPlugin());
		kits.add(new Critical());
		pm.registerEvents(new Critical(), SpectrePvP.getPlugin());
		kits.add(new Batman());
		pm.registerEvents(new Batman(), SpectrePvP.getPlugin());
		kits.add(new Lucky());
		pm.registerEvents(new Lucky(), SpectrePvP.getPlugin());

	}

	public static Kit getKit(String nome) {
		for (Kit kit : kits) {
			if (kit.getName().equalsIgnoreCase(nome)) {
				return kit;
			}
		}
		return null;
	}

}
