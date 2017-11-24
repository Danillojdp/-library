package control;

import model.BD;
import model.Musica;
import view.ViewCadastrarMusica;
import view.ViewMusicaExiste;

public class ControleCadastrarMusica {

	//Atributo
	private BD bd;

	// metodo construtor
	public ControleCadastrarMusica(BD bd) {
		super();
		this.bd = bd;
	}
	
	// metodo para obter dados da Musica e grava no BD
	public void cadastrarMusica(){
		
		// instanciar a view
		ViewCadastrarMusica vcm = new ViewCadastrarMusica();
		
		//chamar metodo para obter os dados
		vcm.obterDadosMusica();
		
		// Verificar se a musica já existe 
		if(this.bd.existeMusica(vcm.getNome())){
			
			// instanciar a view
			ViewMusicaExiste vme = new ViewMusicaExiste();
			
			// exibir a mensagem
			vme.exibirMensagemMusicaExiste();
			
		}else{
			//instanciar um objeto da classe musica com os dados digitados 
			Musica m = new Musica(vcm.getNome(), vcm.getGenero(), vcm.getArtista());
			
			// guardar musica no BD
			this.bd.gravarMusica(m);
		}	
		}
}
