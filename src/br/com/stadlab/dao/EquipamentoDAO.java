package br.com.stadlab.dao;

import javax.persistence.EntityManager;
import br.com.stadlab.domain.Equipamento;

public class EquipamentoDAO extends GenericDAO<Equipamento, Integer> {

	public EquipamentoDAO(EntityManager em) {
		super(em);
	}

}
