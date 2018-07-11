package tests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import asistente.Asistente;

public class BlogTest { 
	
	public final static String USUARIO = "delucas";

	Asistente jenkins;

	@Before
	public void setup() {
		jenkins = new Asistente("jenkins");
	}

	@Test
	public void imagenConRutaInexistente() {
		Assert.assertEquals("Disculpa... no entiendo el pedido, @delucas ¿podrías repetirlo?", jenkins.escuchar("@jenkins cocina"));
	}

	@Test
	public void queElMockFunciona() {
		Assert.assertEquals("Post de Anandtech:\nTitulo: Multiple AMD B450-Based Motherboards Listed in Europe Ahead of Launch+\nLink: https://www.anandtech.com/show/13050/amd-b450-mobos-listed-in-europe-ahead-of-launch\n", jenkins.escuchar("@jenkins revisar rss"));
	}
}