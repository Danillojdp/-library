package control;

import model.BDSimulado;
import model.Livro;
import view.ViewExibeLivro;

public class ControlePesquisaLivro {
	
	public ControlePesquisaLivro(String titulo){
		//Criar o BDSimulado
		BDSimulado bds = new BDSimulado();
		
		//Retornar dados de usuario de acordo com a matricula
		Livro liv = bds.getLivroPorTitulo(titulo);
		
		//Exibir os dados do usuario
		ViewExibeLivro vel = new ViewExibeLivro(liv);
	}

}
