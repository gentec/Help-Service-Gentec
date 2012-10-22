package br.inf.gentec.hs.dao;

import java.io.Serializable;
import java.util.Collection;

import javax.ejb.Stateless;

import br.inf.gentec.hs.api.ObjectDBSearch;
import br.inf.gentec.hs.model.Usuario;

@Stateless(name="usuario")
public class UsuarioDAO implements ObjectDBSearch<Usuario>, Serializable {
	private static final long serialVersionUID = 1L;

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
	public Collection<Usuario> findAll() {
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
