package br.com.stadlab.dao;

import javax.persistence.EntityManager;
import br.com.stadlab.domain.Cliente;

public class ClienteDAO extends GenericDAO<Cliente, Integer> {

	public ClienteDAO(EntityManager em) {
		super(em);
	}

}
