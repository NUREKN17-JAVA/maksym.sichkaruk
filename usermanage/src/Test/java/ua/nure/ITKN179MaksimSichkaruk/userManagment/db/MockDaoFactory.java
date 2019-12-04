package ua.nure.ITKN179MaksimSichkaruk.userManagment.db;

import com.mockobjects.dynamic.Mock;

import ua.nure.ITKN179MaksimSichkaruk.userManagment.db.Dao;
import ua.nure.ITKN179MaksimSichkaruk.userManagment.db.DaoFactory;

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
