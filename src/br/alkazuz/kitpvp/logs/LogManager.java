package br.alkazuz.kitpvp.logs;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.github.caaarlowsz.spectremc.kitpvp.SpectrePvP;

public class LogManager {

	public static void createLogGrupo(String log) {
		try {
			final File logFile = new File(SpectrePvP.getPlugin().getDataFolder(), "logsGrupos.log");
			final FileWriter fw = new FileWriter(logFile, true);
			final PrintWriter pw = new PrintWriter(fw);
			Date data = new Date();
			SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
			formatador.format(data);
			pw.println("[" + data.toString() + "] " + log);
			pw.flush();
			pw.close();
		} catch (IOException e) {
		}
	}

	public static void createLogStatus(String log) {
		try {
			final File logFile = new File(SpectrePvP.getPlugin().getDataFolder(), "logsStatus.log");
			final FileWriter fw = new FileWriter(logFile, true);
			final PrintWriter pw = new PrintWriter(fw);
			Date data = new Date();
			SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
			formatador.format(data);
			pw.println("[" + data.toString() + "] " + log);
			pw.flush();
			pw.close();
		} catch (IOException e) {
		}
	}

}
