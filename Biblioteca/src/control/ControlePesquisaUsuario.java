package control;

import model.BDSimulado;
import model.Usuario;
import view.ViewExibeUsuario;

public class ControlePesquisaUsuario {
	
	public ControlePesquisaUsuario(String matricula){
		//Criar o BDSimulado
		BDSimulado bds = new BDSimulado();
		
		//Retornar dados de usuario de acordo com a matricula
		Usuario usu = bds.getUsuarioPorMatricula(matricula);
		
		//Exibir os dados do usuario
		ViewExibeUsuario veu = new ViewExibeUsuario(usu);
	}

}
