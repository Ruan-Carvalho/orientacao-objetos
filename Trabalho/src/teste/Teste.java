package teste;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import ruan.*;
import controle.*;

/**
 * Classe dedicada a testes unitários
 * @author Ruan Sobreira Carvalho
 * @since 2023
 * @version 1.0
 */

public class Teste {

	private final Proprietario usuario = Proprietario.getInstance();
	private final controllah controle = controllah.getInstance();
	
	@Test
	void testExcluirPatrimonio() {
		int index_valido = 1, index_invalido = -1;
				
		//Teste com indice valido
		
		assertTrue(controle.excluirPatrimonio(index_valido, usuario));
		
		/*Teste com indice invalido fora dos limites do 
		 * arraylist
		*/
		//Uso do try catch para tratamento do erro
		try {
	        assertFalse(controle.excluirPatrimonio(index_invalido, usuario));
	        fail("Expected IndexOutOfBoundsException to be thrown");
	    } catch (IndexOutOfBoundsException e) {
	    	
	    }
	}
	

	@Test
	void testPesquisa() {
		String valido = "Accord", invalido = "";
		
		/*Vetor de string criado para passar como parâmetro 
		 * de retorno ao teste
		 * */
		
		String[] retorno = controle.getPesquisa(valido);
		
		//Teste com valor correto
		
		assertEquals("Accord", retorno[0]);
		
		//Teste com valor incorreto
		
		assertEquals(null, controle.getPesquisa(invalido));

	}
	
	@Test
	void testCastPatrimonio() {
		int indice_valido = 1, indice_invalido = -1;
		
		//Teste se o retorno é != null caso seja passado um índice válido
		
		assertNotNull(controle.castPatrimonio(indice_valido));
		
		//Teste se é == null se o índice for inválido
		
		assertNull(controle.castPatrimonio(indice_invalido));
		
	}
	
}