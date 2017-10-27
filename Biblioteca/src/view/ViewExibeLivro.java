package view;

import javax.swing.JOptionPane;

import model.Livro;

public class ViewExibeLivro {
	
	public ViewExibeLivro(Livro livro){
		//verificare se tem livro para mostrar
				if (livro == null){
					JOptionPane.showMessageDialog(null, "livro não existe");
				} else {
					//Exibir com Joptionpane
					JOptionPane.showMessageDialog(null, livro);
				}
				
		//Exibir com JOptionPane
		JOptionPane.showMessageDialog(null, livro);
		
	}

}