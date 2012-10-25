package br.inf.gentec.hs.api;

import javax.ejb.Local;

@Local
public interface ObjectDBPersist {
	<T extends ObjectModel> Boolean save(T oT);
	<T extends ObjectModel> Boolean update(T oT);
	<T extends ObjectModel> Boolean delete(T oT);
}
