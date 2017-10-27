package control;

import java.util.ArrayList;

import model.BDSimulado;
import model.Emprestimo;
import view.ViewExibeEmprestimos;
import view.ViewExibeEmprestimosString;

public class ControleExibeEmprestimos {
	
	public ControleExibeEmprestimos(){
		//Criando o BD Simulado
		BDSimulado bds = new BDSimulado();
		
		//Recuperar todos os emprestimos
		ArrayList<Emprestimo> emprestimos = bds.getEmprestimos();
		
		//Exibir todos os emprestimos
		ViewExibeEmprestimos vee = new ViewExibeEmprestimos(emprestimos);
		
		//Exibir todos os emprestimos usando outra classe
		String s = "";
		
		for (int i = 0; i < emprestimos.size(); i++) {
			s = s + "--------------\n" + emprestimos.get(i);
		}
		
		ViewExibeEmprestimosString vees = new ViewExibeEmprestimosString(s);
		
		
		
		
		
		
		
		
		
		
	}

}
