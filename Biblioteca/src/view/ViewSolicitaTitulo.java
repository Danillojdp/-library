package view;

import javax.swing.JOptionPane;

public class ViewSolicitaTitulo {
	//Atributos
	private String titulo;
	
	public ViewSolicitaTitulo(){
		this.titulo = JOptionPane.showInputDialog("Digite o Titulo");
	
		
	}

	public ViewSolicitaTitulo(String titulo) {
		super();
		this.titulo = titulo;
	}

	public String getTitulo() {
		return titulo;
	}
}
