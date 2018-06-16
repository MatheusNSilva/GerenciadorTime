package Controles;
import Entidades.Time;
import java.util.ArrayList;
public class ControladorTime {
	
	private ArrayList<Time> times = new ArrayList<Time>();
	
	public ControladorTime() {
	}
	
	public void cadastrarTime(String nome) {
		times.add(new Time(nome));
	}
	
	public ArrayList<Time> getTime(){
		return times;
	}
	
	public void setTime(ArrayList<Time> times ) {
		this.times = times;
	}
}
