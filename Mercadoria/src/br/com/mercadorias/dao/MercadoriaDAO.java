package br.com.mercadorias.dao;

import java.util.List;

import br.com.mercadorias.entity.Mercadoria;

public interface MercadoriaDAO extends GenericDAO<Mercadoria, Integer>{
	List<Mercadoria> listar();
}
