package br.alkazuz.kitpvp.simulador;

import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

import br.alkazuz.kitpvp.api.API;
import br.alkazuz.kitpvp.api.WarpAPI;
import com.github.caaarlowsz.spectremc.kitpvp.SpectrePvP;
import br.alkazuz.kitpvp.score.ScoreBoarding;

public class SimuladorComandos implements CommandExecutor, Listener {
	@Override
	public boolean onCommand(CommandSender Sender, Command Cmd, String Label, String[] Args) {
		Player p = (Player) Sender;
		if (Cmd.getName().equalsIgnoreCase("asimulador")) {
			if (p.hasPermission("spectrepvp.admin")) {

			}
		}
		if (Cmd.getName().equalsIgnoreCase("simulador")) {
			if (EventosAPI.playerPlayingHG(p)) {
				p.sendMessage("�cVoc� j� est� no Simulador");
				return true;
			}
			if (SpectrePvP.EstadoHG == EstadoHG.ANDAMENTO || SpectrePvP.EstadoHG == EstadoHG.INVENCIVEL) {
				p.sendMessage("�cA partida est� em andamento, voc� ser� notificado quando a partida terminar!");
				return true;
			}
			if (!(WarpAPI.getWarp(p).equalsIgnoreCase("spawn"))) {
				p.sendMessage("�cPara poder entrar voc� precisa ir para o Spawn");
				return true;
			}
			WarpAPI.setWarp(p, "HGSpawn");
			EventosAPI.playersHG.add(p.getName());
			p.sendMessage("�aVoc� entrou no Simulador");
			p.sendMessage("�6�l! �fVoc� pode craftar sopas usando: cacto, flores, cacau ou at� mesmo os cogumelos!");
			p.sendMessage("�6�l! �fMinigame em �eBETA �fqualquer coisa reporte!");
			ScoreBoarding.setScoreBoard(p);
			p.getInventory().clear();
			for (Player pd : Bukkit.getOnlinePlayers()) {
				if (EventosAPI.playerPlayingHG(pd)) {
					ScoreBoarding.setScoreBoard(pd);
				}
			}
			p.getInventory().setItem(4,
					API.createItem(p, Material.FEATHER, "�eKits", new String[] { "" }, 1, (short) 0));
			if (EventosAPI.playersHG.size() <= 1) {
				SpectrePvP.EstadoHG = EstadoHG.INICIANDO;
				sTempoIniciar.CancelarTempo();
				sTempoIniciar.Iniciando = 121;
				new sTempoIniciar();
			}
			p.setGameMode(GameMode.SURVIVAL);
		}
		return true;
	}

}
