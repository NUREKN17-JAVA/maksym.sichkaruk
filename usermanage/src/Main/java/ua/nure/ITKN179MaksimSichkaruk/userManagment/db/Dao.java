package ua.nure.ITKN179MaksimSichkaruk.userManagment.db;

import java.util.Collection;

public interface Dao<T> {
	T create(T entity) throws DatabaseException;

	void update(T entity) throws DatabaseException;

	void delete(T entity) throws DatabaseException;

	T find(long id) throws DatabaseException;

	Collection<T> findAll() throws DatabaseException;
}
