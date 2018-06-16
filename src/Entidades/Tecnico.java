package Entidades;


public class Tecnico extends Pessoa{
	
	private Time time;
	
	public Tecnico(Time time, String nome) {
		super(nome);
		this.time = time;
		this.nome = nome;
	}

	public Time getTime() {
		return time;
	}

	public void setTime(Time time) {
		this.time = time;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}

