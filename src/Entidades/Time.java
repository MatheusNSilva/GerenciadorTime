package Entidades;

import java.util.ArrayList;

public class Time {
	
	private String nome;
	private ArrayList<Jogador> jogadores = new ArrayList<Jogador>();
	private Tecnico tecnico;
	public Time(String nome, ArrayList<Jogador> jogadores, Tecnico tecnico) {
		super();
		this.nome = nome; 
		if(jogadores == null) {
			this.jogadores = new ArrayList<Jogador>();
		} else {		
			this.jogadores = jogadores;
		}	
		this.tecnico = tecnico;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public ArrayList<Jogador> getJogadores() {
		return jogadores;
	}
	
	
	public void setJogadores(ArrayList<Jogador> jogadores) {
		this.jogadores = jogadores;
	}

	public Tecnico getTecnico() {
		return tecnico;
	}

	public void setTecnico(Tecnico tecnico) {
		this.tecnico = tecnico;
	}

	@Override
	public String toString() {
		return "Time [nome=" + nome + ", jogadores=" + jogadores + ", tecnico=" + tecnico + "]";
	}
	
	public void addJogador(Jogador jogador) {
		this.jogadores.add(jogador);
	}
	
	
	

	
}
  
