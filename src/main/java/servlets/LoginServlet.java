package servlets;

import dao.UserDao;
import model.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    private UserDao userDao;

    public void init() {
        userDao = new UserDao();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();

//        String userSession = (String) session.getAttribute("current_user");

//        if (userSession == null){
            //response для анонимного пользователя
            // авторизация
            //регистрация
            // session.setAttribute("current_user", ID);
//        }else{
            // response для авторизованного пользователя
//        }

//        User user = (User) session.getAttribute("user");
       }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String name = request.getParameter("username");
        String password = request.getParameter("password");
        User user = new User();
        user.setName(name);
        user.setPassword(password);

        try {
            if (userDao.validate(user)) {
                //HttpSession session = request.getSession();
                // session.setAttribute("username",username);
                System.out.println("SUCCESSFULLY CONNECTED");
                out.println("<center>\n<h1>You logged in " + name + " !</h1>");
                response.sendRedirect("index.jsp");
            } else {
                HttpSession session = request.getSession();
                response.sendRedirect("login.jsp");
                //session.setAttribute("user", username);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
