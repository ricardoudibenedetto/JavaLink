package ejercicio01;

public class Nota {
	int nota;
	public Nota(int valorInicial)
	{
		this.nota = valorInicial;
	}
	
	public int ObtenerValor()
	{
		return this.nota;
	}
	public boolean aprobado()
	{
		return this.nota>3;
	}
	
	public boolean desaprobado()
	{
		return this.nota<4;
	}
	
	public void Recuperar(int nuevaNota)
	{
		this.nota = nuevaNota;
	}
	
}
