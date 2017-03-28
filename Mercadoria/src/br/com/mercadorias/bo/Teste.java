package br.com.mercadorias.bo;

import br.com.mercadorias.entity.Mercadoria;
import br.com.mercadorias.entity.TipoNegocio;

public class Teste {
	public static void main(String[] args) {
		Mercadoria m = new Mercadoria();
		m.setCodigo(0);
		m.setNome("Teste");
		m.setPreco(1);
		m.setQtd(1);
		m.setTipo("teste");
		m.setTipoNegocio(TipoNegocio.COMPRA);
		MercadoriaBO bo = new MercadoriaBO();
		bo.cadastrar(m);
	}
}
