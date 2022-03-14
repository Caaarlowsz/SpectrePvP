package br.alkazuz.kitpvp.command.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import com.github.caaarlowsz.spectremc.kitpvp.SpectrePvP;

public class cTopKill implements CommandExecutor {

	public static String Top1;
	public static String Top2;
	public static String Top3;

	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (cmd.getName().equalsIgnoreCase("topkill")) {
			sender.sendMessage("     �c�lTOP 10 JOGADORES");
			for (String jogadores : SpectrePvP.topkill) {

				sender.sendMessage("�c" + jogadores + "");
			}
			return true;
		}
		return false;
	}

}