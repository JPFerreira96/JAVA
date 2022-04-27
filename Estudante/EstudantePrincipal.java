import java.util.Scanner;

public class EstudantePrincipal {
	public static void main(String args []) {
		
		Scanner sc = new Scanner(System.in);
		Estudante est = new Estudante();
		System.out.println("Digite o nome do aluno: ");
		est.nome = sc.nextLine();
		System.out.println("Informe a nota do primeiro semestre do aluno: ");
		est.nota1 = sc.nextDouble();
		System.out.println("informe a nota do segundo semestre do aluno: ");
		est.nota2=sc.nextDouble();
		System.out.println("informe a nota do terceiro trimestre do aluno: ");
		est.nota3=sc.nextDouble();
		
		if (est.notaFinal() == 10) {
			System.out.println("O estudante obteve a nota Máxima!! Aprovado!!");			
		}		
		else if(est.notaFinal() >= 7 && est.notaFinal() < 10) {
			System.out.println("O Aluno está aprovado!!");
		}
		else if (est.notaFinal()<6){
			System.out.println("O Aluno está Reprovado precisa de " + String.format("%.2f ", est.pontosRestantes())  +" para ser Aprovado");
		}
		System.out.println("A Nota Final do Aluno foi: "+ est.notaFinal());
		sc.close();	
	}
}
