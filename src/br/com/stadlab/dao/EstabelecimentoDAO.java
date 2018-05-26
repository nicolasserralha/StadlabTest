package br.com.stadlab.dao;

import javax.persistence.EntityManager;

import br.com.stadlab.domain.Estabelecimento;

public class EstabelecimentoDAO extends GenericDAO<Estabelecimento, Integer> {

	public EstabelecimentoDAO(EntityManager em) {
		super(em);
	}

}
