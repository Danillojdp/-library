package view;

import javax.swing.JOptionPane;

import model.Usuario;

public class ViewExibeUsuario {
	
	public ViewExibeUsuario(Usuario usuario){
		//verificare se tem usuario para mostrar
		if (usuario ==null){
			JOptionPane.showMessageDialog(null, "Usuario não existe");
		} else {
			//Exibir com Joptionpane
			JOptionPane.showMessageDialog(null, usuario);
		}
		
	}
}
