public class Retangulo {
	
	public double largura;
	public double altura;
	
	public double area() {
		return this.largura*this.altura;
	}
	public double perimetro() {
		return 2*(this.largura + this.altura);
		
	}
	public double diagonal() {
		return Math.pow(this.largura, 2)+Math.pow(altura, 2);
		
	}
	
}
