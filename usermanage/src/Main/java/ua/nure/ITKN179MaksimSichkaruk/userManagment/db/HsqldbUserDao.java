package ua.nure.ITKN179MaksimSichkaruk.userManagment.db;

import java.util.Collection;

import ua.nure.ITKN179MaksimSichkaruk.userManagment.User;

public class HsqldbUserDao implements Dao<User> {
	private ConnectionFactory connectionFactory;

	public HsqldbUserDao(ConnectionFactory connectionFactory) {
        this.connectionFactory = connectionFactory;
    }

	public HsqldbUserDao() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public User create(User entity) throws DatabaseException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(User entity) throws DatabaseException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(User entity) throws DatabaseException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User find(long id) throws DatabaseException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<User> findAll() throws DatabaseException {
		// TODO Auto-generated method stub
		return null;
	}

}
