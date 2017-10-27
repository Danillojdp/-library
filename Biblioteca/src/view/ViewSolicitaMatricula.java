package view;

import javax.swing.JOptionPane;

public class ViewSolicitaMatricula {
	//Atributos
	private String matricula;
	
	public ViewSolicitaMatricula(){
		this.matricula = JOptionPane.showInputDialog("Digite a matricula");
	
		
	}

	public ViewSolicitaMatricula(String matricula) {
		super();
		this.matricula = matricula;
	}

	public String getMatricula() {
		return matricula;
	}
}
