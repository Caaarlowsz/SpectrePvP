package br.alkazuz.kitpvp.command.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

import br.alkazuz.groupapi.api.GroupAPI;
import br.alkazuz.kitpvp.anticheat.Utills;
import br.alkazuz.kitpvp.api.MessageAPI;

public class cStfNotify implements CommandExecutor, Listener{
	@Override
	public boolean onCommand(CommandSender Sender, Command Cmd, String Label, String[] Args) {
		
		if(Cmd.getName().equalsIgnoreCase("stfn")){
			if(Sender instanceof Player && !GroupAPI.GroupCanExecute(GroupAPI.getGroup((Player)Sender), Cmd.getName())){
				Sender.sendMessage(MessageAPI.Command_Error+"Comando inexistente ou voc� n�o tem acesso");
				return true;
		    }
			String message = " ";
	        for (int i = 0; i < Args.length; i++) {
	          if (i == Args.length - 1) {
	            message = message + Args[i];
	          } else {
	            message = message + Args[i] + " ";
	          }
	        }
			Utills.sendAntiCheat(message.replace("&", "�"));
		}
		return true;
	}

}
