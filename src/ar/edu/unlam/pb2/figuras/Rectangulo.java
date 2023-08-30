package ar.edu.unlam.pb2.figuras;

public class Rectangulo {
	
	private Double base;
	private Double altura;
	
	public Rectangulo(Double base, Double altura) {
		this.altura = altura;
		this.base = base;
	}

	@Override
	public String toString() {
		return "Rectangulo [base=" + base + ", altura=" + altura + "]";
	}
	
	public Double getPerimetro() {
		return this.altura * 2 + this.base * 2;
	}

	public Double getArea() {
		return this.base * this.altura;
	}
}
