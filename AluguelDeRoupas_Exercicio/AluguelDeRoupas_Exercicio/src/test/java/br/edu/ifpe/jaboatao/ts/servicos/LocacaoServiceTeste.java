package br.edu.ifpe.jaboatao.ts.servicos;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import br.edu.ifpe.jaboatao.ts.entidades.Cliente;
import br.edu.ifpe.jaboatao.ts.entidades.Locacao;
import br.edu.ifpe.jaboatao.ts.entidades.Roupa;

public class LocacaoServiceTeste {
	@Test
	public void TesteRopa() {
		
		//Cenário
		LocacaoService service = new LocacaoService();
		Cliente cliente1 = new Cliente("Tingtang Gang Gangleader Honglu");
		Roupa ropa = new Roupa("Drip", "Z", 67, 24.54);
		
		//ação
		Locacao locacaoropa = service.alugarRoupa(cliente1, ropa);
		
		//verificação
		assertTrue(locacaoropa.getValorLocacao() == 24.54);
		assertTrue(cliente1.getNome() == "Tingtang Gang Gangleader Honglu");
		assertTrue(ropa.getNome() == "Drip");
		
		System.out.println("Funcionando.");
	}
}
