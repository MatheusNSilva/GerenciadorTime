package Controles;

import Entidades.Time;
import Entidades.Jogo;
import Entidades.Jogador;
import Entidades.Tecnico;
import Interfaces.CadastroJogador;
public class ControladorPricncipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ControladorTime controladorTime = new ControladorTime();
		controladorTime.cadastrarTime("Cleveland Cavaliers", null, null);
		Time cleveland = controladorTime.getTime("Cleveland Cavaliers");
		
	
		ControladorJogador controladorJogador = new ControladorJogador();
		controladorJogador.cadastrarJogador("Lebron", 1.95f, 85.5f, 25, 10, 4, 6, 1, cleveland, 45.0f);
		Jogador jogador = controladorJogador.getJogador("Lebron");
		ControladorTenico controladorTecnico = new ControladorTenico();
		controladorTecnico.cadastrarTecnico(cleveland, "Arthur Popivich");
		Tecnico tecnico = controladorTecnico.getTecnico("Arthur Popivich");
		cleveland.addJogador(jogador);
		
		ControladorJogo controladorJogo = new ControladorJogo();
		controladorJogo.cadastrarJogo(2, 89, 79, 20, 18, 10, 8, 40.5f, "Boston", cleveland, cleveland.getJogadores());
		controladorJogo.getPlacarJogos();
		System.out.println(controladorJogo.getPlacarJogos());
		controladorJogo.excluiJogo(controladorJogo.getJogo(2));
		System.out.println(controladorJogo.getJogo(2));
		
		CadastroJogador telaCadastroJogador = new CadastroJogador();
		
	}

}
