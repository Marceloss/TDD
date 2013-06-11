package br.com.livrariasofia.model;

public class BookCollection extends Book {

	private int volume;
	private int qtdLivros;

	public BookCollection(String titulo, String descricao, String autor, 
			int volume, int qtdLivros, int id, int installment) {
		super(titulo, descricao, autor,id, 0d);
		this.volume = volume;
		if(qtdLivros >= 2){
			this.qtdLivros = qtdLivros;  
		}		
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}


}
