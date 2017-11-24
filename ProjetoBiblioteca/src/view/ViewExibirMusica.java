package view;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import model.Musica;

public class ViewExibirMusica {
	
	
	// Metodo Costrutor 
	public void ExibirMusica(ArrayList<Musica> musicas){
		// instanciar String para exibicao
		String todasMusicas= "";
		//percorrer o ArrayList 
		for (int i = 0; i <musicas.size(); i++) {
			todasMusicas = todasMusicas + musicas.get(i).toString() + "\n";
		}
		// exibir todas as musicas 
		JOptionPane.showMessageDialog(null, todasMusicas);
	}

	

}
