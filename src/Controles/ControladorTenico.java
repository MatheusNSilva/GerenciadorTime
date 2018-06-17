package Controles;
import Entidades.Jogo;
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
	
	public void setTecnico(ArrayList<Tecnico> tecnicos ) {
		this.tecnicos = tecnicos;
	}
	
	public void excluiTecnico(Tecnico tecnico) {
		for(int i = 0; i < tecnicos.size(); i++) {
			if(tecnicos.get(i).equals(tecnico)) {
				tecnicos.remove(tecnico);
				break;
			}		
		}	
	}
	
	public Tecnico getTecnico(String nomeTecnico) {
		Tecnico tecnicoEncontrado = null;
		for(Tecnico tecnico : this.tecnicos) {
			if(tecnico.getNome().equals(nomeTecnico)) {
				tecnicoEncontrado = tecnico;
			}
				
		}
		
		return tecnicoEncontrado;
	}
	/*
	public void testeCadastraTecnico() {
		this.cadastrarTecnico(Boston, "Antony Parker");
	}*/
}
