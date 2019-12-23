package Main.java.ua.nure.itkn179.sichkaruk.userManagment.db;

import java.util.Collection;

import Main.java.ua.nure.itkn179.sichkaruk.userManagment.User;

public interface Dao {
	User create(User entity) throws DatabaseExeption;
	
	User find(Long id) throws DatabaseExeption;
	
	void update(User entity) throws DatabaseExeption;
	
	void delete(User entity) throws DatabaseExeption;
	
	Collection<User> findAll() throws DatabaseExeption;
	
	void setConnectionFactory(ConnectionFactory connectoinFactory);
}
