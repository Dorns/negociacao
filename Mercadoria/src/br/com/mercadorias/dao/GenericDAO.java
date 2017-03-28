package br.com.mercadorias.dao;

import br.com.mercadorias.exception.DBException;
import br.com.mercadorias.exception.IdNotFoundException;

public interface GenericDAO<T,K> {

	void cadastrar(T entity);
	void alterar(T entity);
	void remover(K codigo) throws IdNotFoundException;
	T pesquisar(K codigo);
	void salvar() throws DBException;
	
}