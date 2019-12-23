package Main.java.ua.nure.itkn179.sichkaruk.userManagment.db;

public class DaoFactoryImpl extends DaoFactory {
		
	public Dao getUserDao() {
        Dao result = null;
        try {
            Class<?> clazz = Class.forName(properties.getProperty(USER_DAO));
            result = (Dao) clazz.newInstance();
            result.setConnectionFactory(getConnectionFactory());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return result;
    }
}
