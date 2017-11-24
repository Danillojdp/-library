package view;

import javax.swing.JOptionPane;

public class ViewCadastrarMusica {


	// Atributos
	private String nome;
	private String genero;
	private String artista;
	
	// metodo get e set 
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getArtista() {
		return artista;
	}

	public void setArtista(String artista) {
		this.artista = artista;
	}
	
	// metodo para obter dados da musica a ser inserido
	
	public void  obterDadosMusica(){
		// obtendo dados da Musica
		this.setNome(JOptionPane.showInputDialog("Informe o nome da Musica: "));
		this.setGenero(JOptionPane.showInputDialog("Informe o genero da musica: "));
 	    this.setArtista(JOptionPane.showInputDialog("Informe o cantor: "));
	}

	
	
	
	
}
