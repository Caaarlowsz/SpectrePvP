package br.alkazuz.kitpvp.command.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import br.alkazuz.kitpvp.api.API;
import br.alkazuz.kitpvp.api.WarpAPI;
import br.alkazuz.kitpvp.kit.KitAPI;
import br.alkazuz.kitpvp.ks.KillStreakAPI;
import com.github.caaarlowsz.spectremc.kitpvp.SpectrePvP;
import br.alkazuz.kitpvp.parkour.ParkourAPI;
import br.alkazuz.kitpvp.protection.Protection;
import br.alkazuz.kitpvp.rdm.RDMApi;
import br.alkazuz.kitpvp.score.ScoreBoarding;
import br.alkazuz.kitpvp.simulador.EstadoHG;
import br.alkazuz.kitpvp.simulador.EventosAPI;

public class cSpawn implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender Sender, Command Cmd, String Label, String[] Args) {
		Player p = (Player) Sender;
		if (Cmd.getName().equalsIgnoreCase("spawn")) {
			p.sendMessage("�aTeleportando para o Spawn...");
			Bukkit.getScheduler().scheduleSyncDelayedTask(SpectrePvP.getPlugin(), new Runnable() {
				public void run() {
					WarpAPI.setWarp(p, "Spawn");
					API.sendItems(p);
					Protection.setImortal(p, true);
					KitAPI.removeKit(p);
					KillStreakAPI.resetKS(p);
					ScoreBoarding.setScoreBoard(p);
					ParkourAPI.delPlayer(p);
					RDMApi.delPlayer(p);
					if (EventosAPI.playerPlayingHG(p)) {
						EventosAPI.playersHG.remove(p.getName());
						if (SpectrePvP.EstadoHG != EstadoHG.INICIANDO) {
							for (Player pf : Bukkit.getOnlinePlayers()) {
								if (EventosAPI.playerPlayingHG(pf)) {
									EventosAPI.CheckarGanhador(pf);
								}
							}
						}
					}
				}
			}, 20L * 3L);
		}
		return false;
	}

}
