package control;

import java.util.ArrayList;

import model.BD;
import model.Musica;
import view.ViewExibirMusica;

public class ControleExibirMusica {
	
	// atributos
	 private BD bd;
	 private ViewExibirMusica vem;
	 
	 public ControleExibirMusica(BD bd){
		 this.bd = bd;
		 // instanciar a view
		 this.vem = new ViewExibirMusica();
	 }
	 
	 // metodo que recupera as musica e exibi
	 
	 public void exibirMusica(){
		 // retornar o ArrayList de Musicas
		 ArrayList<Musica> musicas = this.bd.getMusicas();
		// Executa o metodo para exibir todos as musicas 
		 this.vem.ExibirMusica(musicas);
	 }

}
