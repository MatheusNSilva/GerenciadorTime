package Controles;
import java.util.ArrayList;
import Entidades.Jogador;
import Entidades.Time;

public class ControladorJogador {
	
	private ArrayList<Jogador> jogadores = new ArrayList<Jogador>();
	
	public ControladorJogador() {
	}
	
	public void cadastrarJogador(String nome, float altura, float peso, int pontos, int assistencias, int bloqueios, int rebotes,
			int roubosBola, Time time, float tempoQuadra) {
			int limiteCadastro = 14;
			
			if(jogadores.size() < limiteCadastro)
				jogadores.add(new Jogador(nome, altura, peso, pontos, assistencias, bloqueios, rebotes, roubosBola, time, tempoQuadra));
	}
	
	public void setJogadores(ArrayList<Jogador> jogadores) {
		this.jogadores = jogadores;
	}
	
	public  ArrayList<Jogador> getJogadores(){
		return jogadores;
	}
}
