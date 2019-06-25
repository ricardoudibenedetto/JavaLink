import static org.junit.Assert.assertEquals;


import org.junit.Test;

public class PersonaTest {
	@Test
	public void AlConstruirUnaNuevaPersonaQuedaSinNombre() {
		Persona nn = new Persona();
		assertEquals("sin nombre", nn.DecirNombre());
	}

	@Test
	public void alConstruirUnaNuevaPersonaLePuedoDarNombre() {
		Persona conNombre = new Persona("santiago");
		assertEquals("santiago", conNombre.DecirNombre());
	}
	
	@Test
	public void alConstruirUnaNuevaPersonaPoderCambiarNombre()
	{
		Persona personaUno = new Persona();
		assertEquals("sin nombre", personaUno.DecirNombre());
		personaUno.CambiarNombre("pepe");
		assertEquals("pepe", personaUno.DecirNombre());
	}
}
