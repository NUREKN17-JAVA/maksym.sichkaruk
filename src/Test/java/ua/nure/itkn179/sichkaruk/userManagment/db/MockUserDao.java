package Test.java.ua.nure.itkn179.sichkaruk.userManagment.db;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import Main.java.ua.nure.itkn179.sichkaruk.userManagment.User;
import Main.java.ua.nure.itkn179.sichkaruk.userManagment.db.ConnectionFactory;
import Main.java.ua.nure.itkn179.sichkaruk.userManagment.db.Dao;
import Main.java.ua.nure.itkn179.sichkaruk.userManagment.db.DatabaseExeption;

public class MockUserDao implements Dao {
	 private long id = 0;
	 private Map<Long, User> users = new HashMap<>();

    public User create(User user) throws DatabaseExeption {
        Long currentId = new Long(++id);
        user.setId(currentId);
        users.put(currentId, user);
        return user;
    }

    public void update(User user) throws DatabaseExeption {
        Long currentId = user.getId();
        users.remove(currentId);
        users.put(currentId, user);
    }

    public void delete(User user) throws DatabaseExeption {
        Long currentId = user.getId();
        users.remove(currentId);
    }

    public User find(Long id) throws DatabaseExeption {        
        return (User) users.get(id);
    }

    public Collection<User> findAll() throws DatabaseExeption {
        return users.values();
    }

    public void setConnectionFactory(ConnectionFactory connectionFactory) {

    }

    public Collection<User> find(String firstName, String lastName) throws DatabaseExeption {
        throw new UnsupportedOperationException();
    }

}