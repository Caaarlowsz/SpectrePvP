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
import br.alkazuz.kitpvp.main.Main;

public class KitManager {
	
	public static ArrayList<Kit> kits = new ArrayList<Kit>();
	
	public KitManager() {
		PluginManager pm = Bukkit.getServer().getPluginManager();
		kits.add(new PvP());
		kits.add(new Kangaroo());
		pm.registerEvents(new Kangaroo(), Main.getPlugin());
		kits.add(new Ajnin());
		pm.registerEvents(new AntiStomper(), Main.getPlugin());
		kits.add(new AntiStomper());
		pm.registerEvents(new Ajnin(), Main.getPlugin());
		kits.add(new Gladiator());
		pm.registerEvents(new Gladiator(), Main.getPlugin());
		kits.add(new Stomper());
		pm.registerEvents(new Stomper(), Main.getPlugin());
		kits.add(new Anchor());
		pm.registerEvents(new Anchor(), Main.getPlugin());
		kits.add(new FireLauncher());
		pm.registerEvents(new FireLauncher(), Main.getPlugin());
		kits.add(new Fisherman());
		pm.registerEvents(new Fisherman(), Main.getPlugin());
		kits.add(new Flash());
		pm.registerEvents(new Flash(), Main.getPlugin());
		kits.add(new Hulk());
		pm.registerEvents(new Hulk(), Main.getPlugin());
		kits.add(new Magma());
		pm.registerEvents(new Magma(), Main.getPlugin());
		kits.add(new Monk());
		pm.registerEvents(new Monk(), Main.getPlugin());
		kits.add(new Ninja());
		pm.registerEvents(new Ninja(), Main.getPlugin());
		kits.add(new Phantom());
		pm.registerEvents(new Phantom(), Main.getPlugin());
		kits.add(new Poseidon());
		pm.registerEvents(new Poseidon(), Main.getPlugin());
		kits.add(new Snail());
		pm.registerEvents(new Snail(), Main.getPlugin());
		kits.add(new Strong());
		pm.registerEvents(new Strong(), Main.getPlugin());
		kits.add(new Quickdrop());
		pm.registerEvents(new Quickdrop(), Main.getPlugin());
		kits.add(new Switcher());
		pm.registerEvents(new Switcher(), Main.getPlugin());
		kits.add(new Thor());
		pm.registerEvents(new Thor(), Main.getPlugin());
		kits.add(new Timelord());
		pm.registerEvents(new Timelord(), Main.getPlugin());
		kits.add(new Viper());
		pm.registerEvents(new Viper(), Main.getPlugin());
		kits.add(new Specialist());
		pm.registerEvents(new Specialist(), Main.getPlugin());
		kits.add(new Camel());
		pm.registerEvents(new Camel(), Main.getPlugin());
		kits.add(new Frosty());
		pm.registerEvents(new Frosty(), Main.getPlugin());
		kits.add(new Gaara());
		pm.registerEvents(new Gaara(), Main.getPlugin());
		kits.add(new Achilles());
		pm.registerEvents(new Achilles(), Main.getPlugin());
		kits.add(new Critical());
		pm.registerEvents(new Critical(), Main.getPlugin());
		kits.add(new Batman());
		pm.registerEvents(new Batman(), Main.getPlugin());
		kits.add(new Lucky());
		pm.registerEvents(new Lucky(), Main.getPlugin());
		
		
	}
	
	public static Kit getKit(String nome) {
		for(Kit kit :  kits) {
			if(kit.getName().equalsIgnoreCase(nome)) {
				return kit;
			}
		}
		return null;
	}

}
