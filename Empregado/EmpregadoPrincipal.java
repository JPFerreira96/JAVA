import java.util.Scanner;

public class EmpregadoPrincipal{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Empregado emp = new Empregado();
		System.out.println("Digite o nome por extenso do funcinário: ");
		emp.nome = sc.nextLine();
		System.out.println("Informe o salário bruto: ");
		emp.salario_bruto = sc.nextDouble();
		System.out.println("informe o imposto em cima do salário bruto: ");
		emp.imposto=sc.nextDouble();
		
		System.out.println("Digite o Acrescimo salarial que voce deseja: ");
		double acrescimo = sc.nextDouble();
		
		System.out.println("O nome do funcionário é: " + emp.nome);
		System.out.println("O Salário líquido do Funcionário é: R$"+emp.salarioMinimo());
		System.out.println("O Salário final do Funcionário é: R$"+emp.incrementoSalarial(acrescimo));
		
		
sc.close();
	}

}
