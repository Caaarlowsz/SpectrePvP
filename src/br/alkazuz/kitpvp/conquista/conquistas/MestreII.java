package br.alkazuz.kitpvp.conquista.conquistas;

import org.bukkit.entity.Player;

import br.alkazuz.kitpvp.api.MessageAPI;
import br.alkazuz.kitpvp.conquista.Conquista;
import br.alkazuz.kitpvp.conquista.ConquistaAPI;
import br.alkazuz.kitpvp.menu.MenusAPI;
import br.alkazuz.kitpvp.mysql.manager.MySQLFunctions;
import br.alkazuz.kitpvp.mysql.manager.Status;
import br.alkazuz.kitpvp.score.ScoreBoarding;

public class MestreII extends Conquista{

	public MestreII() {
		super("MestreX1 II", new String[] {"","�fTenha �e20 �fvit�rias na warp 1v1"}, 500);
	}
	
	@Override
	public boolean onComplete(Player p) {
		if(MySQLFunctions.getWins(p)>= 20) {
			ConquistaAPI.addConquista(p, this.getName());
			p.sendMessage(MessageAPI.Command_Succes+"Voc� completou essa conquista e ganhou �e"+MenusAPI.money(getPremio()));
			Status.addCoins(p, this.getPremio());
			ScoreBoarding.setScoreBoard(p);
			return true;
		}
		return false;
	}

}
