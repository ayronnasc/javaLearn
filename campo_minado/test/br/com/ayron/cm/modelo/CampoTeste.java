package br.com.ayron.cm.modelo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CampoTeste {
	
	private Campo campo = new Campo(3,3);
	
	@Test
	void testeVizinhoRealD1()
	{
		Campo vizinho = new Campo(3,2);
		
		boolean result = campo.addVizinho(vizinho);
		
		assertTrue(result);
	}
}


