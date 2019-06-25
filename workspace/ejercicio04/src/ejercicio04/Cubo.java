package ejercicio04;

public class Cubo {
	private int lado;
	public Cubo(int lado)
	{
		this.lado = lado;
	}
	
	public int medirLongitudLado()
	{
		return this.lado;
	}
	
	public void cambiarLongitudLado(int lado)
	{
		this.lado = lado;
	}
	
	public int medirSuperficieCara()
	{
		return (int) Math.pow(this.lado, 2);
	}
	public void cambiarSuperficieCara(int nuevaSuper)
	{
		this.lado = (int) Math.sqrt(nuevaSuper);
	}
	public int medirVolumen()
	{
		return (int) Math.pow(this.lado, 3);
	}
	
	public void cambiarVolumen(int nuevoVol)
	{
		this.lado = (int) Math.pow(nuevoVol, 1/3);
	}
}
