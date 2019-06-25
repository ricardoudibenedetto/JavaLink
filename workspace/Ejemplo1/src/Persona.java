
public class Persona {
  
	private String nombre;

	public Persona()
	{
		this.nombre = "sin nombre";
	}
	public Persona(String nombre)
	{
		this.nombre = nombre;
	}
	
	
	public void CambiarNombre(String nombre)
	{
		this.nombre = nombre;
	}
	
	public String DecirNombre() 
	{
		return this.nombre;
	}
}
