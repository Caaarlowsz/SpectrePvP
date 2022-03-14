package br.alkazuz.kitpvp.command.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import br.alkazuz.groupapi.api.GroupAPI;
import br.alkazuz.groupapi.config.GroupConfig;
import br.alkazuz.kitpvp.api.MessageAPI;
import br.alkazuz.kitpvp.config.ConquistaConfig;
import br.alkazuz.kitpvp.config.KitDiario;
import br.alkazuz.kitpvp.config.KitsConfig;
import br.alkazuz.kitpvp.config.MLGConfig;
import br.alkazuz.kitpvp.config.WarpConfig;
import com.github.caaarlowsz.spectremc.kitpvp.SpectrePvP;

public class cKitPVP implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender Sender, Command Cmd, String Label, String[] Args) {

		if (Cmd.getName().equalsIgnoreCase("reloadconfig")) {

			if (Sender instanceof Player
					&& !GroupAPI.GroupCanExecute(GroupAPI.getGroup((Player) Sender), Cmd.getName())) {
				Sender.sendMessage(MessageAPI.Command_Error + "Comando inexistente ou voc� n�o tem acesso");
				return true;
			}

			new br.alkazuz.kitpvp.config.Config(SpectrePvP.getPlugin());
			new GroupConfig(SpectrePvP.getPlugin());
			new WarpConfig(br.alkazuz.groupapi.main.Main.getPlugin());
			new KitDiario(SpectrePvP.getPlugin());
			new ConquistaConfig(SpectrePvP.getPlugin());
			new MLGConfig(SpectrePvP.getPlugin());
			new KitsConfig(SpectrePvP.getPlugin());
			Sender.sendMessage(MessageAPI.Command_Succes + "Config recarregada.");

		}
		return false;
	}

}
