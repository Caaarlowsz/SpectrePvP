package br.alkazuz.kitpvp.command.commands;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import br.alkazuz.groupapi.api.GroupAPI;
import br.alkazuz.kitpvp.api.MessageAPI;
import br.alkazuz.kitpvp.config.Config;
import com.github.caaarlowsz.spectremc.kitpvp.SpectrePvP;
import br.alkazuz.kitpvp.v_1_8.TituloAPI;

public class cReport implements CommandExecutor {

	public static ArrayList<Player> delay = new ArrayList<Player>();

	@Override
	public boolean onCommand(CommandSender Sender, Command Cmd, String Label, String[] Args) {
		if (!(Sender instanceof Player)) {
			return false;
		}
		Player p = (Player) Sender;
		if (Cmd.getName().equalsIgnoreCase("report")) {
			if (delay.contains(p)) {
				p.sendMessage(MessageAPI.Command_Error + "Voc� est� em cooldown desse comando");
				return true;
			}
			if (Args.length <= 1) {
				p.sendMessage(MessageAPI.Command_Error + "Use /report <Nick> Motivo");
				return true;
			}
			String reportmsg = "";
			for (int i = 1; i < Args.length; i++) {
				reportmsg += Args[i] + " ";
			}
			Player reported = Bukkit.getPlayer(Args[0]);
			if (reported == p) {
				p.sendMessage(MessageAPI.Command_Error + "Voc� n�o pode reportar voc� mesmo");
			}
			if (reported == null) {
				p.sendMessage(MessageAPI.Command_Error + "Este jogador n�o est� online.");
				return true;
			}
			for (Player playeres : Bukkit.getOnlinePlayers()) {
				if (Config.getConfig().getBoolean("Grupo." + GroupAPI.getGroup(playeres) + ".VerReportes")) {
					playeres.sendMessage(" ");
					playeres.sendMessage("  �c�lREPORT");
					playeres.sendMessage("�eAcusado: �c" + reported.getName());
					playeres.sendMessage("�eV�tima: �f" + p.getName());
					playeres.sendMessage("�eMotivo: �b" + reportmsg);
					playeres.sendMessage(" ");
					TituloAPI.mandarTitulo(playeres, "�c�lREPORT");
					TituloAPI.mandarSubTitulo(playeres, "�7H� um novo report, voc� pode resolve-lo.");
				}

			}
			p.sendMessage(MessageAPI.Command_Succes + "Seu reporte foi enviado para a Equipe, aguarde.");
			delay.add(p);
			Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(SpectrePvP.getPlugin(), (Runnable) new Runnable() {
				@Override
				public void run() {
					delay.remove(p);
				}
			}, 20L * 10L);
		}
		return false;
	}

}
