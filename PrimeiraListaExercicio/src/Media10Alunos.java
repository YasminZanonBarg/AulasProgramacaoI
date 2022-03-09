import java.util.Scanner;

public class Media10Alunos{
		
	public void CalculaMedia10Alunos() {
		double alunos, total, nota, media;
		total = 0;
		alunos = 0;
		Scanner s = new Scanner(System.in);
		
		while (alunos <= 10) {
			System.out.println("Informe a nota");
			nota = Double.parseDouble(s.next());
			if (nota != -1) {
				total += nota;
			}
			alunos ++;
		}
		
		if (alunos > 0){
			media = total / alunos;
			System.out.println("A média das notas da turma é" + media);
		}
	}
}	