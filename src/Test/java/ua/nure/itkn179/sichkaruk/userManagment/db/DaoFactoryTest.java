package Test.java.ua.nure.itkn179.sichkaruk.userManagment.db;

import junit.framework.TestCase;
import Main.java.ua.nure.itkn179.sichkaruk.userManagment.db.Dao;
import Main.java.ua.nure.itkn179.sichkaruk.userManagment.db.DaoFactory;

public class DaoFactoryTest extends TestCase {

	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testGetDao() {
		try {
			DaoFactory daoFactory = DaoFactory.getInstance();
			assertNotNull("DaoFactory instanse is null", daoFactory);
			Dao userDao = daoFactory.getUserDao();
			assertNotNull("UserDao instanse is null", userDao);
		} catch (RuntimeException e) {
			e.printStackTrace();
            fail(e.toString());
		}		
	}

}
