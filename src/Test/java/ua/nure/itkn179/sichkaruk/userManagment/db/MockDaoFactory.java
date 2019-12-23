package Test.java.ua.nure.itkn179.sichkaruk.userManagment.db;

import com.mockobjects.dynamic.Mock;

import Main.java.ua.nure.itkn179.sichkaruk.userManagment.db.Dao;
import Main.java.ua.nure.itkn179.sichkaruk.userManagment.db.DaoFactory;

public class MockDaoFactory extends DaoFactory {

	private Mock mockUserDao;
    
    public MockDaoFactory() {
        mockUserDao = new Mock(Dao.class);
    }
    
    public Mock getMockUserDao() {
        return mockUserDao;
    }
    
    public Dao getUserDao() {
        return (Dao) mockUserDao.proxy();
    }
}
