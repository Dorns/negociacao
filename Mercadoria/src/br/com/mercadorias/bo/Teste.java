package br.com.mercadorias.bo;

import java.util.List;

import br.com.mercadorias.entity.Mercadoria;

public class Teste {
	public static void main(String[] args) {
		Mercadoria m = new Mercadoria();
		m.setCodigo(0);
		MercadoriaBO bo = new MercadoriaBO();

		List<Mercadoria> mercadorias = bo.listar(m.getCodigo());

		for (Mercadoria mercadoria : mercadorias) {
			System.out.println(mercadoria.getNome());
		}
	}
}
