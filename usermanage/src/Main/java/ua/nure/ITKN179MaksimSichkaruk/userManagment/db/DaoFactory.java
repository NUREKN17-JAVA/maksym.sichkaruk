package ua.nure.ITKN179MaksimSichkaruk.userManagment.db;

import java.io.IOException;
import java.util.Properties;

import ua.nure.ITKN179MaksimSichkaruk.userManagment.User;

public class DaoFactory {
	private final Properties properties;
	private static final String USER = "connection.user";
	private static final String PASSWORD = "connection.password";
	private static final String URL = "connection.url";
	private static final String DRIVER = "connection.driver";
	private static final String HSQLDB_USER_DAO = "dao.UserDao";

	public DaoFactory() {
		properties = new Properties();
		try {
			properties.load(getClass().getClassLoader().getResourceAsStream("settings.properties"));
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
	
	private ConnectionFactory getConnectionFactory() {
		String user = properties.getProperty(USER);
	    String password = properties.getProperty(PASSWORD);
	    String url = properties.getProperty(URL);
	    String driver = properties.getProperty(DRIVER);
	    
	    return new ConnectionFactoryImplement(user, password, url, driver);
	}
	
	@SuppressWarnings("unchecked")
	public Dao<User> getUserDao() {
		Dao<User> result = null;
		try {
			Class<?> hsqldbUserDaoClass = Class.forName(properties.getProperty(HSQLDB_USER_DAO));
			result = (Dao<User>) hsqldbUserDaoClass.newInstance();
            result.setConnectionFactory(getConnectionFactory());
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		
		
		return result;
	}

}
