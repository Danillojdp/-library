package main;

import control.ControleExibeEmprestimos;
import control.ControlePesquisaLivro;
import control.ControlePesquisaUsuario;

public class Principal {

	public static void main(String[] args) {
		//Criar objeto da ControleExibeEmprestimo
		ControleExibeEmprestimos cee = new ControleExibeEmprestimos();
		
		ControlePesquisaUsuario cpu = new ControlePesquisaUsuario("RA3434");

		ControlePesquisaLivro cpl = new ControlePesquisaLivro("Livro 1");
	}

}
