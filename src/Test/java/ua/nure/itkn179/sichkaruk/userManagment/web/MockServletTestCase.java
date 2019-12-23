package Test.java.ua.nure.itkn179.sichkaruk.userManagment.web;


import Main.java.ua.nure.itkn179.sichkaruk.userManagment.db.DaoFactory;
import Test.java.ua.nure.itkn179.sichkaruk.userManagment.db.MockDaoFactory;
import com.mockobjects.dynamic.Mock;
import com.mockrunner.servlet.BasicServletTestCaseAdapter;
import java.util.Properties;

public abstract class MockServletTestCase extends BasicServletTestCaseAdapter {
    private Mock mockUserDao;

    public Mock getMockUserDao() {
        return mockUserDao;
    }

    public void setMockUserDao(Mock mockUserDao) {
        this.mockUserDao = mockUserDao;
    }

    protected void setUp() throws Exception {
        super.setUp();
        Properties properties = new Properties();
        properties.setProperty("dao.factory", MockDaoFactory.class.getName());
        DaoFactory.init(properties);
        setMockUserDao(((MockDaoFactory)DaoFactory.getInstance()).getMockUserDao());

    }

    protected void tearDown() throws Exception {
        super.tearDown();
        getMockUserDao().verify();
    }
}
