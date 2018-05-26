package br.com.stadlab.dao;

import javax.persistence.EntityManager;
import br.com.stadlab.domain.Medicao;

public class MedicaoDAO extends GenericDAO<Medicao, Integer> {

	public MedicaoDAO(EntityManager em) {
		super(em);
	}

}
