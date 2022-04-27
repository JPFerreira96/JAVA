
public class Empregado {
	public String nome;
	public double salario_bruto;
	public double imposto;
	
	public double salarioMinimo() {
		return this.salario_bruto-(this.salario_bruto*this.imposto/100);
		
	}
	public double incrementoSalarial(double acrescimo) {
		return this.salario_bruto+(this.salario_bruto*acrescimo/100);
		
	}

}
