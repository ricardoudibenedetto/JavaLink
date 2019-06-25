package ejercicio01;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class notaTest {

	@Test
	public void notaAprobada()
	{
		Nota notaUno = new Nota(5);
		assertTrue(notaUno.aprobado());
	}
	
	@Test
	public void notaDesaprobado()
	{
		Nota notaUno = new Nota(2);
		assertTrue(notaUno.desaprobado());
	}
	@Test
	public void nuevaNota()
	{
		Nota notaUno = new Nota(2);
		assertTrue(notaUno.desaprobado());
		notaUno.Recuperar(5);
		assertTrue(notaUno.aprobado());
	}
}
