package Animais;

public class Gato {

	// Atributos
	private String nome;
	private String cor;
	private String raca;

	// Construtor Padr�o
	public Gato(String raca) {
		this.raca = raca;
	}
	

	// M�todos
	public void miar() {
		System.out.println("Miau!");
	}

	public void arranhar() {
		System.out.println("Gato est� arranhando");
	}

	public void correr() {
		System.out.println("Correndo");
	}
	
	
	// M�todos Getters e Setters
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public String getCor() {
		return cor;
	}

}
