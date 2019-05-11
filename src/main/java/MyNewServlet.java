
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class MyNewServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();

        String name = req.getParameter("name");
        String surname = req.getParameter("surname");


        out.println("Hello World from mvn ");

        Cookie cookie = new Cookie("Cookie", name);
        resp.addCookie(cookie);

        //resp.sendRedirect(req.getContextPath()+ "/test");

       // getServletContext().getRequestDispatcher("/test").forward(req, resp);
        //getServletContext().getRequestDispatcher("/test").include(req, resp);
    }

//    @Override
//    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        PrintWriter out = resp.getWriter();
//
//        out.println("Hello World from post");
//    }
}
