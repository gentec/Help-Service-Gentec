package br.inf.gentec.hs.dao;

import java.io.Serializable;
import java.util.Collection;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import br.inf.gentec.hs.api.ObjectDBSearch;
import br.inf.gentec.hs.model.Usuario;

@Stateless(name="usuarioDAO")
@TransactionManagement(TransactionManagementType.CONTAINER)
public class UsuarioDAO implements ObjectDBSearch<Usuario>, Serializable {
	private static final long serialVersionUID = 1L;

	@PersistenceContext
	private EntityManager manager;
	
	@Override
	@TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
	public Collection<Usuario> findAll() {
		TypedQuery<Usuario> query = null;
		
		try {
			query = manager.createQuery("select u from Usuario u join fetch u.nivelAcesso un order by u.nomeCompleto", Usuario.class);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return query.getResultList();
	}
	
	@Override
	public Usuario query() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario queryKey(Object obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<Usuario> findKey(Object obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<Usuario> findKeyFilter(Object... objs) {
		// TODO Auto-generated method stub
		return null;
	}

}
