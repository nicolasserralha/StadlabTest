package br.com.stadlab.dao;

import javax.persistence.EntityManager;
import br.com.stadlab.domain.TipoEstabelecimento;

public class TipoEstabelecimentoDAO extends GenericDAO<TipoEstabelecimento, Integer> {

	public TipoEstabelecimentoDAO(EntityManager em) {
		super(em);
	}

}
