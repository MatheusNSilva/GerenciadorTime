package Controles;
import Entidades.Jogador;
import Entidades.Jogo;
import Entidades.Time;

import java.util.ArrayList;

public class ControladorJogo {
	
	private ArrayList<Jogo> jogos = new  ArrayList<Jogo>();
	
	public ControladorJogo() {}
	
	public void cadastrarJogo(int numeroJogo, int placar, int placarAdversario, int totalAssistencias, int totalRebotes,
			int totalBloqueios, int totalRoubosBola, float tempoJogo, String timeAdversario, Time time,
			Jogador[] jogadores) {
		
		jogos.add( new Jogo(numeroJogo, placar, placarAdversario, totalAssistencias, totalRebotes, totalBloqueios, 
				totalRoubosBola, tempoJogo, timeAdversario, time, jogadores));
	}



}	