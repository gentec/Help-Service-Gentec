package br.inf.gentec.hs.api;

import java.util.Collection;

import javax.ejb.Local;

@Local
public interface ObjectDBSearch<T> {
	T query();
	T queryKey(Object obj);
	Collection<T> findAll();
	Collection<T> findKey(Object obj);
	Collection<T> findKeyFilter(Object...objs);
}
