package model;

import java.util.ArrayList;

import util.DocumentReader;
import util.DocumentWriter;

public class BD {

	// Atributo
	
	private ArrayList<Musica> musicas;
	private String fileName = "musicas.txt";
	private DocumentWriter dw;
	private DocumentReader dr;
	
	// metodo construtor 
	
	public BD(){
		// instanciar o ArrayList
		this.musicas = new ArrayList<Musica>();

		// instanciar o documentReader
		this.dr = new DocumentReader();
		// instanciar o DocumentWriter
		this.dw = new DocumentWriter();
	}
	
	// Metodo que carrega todas as musicas do arquivo para o ArrayList
	
	public void carregarMusicas(){
		//ler as linhas do arquivo
		ArrayList<String> linhas = this.dr.read(this.fileName);
		
		//Percorer o ArrayList criando as musicas
		
		for (int i = 0; i <linhas.size(); i++) {
			// Separa a linha em um array de String
			String[] linhaMusica = linhas.get(i).split(";");
			//Cria a musica com os dados da linha
			Musica m = new Musica(linhaMusica[0], linhaMusica[1], linhaMusica[2]);
			// Coloca o Cliente no ArrayList 
			this.musicas.add(m);
		}
	}
	
	
	
	// metodo que verificar se ja existe musica com o Nome informado
	public boolean existeMusica(String nome){
		
		boolean retorno = false;
		// percorrer a arraylist
		for (int i = 0; i < this.musicas.size(); i++) {
			// verificar se existe musica com mesmo nome
			if (this.musicas.get(i).getNome().equals(nome)){
				retorno = true;
			}
		}
		return retorno;
	}
	
	
	
	
	// metodo que grava musicas 
	
	public void gravarMusica (Musica m){
		// colocar o Musica no ArrayList
		this.musicas.add(m);
		
		// gravar a musica no arquivo
		dw.write(this.fileName, m.toLinha());
	}

	public ArrayList<Musica> getMusicas() {
		return musicas;
	}
	
}
