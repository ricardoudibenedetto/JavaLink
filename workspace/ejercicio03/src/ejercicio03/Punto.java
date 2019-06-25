package ejercicio03;

public class Punto {
	private int x;
	private int y;
	
	public Punto(int x , int y)
	{
		this.x = x;
		this.y = y;
	}
	
	public int GetX()
	{
		return this.x;
	}
	public int GetY()
	{
		return this.y;
	}
	
	public void changeX(int x)
	{
		this.x = x;
	}
	
	public void changeY(int y)
	{
		this.y = y;
	}
	
	public boolean estaEnCoordenadas()
	{
		return (this.x == 0 && this.y==0);
	}
	
	public boolean coordenadasEnX()
	{
		return (this.x == 0);
	}
	public boolean coordenadasEnY()
	{
		return (this.y == 0);
	}
}
