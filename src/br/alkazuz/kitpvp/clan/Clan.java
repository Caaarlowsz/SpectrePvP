package br.alkazuz.kitpvp.clan;

import java.util.ArrayList;

import br.alkazuz.kitpvp.api.ClanAPI;
import br.alkazuz.kitpvp.config.ClanConfig;

public class Clan {

	public String clanname;

	public Clan(String name) {
		clanname = name;
	}

	public String getName() {
		return clanname;
	}

	public void delete() {
		if (ClanConfig.getConfig().get(getName()) != null) {
			ArrayList<String> aliados = ClanAPI.getMembers(getName());
			for (String ali : aliados) {
				ClanAPI.kickPlayer(ali, getName());
			}
			ClanConfig.getConfig().set(getName() + ".Name", null);
			ClanConfig.getConfig().set(getName() + ".Tag", null);
			ClanConfig.getConfig().set(getName() + ".Dono", null);
			ClanConfig.getConfig().set(getName() + ".Kills", null);
			ClanConfig.getConfig().set(getName() + ".Membros", null);
			ClanConfig.getConfig().set(getName(), null);
			ClanConfig.saveConfigs();
		}
	}

}
