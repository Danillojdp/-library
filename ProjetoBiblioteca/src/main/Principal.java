package main;

import java.util.ArrayList;

import control.ControleCadastrarMusica;
import control.ControleExibirMusica;
import model.BD;
import model.Musica;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//instanciar o BD
		BD bd=new BD();
		
		// Carregar as musicas do arquivo
		bd.carregarMusicas();
		
		//instanciar controleExibirMusica
		ControleExibirMusica cem = new ControleExibirMusica(bd);
		
		// instanciar ControleCadastrarMusicas
		ControleCadastrarMusica ccm= new ControleCadastrarMusica(bd);
		
		//Exibir todos as musicas
		cem.exibirMusica();
		
		// inserir uma nova musica
		ccm.cadastrarMusica();
		
		//Exibir todas As musicas novamente
		cem.exibirMusica();
		

	}

}