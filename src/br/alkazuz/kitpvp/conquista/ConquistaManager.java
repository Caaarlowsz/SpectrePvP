package br.alkazuz.kitpvp.conquista;

import java.util.ArrayList;

import br.alkazuz.kitpvp.conquista.conquistas.CaixasI;
import br.alkazuz.kitpvp.conquista.conquistas.CaixasII;
import br.alkazuz.kitpvp.conquista.conquistas.CaixasIII;
import br.alkazuz.kitpvp.conquista.conquistas.InicianteI;
import br.alkazuz.kitpvp.conquista.conquistas.InicianteII;
import br.alkazuz.kitpvp.conquista.conquistas.InicianteIII;
import br.alkazuz.kitpvp.conquista.conquistas.MLGI;
import br.alkazuz.kitpvp.conquista.conquistas.MLGII;
import br.alkazuz.kitpvp.conquista.conquistas.MLGIII;
import br.alkazuz.kitpvp.conquista.conquistas.MestreI;
import br.alkazuz.kitpvp.conquista.conquistas.MestreII;
import br.alkazuz.kitpvp.conquista.conquistas.MestreIII;
import br.alkazuz.kitpvp.conquista.conquistas.NoobI;
import br.alkazuz.kitpvp.conquista.conquistas.NoobII;
import br.alkazuz.kitpvp.conquista.conquistas.NoobIII;
import br.alkazuz.kitpvp.conquista.conquistas.RicoI;
import br.alkazuz.kitpvp.conquista.conquistas.RicoII;
import br.alkazuz.kitpvp.conquista.conquistas.RicoIII;

public class ConquistaManager {

	public static ArrayList<Conquista> conquistas = new ArrayList<Conquista>();

	public ConquistaManager() {
		conquistas.add(new CaixasI());
		conquistas.add(new CaixasII());
		conquistas.add(new CaixasIII());
		conquistas.add(new InicianteI());
		conquistas.add(new InicianteII());
		conquistas.add(new InicianteIII());
		conquistas.add(new MestreI());
		conquistas.add(new MestreII());
		conquistas.add(new MestreIII());
		conquistas.add(new MLGI());
		conquistas.add(new MLGII());
		conquistas.add(new MLGIII());
		conquistas.add(new NoobI());
		conquistas.add(new NoobII());
		conquistas.add(new NoobIII());
		conquistas.add(new RicoI());
		conquistas.add(new RicoII());
		conquistas.add(new RicoIII());
	}

	public Conquista getConquistaByName(String name) {
		for (Conquista cqt : conquistas) {
			if (cqt.getName().equalsIgnoreCase(name)) {
				return cqt;
			}
		}
		return null;
	}

}
