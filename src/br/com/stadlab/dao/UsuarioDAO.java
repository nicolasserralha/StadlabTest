package br.com.stadlab.dao;

import javax.persistence.EntityManager;
import br.com.stadlab.domain.Usuario;

public class UsuarioDAO extends GenericDAO<Usuario, Integer> {

	public UsuarioDAO(EntityManager em) {
		super(em);
	}

}
