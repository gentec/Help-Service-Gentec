package br.inf.gentec.hs.api;

import java.util.Collection;

public interface ObjectDBSearch<T> {
	T query();
	T queryKey(Object obj);
	Collection<T> findAll();
	Collection<T> findKey(Object obj);
	Collection<T> findKeyFilter(Object...objs);
}
