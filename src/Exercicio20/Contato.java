package Exercicio20;


public class Contato {
	private String nome;
	private int telefone;
	
	
	public Contato(String nome, int telefone, String endereco) {
		this.nome = nome;
		this.telefone = telefone;	
	}
		
	public String getNome() {
		return nome;
	}
	
	public int getTelefone() {
		return telefone;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
}
