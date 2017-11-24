package model;

public class Musica {

	//Atributos
	
	private String nome;
	private String genero;
	private String artista;
	

	
	@Override
	public String toString() {
		return "Musica - Nome= " + nome + "\n" +
				"genero= " + genero + "\n" +
				"artista=" + artista + "]";
	}
	
	/* metodo que transforma uma musica na representacao dela em linha 
	  para salvar em um arquivo */

	public String toLinha(){
		return getNome() + ";" + getGenero() + ";" + getArtista();
	}



	//get e set
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
	// metodo construtor 
	
	public Musica(String nome, String genero, String artista) {
		super();
		this.nome = nome;
		this.genero = genero;
		this.artista = artista;
	}
	
	
	
	
	
	
	
}
