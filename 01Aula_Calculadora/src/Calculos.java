public class Calculos {
	//m�todos: soma, subtra��o, multiplica��o e divis�o
	
	/*public void Soma(double n1, double n2) {
		System.out.println("Resultado da soma: " + (n1 + n2));
	}
	
	public void Subtracao(double n1, double n2) {
		System.out.println("Resultado da subtra��o: " + (n1 - n2));
	}
	
	public void Multiplicacao(double n1, double n2) {
		System.out.println("Resultado da multiplica��o: " + (n1 * n2));
	}
	
	public void Divisao(double n1, double n2) {
		System.out.println("Resultado da divis�o: " + (n1 / n2));
	} */
	
	public double Soma (double n1, double n2) {
		double resultado;
		resultado = n1 + n2;
		return resultado;
	}
	
	
	public double Subtracao (double n1, double n2) {
		double resultado;
		resultado = n1 - n2;
		return resultado;
	}
	
	
	public double Multiplicacao (double n1, double n2) {
		double resultado;
		resultado = n1 * n2;
		return resultado;
	}
	
	
	public double Divisao (double n1, double n2) {
		double resultado = 0;
		if(n2 != 0) {
			resultado = n1 / n2;
		}
		return resultado;
	}
}
