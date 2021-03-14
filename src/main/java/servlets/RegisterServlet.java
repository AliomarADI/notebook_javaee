package servlets;

import dao.UserDao;
import model.User;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
    private UserDao userDao;

    public void init() {
        userDao = new UserDao();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {



    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("username");
        String password = request.getParameter("password");

        User user = new User();
        user.setName(name);
        user.setPassword(password);
        try {
            userDao.registerUser(user);
        } catch (Exception e) {
            e.printStackTrace();
        }

        RequestDispatcher rd=request.getRequestDispatcher("welcome");
        rd.forward(request,response);
//        response.sendRedirect("login.jsp");
    }
}
