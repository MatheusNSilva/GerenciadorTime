package Controles;
import Entidades.Jogador;
import Entidades.Jogo;
import Entidades.Time;

import java.util.ArrayList;
import Util.ExceptionAssistenciaInvalida;

public class ControladorJogo {
	
	private ArrayList<Jogo> jogos = new  ArrayList<Jogo>();
	
	public ControladorJogo() {}
	
	public void cadastrarJogo(int numeroJogo, int placar, int placarAdversario, int totalAssistencias, int totalRebotes,
			int totalBloqueios, int totalRoubosBola, float tempoJogo, String timeAdversario, Time time,
			Jogador[] jogadores) throws ExceptionAssistenciaInvalida {
		
		if(placar/2 <= totalAssistencias)
			jogos.add( new Jogo(numeroJogo, placar, placarAdversario, totalAssistencias, totalRebotes, totalBloqueios, 
					totalRoubosBola, tempoJogo, timeAdversario, time, jogadores));
		else {
			throw new ExceptionAssistenciaInvalida("Quantidade de assistências incompativel com o placar");
		}
	}

	public ArrayList<Jogo> getJogos() {
		return jogos;
	}

	public void setJogos(ArrayList<Jogo> jogos) {
		this.jogos = jogos;
	}

	public void excluiJogo(Jogo j) {
		for(int i = 0; i < jogos.size(); i++) {
			if(jogos.get(i).equals(j)) {
				jogos.remove(j);
				break;
			}		
		}	
	}
	
	public ArrayList<Integer> getPlacarJogos(){
		ArrayList<Integer> placarJogos = new ArrayList<Integer>();
		for(Jogo jogo : jogos) {
			placarJogos.add(jogo.getPlacar());
		}
		return placarJogos;
	}
	
	public Jogo getJogo(int numeroJogo) {
		Jogo jogoEncontrado = null;
		for(Jogo jogo : this.jogos) {
			if(jogo.getNumeroJogo() == numeroJogo) {
				jogoEncontrado = jogo;
			}
				
		}
		
		return jogoEncontrado;
	}

}	