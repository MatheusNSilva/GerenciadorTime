package Entidades;

import java.util.ArrayList;

public class Jogo {
	
	private int numeroJogo;
	private int placar;
	private int placarAdversario;
	private int totalAssistencias;
	private int totalRebotes;
	private int totalBloqueios;
	private int totalRoubosBola;
	private float tempoJogo;
	private String timeAdversario;
	private Time time;
	private ArrayList<Jogador> jogadores;
	
	public Jogo(int numeroJogo, int placar, int placarAdversario, int totalAssistencias, int totalRebotes,
			int totalBloqueios, int totalRoubosBola, float tempoJogo, String timeAdversario, Time time,
			ArrayList<Jogador> jogadores) {
		this.numeroJogo = numeroJogo;
		this.placar = placar;
		this.placarAdversario = placarAdversario;
		this.totalAssistencias = totalAssistencias;
		this.totalRebotes = totalRebotes;
		this.totalBloqueios = totalBloqueios;
		this.totalRoubosBola = totalRoubosBola;
		this.tempoJogo = tempoJogo;
		this.timeAdversario = timeAdversario;
		this.time = time;
		this.jogadores = jogadores;
	}

	public int getNumeroJogo() {
		return numeroJogo;
	}

	public void setNumeroJogo(int numeroJogo) {
		this.numeroJogo = numeroJogo;
	}

	public int getPlacar() {
		return placar;
	}

	public void setPlacar(int placar) {
		this.placar = placar;
	}

	public int getPlacarAdversario() {
		return placarAdversario;
	}

	public void setPlacarAdversario(int placarAdversario) {
		this.placarAdversario = placarAdversario;
	}

	public int getTotalAssistencias() {
		return totalAssistencias;
	}

	public void setTotalAssistencias(int totalAssistencias) {
		this.totalAssistencias = totalAssistencias;
	}

	public int getTotalRebotes() {
		return totalRebotes;
	}

	public void setTotalRebotes(int totalRebotes) {
		this.totalRebotes = totalRebotes;
	}

	public int getTotalBloqueios() {
		return totalBloqueios;
	}

	public void setTotalBloqueios(int totalBloqueios) {
		this.totalBloqueios = totalBloqueios;
	}

	public int getTotalRoubosBola() {
		return totalRoubosBola;
	}

	public void setTotalRoubosBola(int totalRoubosBola) {
		this.totalRoubosBola = totalRoubosBola;
	}

	public float getTempoJogo() {
		return tempoJogo;
	}

	public void setTempoJogo(float tempoJogo) {
		this.tempoJogo = tempoJogo;
	}

	public String getTimeAdversario() {
		return timeAdversario;
	}

	public void setTimeAdversario(String timeAdversario) {
		this.timeAdversario = timeAdversario;
	}

	public Time getTime() {
		return time;
	}

	public void setTime(Time time) {
		this.time = time;
	}

	public ArrayList<Jogador> getJogadores() {
		return jogadores;
	}

	public void setJogadores(ArrayList<Jogador> jogadores) {
		this.jogadores = jogadores;
	}

		
}
