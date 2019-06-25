package ejercicio06;

public class Circulo {

	private double radio;
	public Circulo(double rad) {
		this.radio= rad;
	}
	
	public double GetDiametro()
	{
		return this.radio * 2;
	}
	
	public double GetPerimetro()
	{
		return (2*Math.PI*(this.radio));
	}
	
	public double GetSuperficie() {
		return Math.PI * (Math.pow(this.radio, 2));
	}
}
