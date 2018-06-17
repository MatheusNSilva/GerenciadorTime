package Controles;
import Entidades.Tecnico;
import Entidades.Time;
import Entidades.Jogador;

import java.util.ArrayList;
public class ControladorTime {
	
	private ArrayList<Time> times = new ArrayList<Time>();
	
	public ControladorTime() {
	}
	
	public void cadastrarTime(String nome, ArrayList<Jogador> jogadores, Tecnico tecnico) {
		times.add(new Time(nome, jogadores, tecnico));
	}
	
	public ArrayList<Time> getTimes(){
		return times;
	}
	
	public void setTime(ArrayList<Time> times ) {
		this.times = times;
	}
	
	public Time getTime(String nomeTime) {
		Time timeEncontrado = null;
		for(Time time : this.times) {
			if(time.getNome().equals(nomeTime)) {
				timeEncontrado = time;
			}
				
		}
		
		return timeEncontrado;
	}
	
	public void excluiTime(Time time) {
		for(int i = 0; i < times.size(); i++) {
			if(times.get(i).equals(time)) {
				times.remove(time);
				break;
			}		
		}	
	}
	
	/*public void testeCadastro() { 
		 Boston = new Time();
		this.cadastrarTime("Boston Celtics");
	}*/
}
