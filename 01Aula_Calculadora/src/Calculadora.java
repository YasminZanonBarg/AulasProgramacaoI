import java.util.Scanner;
public class Calculadora {
	
	public static void main(String[] args) {
		/*double x,y;
		double resposta;
		Scanner s = new Scanner(System.in);
		Calculos c = new Calculos();
		
		System.out.println("Digite o primeiro n�mero: ");
		y = Double.parseDouble(s.next());
		System.out.println("Digite o segundo n�mero");
		x = Double.parseDouble(s.next());
		
		resposta = c.Soma(y,x);
		System.out.println("Resultado da soma: "+ resposta);
		resposta = c.Multiplicacao(y,x);
		System.out.println("Resultado da multiplica��o: "+ resposta);
		resposta = c.Subtracao(y,x);
		System.out.println("Resultado da subtra��o: "+ resposta);
		resposta = c.Divisao(y, x);
		System.out.println("Resultado da divis�o: "+ resposta);*/
		
		Funcoes calcula = new Funcoes();
		
		System.out.println(calcula.calculaFuncaoA(10,5));
		System.out.println(calcula.calculaFuncaoB(10,5));

	}
}
