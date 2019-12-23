package Main.java.ua.nure.itkn179.sichkaruk.userManagment.web;


import Main.java.ua.nure.itkn179.sichkaruk.userManagment.User;
import Main.java.ua.nure.itkn179.sichkaruk.userManagment.db.DaoFactory;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AddServlet extends EditServlet {

    @Override
    protected void showPage(HttpServletRequest req, HttpServletResponse resp) throws ServletException {
        try {
            req.getRequestDispatcher(main.java.ua.nure.itai171.chmutov.usermanagement.web.BrowseServlet.EDIT_JSP).forward(req, resp);
        } catch (IOException e) {
            e.printStackTrace();
            throw new ServletException(e.getMessage());
        }
    }

    @Override
    protected void processUser(User userToProcess) throws DatabaseException {
        DaoFactory.getInstance().getUserDao().create(userToProcess);
    }
}