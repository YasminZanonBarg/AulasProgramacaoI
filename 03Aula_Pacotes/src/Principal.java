import Animais.Gato;

public class Principal {

	public static void main(String[] args) {
		Gato g = new Gato("Siamês");
		g.setNome("Popom");
		System.out.println("Nome: " + g.getNome());
	}
}
