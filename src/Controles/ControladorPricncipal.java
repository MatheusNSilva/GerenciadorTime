package Controles;

import Entidades.Time;
import Entidades.Jogo;
import Entidades.Jogador;
import Entidades.Tecnico;

public class ControladorPricncipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ControladorTime controladorTime = new ControladorTime();
		controladorTime.cadastrarTime("Cleveland Cavaliers");
		Time time = controladorTime.getTime("Cleveland Cavaliers");
		System.out.println(time.getNome());
		
	
		ControladorJogador controladorJogador = new ControladorJogador();
		controladorJogador.cadastrarJogador("Lebron", 1.95f, 85.5f, 25, 10, 4, 6, 1, time, 45.0f);
		Jogador jogador = controladorJogador.getJogador("Lebron");
		System.out.println(jogador.toString());
		controladorJogador.excluiJogador(jogador);
		Jogador jogadorexcluido = controladorJogador.getJogador("Lebron");
		System.out.println(jogadorexcluido);
		
		ControladorTenico controladorTecnico = new ControladorTenico();
		controladorTecnico.cadastrarTecnico(time, "Arthur Popivich");
		Tecnico tecnico = controladorTecnico.getTecnico("Arthur Popivich");
		System.out.println(tecnico.getNome());
		controladorTecnico.excluiTecnico(tecnico);
		Tecnico tecnicoexcluido = controladorTecnico.getTecnico("Arthur Popivich");
		System.out.println(tecnicoexcluido);
	}

}
