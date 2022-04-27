package aulasPoo_3;

public class Estudante {
	
	public String nome;
	public static double nota1, nota2, nota3;
	
	public double notaFinal() {
		return ((nota1*30)+(nota2*35)+(nota3*35))/100;
		
	}
	public double pontosRestantes() {
		//return (6 -((nota1*30)+(nota2*35)+(nota3*35))/100);
		return (6-(notaFinal()));
	}
}
