package Controles;
import Entidades.Tecnico;
import Entidades.Time;

import java.util.ArrayList;

public class ControladorTenico {

	private  ArrayList<Tecnico> tecnicos = new ArrayList<Tecnico>();
	
	public ControladorTenico() {
	}
	
	public void cadastrarTecnico(Time time, String nome) {
		tecnicos.add(new Tecnico(time, nome));
	}
	
	public ArrayList<Tecnico> getTecnico(){
		return tecnicos;
	}
	
	public void setTime(ArrayList<Tecnico> tecnicos ) {
		this.tecnicos = tecnicos;
	}
}
