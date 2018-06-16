package Entidades;


public class Jogador extends Pessoa{
	
	private float altura;
	private float peso;
	private int pontos;
	private int assistencias;
	private int bloqueios;
	private int rebotes;
	private int roubosBola;
	private Time time;
	private float tempoQuadra;
	
	public Jogador(String nome, float altura, float peso, int pontos, int assistencias, int bloqueios, int rebotes,
			int roubosBola, Time time, float tempoQuadra) {
		super(nome);
		this.altura = altura;
		this.peso = peso;
		this.pontos = pontos;
		this.assistencias = assistencias;
		this.bloqueios = bloqueios;
		this.rebotes = rebotes;
		this.roubosBola = roubosBola;
		this.time = time;
		this.tempoQuadra = tempoQuadra;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public int getPontos() {
		return pontos;
	}

	public void setPontos(int pontos) {
		this.pontos = pontos;
	}

	public int getAssistencias() {
		return assistencias;
	}

	public void setAssistencias(int assistencias) {
		this.assistencias = assistencias;
	}

	public int getBloqueios() {
		return bloqueios;
	}

	public void setBloqueios(int bloqueios) {
		this.bloqueios = bloqueios;
	}

	public int getRebotes() {
		return rebotes;
	}

	public void setRebotes(int rebotes) {
		this.rebotes = rebotes;
	}

	public int getRoubosBola() {
		return roubosBola;
	}

	public void setRoubosBola(int roubosBola) {
		this.roubosBola = roubosBola;
	}

	public Time getTime() {
		return time;
	}

	public void setTime(Time time) {
		this.time = time;
	}

	public float getTempoQuadra() {
		return tempoQuadra;
	}

	public void setTempoQuadra(float tempoQuadra) {
		this.tempoQuadra = tempoQuadra;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
