package model;

public class Livro {
	//Atributos
	private String titulo;
	private String autor;
	private String editora;
	private String anoLancamento;
	private String ISBN;
	
	public Livro(String titulo, String autor, String editora, String anoLancamento, String iSBN) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.editora = editora;
		this.anoLancamento = anoLancamento;
		ISBN = iSBN;
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	public String getAnoLancamento() {
		return anoLancamento;
	}
	public void setAnoLancamento(String anoLancamento) {
		this.anoLancamento = anoLancamento;
	}
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	
	//Metodo ToString
	@Override
	public String toString() {
		return "Livro [titulo=" + titulo + ", autor=" + autor + ", editora=" + editora + ", anoLancamento="
				+ anoLancamento + ", ISBN=" + ISBN + "]";
	}
	
	

}
