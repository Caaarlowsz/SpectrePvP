package br.alkazuz.kitpvp.conquista.conquistas;

import org.bukkit.entity.Player;

import br.alkazuz.kitpvp.api.MessageAPI;
import br.alkazuz.kitpvp.conquista.Conquista;
import br.alkazuz.kitpvp.conquista.ConquistaAPI;
import br.alkazuz.kitpvp.menu.MenusAPI;
import br.alkazuz.kitpvp.mlg.MLGAPI;
import br.alkazuz.kitpvp.mysql.manager.Status;
import br.alkazuz.kitpvp.score.ScoreBoarding;

public class MLGI extends Conquista{

	public MLGI() {
		super("Mestre do MLG I", new String[] {"","§fAcerte §e20 §fMLG"}, 300);
	}
	
	@Override
	public boolean onComplete(Player p) {
		if(MLGAPI.getAcertos(p) >= 20) {
			ConquistaAPI.addConquista(p, this.getName());
			p.sendMessage(MessageAPI.Command_Succes+"Você completou essa conquista e ganhou §e"+MenusAPI.money(getPremio()));
			Status.addCoins(p, this.getPremio());
			ScoreBoarding.setScoreBoard(p);
			return true;
		}
		return false;
	}

}
