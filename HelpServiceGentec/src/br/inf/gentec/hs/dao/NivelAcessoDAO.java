package br.inf.gentec.hs.dao;

import java.io.Serializable;
import java.util.Collection;

import javax.ejb.Local;
import javax.ejb.Stateful;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import br.inf.gentec.hs.api.ObjectDBSearch;
import br.inf.gentec.hs.model.NivelAcesso;

@Local
@Stateful(name="nivelacessoDAO")
@TransactionManagement(TransactionManagementType.CONTAINER)
@TransactionAttribute(TransactionAttributeType.REQUIRED)
public class NivelAcessoDAO implements ObjectDBSearch<NivelAcesso>, Serializable {
	private static final long serialVersionUID = 350062811417627864L;

	@PersistenceContext
	private EntityManager manager;
	
	@Override
	public Collection<NivelAcesso> findAll() {
		TypedQuery<NivelAcesso> query = null;
		
		try {
			System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>");
			query = this.manager.createQuery("select n from NivelAcesso n", NivelAcesso.class);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return query.getResultList();
	}
	
	@Override
	public NivelAcesso query() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public NivelAcesso queryKey(Object obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<NivelAcesso> findKey(Object obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<NivelAcesso> findKeyFilter(Object... objs) {
		// TODO Auto-generated method stub
		return null;
	}

}
