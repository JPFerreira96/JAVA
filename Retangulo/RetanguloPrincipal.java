import java.util.Scanner;
public class RetanguloPrincipal{

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Retangulo ret = new Retangulo();
		
		System.out.println("Digite a Area e Largura de um retangulo: ");
		ret.largura = sc.nextDouble();
		ret.altura = sc.nextDouble();		
		
		System.out.println("o resultado da área é: " + ret.area());
		System.out.println("o resultado do perímetro é: " + ret.perimetro());
		System.out.println("o resultado da diagonal é: " + ret.diagonal());
		
	sc.close();	
	}

}
