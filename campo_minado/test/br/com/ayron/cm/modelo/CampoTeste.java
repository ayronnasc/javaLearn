package br.com.ayron.cm.modelo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.ayron.cm.excecao.ExplosaoException;

public class CampoTeste {
	
	private Campo campo;
	
	@BeforeEach
	void iniciarCampo()
	{
		campo = new Campo(3,3);
	}
	
	@Test
	void testeVizinhoD1Esquerda()
	{
		Campo vizinho = new Campo(3,2);		
		boolean result = campo.addVizinho(vizinho);
		assertTrue(result);
	}
	
	@Test
	void testeVizinhoD1Direita()
	{
		Campo vizinho = new Campo(3,4);		
		boolean result = campo.addVizinho(vizinho);
		assertTrue(result);
	} 
	
	@Test
	void testeVizinhoD1Cima()
	{
		Campo vizinho = new Campo(2,3);		
		boolean result = campo.addVizinho(vizinho);
		assertTrue(result);
	} 
	
	@Test
	void testeVizinhoD1Baixo()
	{
		Campo vizinho = new Campo(4,3);		
		boolean result = campo.addVizinho(vizinho);
		assertTrue(result);
	} 
	
	@Test
	void testeNaoVizinho()
	{
		Campo vizinho = new Campo(5,2);		
		boolean result = campo.addVizinho(vizinho);
		assertFalse(result);
	} 
	
	@Test
	void testeValorPadraoMarcado()
	{
		assertFalse(campo.isMarcado()); 
	} 
	
	@Test
	void testeAlternarMarcacao()
	{
		campo.alternarMarcacao();
		assertTrue(campo.isMarcado()); 
	} 

	@Test
	void testeAlternarMarcacaoChamadaDupla()
	{
		campo.alternarMarcacao();
		campo.alternarMarcacao();
		assertFalse(campo.isMarcado()); 
	} 
	
	@Test
	void testeAbrirNaoMinadoNaoMarcado()
	{
		assertTrue(campo.abrir());
	} 
	
	@Test
	void testeAbrirNaoMinadoMarcado()
	{
		campo.alternarMarcacao();
		assertFalse(campo.abrir());
	} 
	
	@Test
	void testeAbrirMinadoMarcado()
	{
		campo.alternarMarcacao();
		campo.minar();
		assertFalse(campo.abrir());
	} 

	@Test
	void testeAbrirMinadoNaoMarcado()
	{
		campo.minar();
		
		assertThrows(ExplosaoException.class, () -> 
				{campo.abrir();} 
		);
	} 
	
	@Test
	void testeAbrirComVizinho()
	{
		Campo viz1 		= new Campo(2,2);
		Campo vizDoViz1 = new Campo(1,1);
		
		viz1.addVizinho(vizDoViz1);
		
		campo.addVizinho(viz1);
		campo.abrir();
		
		assertTrue(viz1.isAberto() && vizDoViz1.isAberto());
	} 

	@Test
	void testeAbrirComVizinho2()
	{
		
		Campo vizDoViz1 = new Campo(1,1);
		Campo campo12   = new Campo(1,2);
		campo12.minar();
		
		Campo viz1 		= new Campo(2,2);
		
		viz1.addVizinho(vizDoViz1);
		viz1.addVizinho(campo12);
		
		campo.addVizinho(viz1);
		campo.abrir();
		
		assertTrue(viz1.isAberto() && vizDoViz1.isFechado());
	} 
	
	@Test
	void testeXcerto()
	{
		assertTrue(campo.getX() == campo.getX());
	}
	
	@Test
	void testeYcerto()
	{
		assertTrue(campo.getY() == campo.getY());
	} 
	
	@Test
	void testeMinado()
	{
		campo.minar();
		assertTrue(campo.isMinado());
	} 
	
	@Test
	void testeMinasNaVizinhacaMaiorQue0()
	{
		Campo viz1 		= new Campo (3,4);
		viz1.minar();
		
		campo.addVizinho(viz1);
		
		assertTrue(campo.minasNaVizinhanca() > 0);
	} 
	
	@Test
	void testeObjetivoAlcancadoDesvendado()
	{
		campo.abrir();
		assertTrue(campo.objetivoAlcancado());
	} 
	
	@Test
	void testeObjetivoAlcancadoProtegido()
	{
		campo.minar();
		campo.alternarMarcacao();
		assertTrue(campo.objetivoAlcancado());
	} 
	
	//reiniciar
	
	@Test
	void testeReiniciarCampoMinado()
	{
		campo.minar();
		campo.reiniciar();
		assertTrue(campo.isMinado() == false);
	} 
	
	@Test
	void testeReiniciarCampoAberto()
	{
		campo.abrir();
		campo.reiniciar();
		assertTrue(campo.isAberto() == false);
	} 
	
	@Test
	void testeReiniciarCampoMarcado()
	{
		campo.alternarMarcacao();
		campo.reiniciar();
		assertTrue(campo.isMarcado() == false);
	} 
	
	@Test
	void testeReiniciarMarcadoMinado()
	{
		campo.minar();
		campo.alternarMarcacao();
		
		campo.reiniciar();
		assertTrue(campo.isMarcado() == false && campo.isMinado() == false);
	} 
	
	@Test
	void testeReiniciarAbertoMinado()
	{
		campo.abrir();
		campo.minar();
		
		campo.reiniciar();
		assertTrue(campo.isAberto() == false && campo.isMinado() == false);
	} 
	
	@Test
	void testeStringMinado()
	{
		campo.abrir();
		campo.minar();
		
		assertTrue(campo.toString() == "*");
	} 
	
	@Test
	void testeStringNaoMinado()
	{
		campo.abrir();
		
		assertFalse(campo.toString() == "*");
	} 
	
	@Test
	void testeStringMarcado()
	{
		campo.alternarMarcacao();
		
		assertTrue(campo.toString() == "X");
	} 
	
	@Test
	void testeStringNaoMarcado()
	{
		assertFalse(campo.toString() == "X");
	} 
	
	@Test
	void testeStringEscondido()
	{
		assertTrue(campo.toString() == "?");
	} 
	
	@Test
	void testeStringNaoEscondido()
	{
		campo.abrir();
		assertFalse(campo.toString() == "?");
	} 
	
	@Test
	void testeString1MinasNaVizinhanca()
	{
		Campo viz1 		= new Campo (3,4);
		viz1.minar();
		
		campo.addVizinho(viz1);
		campo.abrir();
		
		assertTrue(campo.toString().equals("1"));
	} 
	
	@Test
	void testeString2MinasNaVizinhanca()
	{
		Campo viz1 		= new Campo (4,4);
		Campo viz2 		= new Campo (2,3);
		viz1.minar();
		viz2.minar();
		
		campo.addVizinho(viz2);
		
		campo.addVizinho(viz1);
		campo.abrir();
		
		assertTrue(campo.toString().equals("2"));
	} 
}


