package Animais;

public class Gato {

	// Atributos
	private String nome;
	private String cor;
	private String raca;

	// Construtor Padrão
	public Gato(String raca) {
		this.raca = raca;
	}
	

	// Métodos
	public void miar() {
		System.out.println("Miau!");
	}

	public void arranhar() {
		System.out.println("Gato está arranhando");
	}

	public void correr() {
		System.out.println("Correndo");
	}
	
	
	// Métodos Getters e Setters
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
