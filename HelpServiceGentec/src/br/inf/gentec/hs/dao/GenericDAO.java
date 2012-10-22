package br.inf.gentec.hs.dao;

import java.io.Serializable;

import javax.ejb.Stateful;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.inf.gentec.hs.api.ObjectDBPersist;
import br.inf.gentec.hs.api.ObjectModel;

@Stateful
@TransactionManagement(TransactionManagementType.CONTAINER)
@TransactionAttribute(TransactionAttributeType.REQUIRED)
public class GenericDAO implements Serializable, ObjectDBPersist {
	private static final long serialVersionUID = 6421402644470271129L;
	
	@PersistenceContext
	private EntityManager manager;

	@Override
	public <T extends ObjectModel> Boolean save(T oT) {
		try {
			manager.merge(oT);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			try {
				manager.getTransaction().rollback();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			return false;
		}
	}

	@Override
	public <T extends ObjectModel> Boolean update(T oT) {
		try {
			manager.refresh(oT);
			return true;
		} catch (Exception e) {
			try {
				manager.getTransaction().rollback();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			return false;
		}
	}

	@Override
	public <T extends ObjectModel> Boolean delete(T oT) {
		try {
			manager.remove(oT);
			return true;
		} catch (Exception e) {
			try {
				manager.getTransaction().rollback();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			return false;
		}
	}
}
