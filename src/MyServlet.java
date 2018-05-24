import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

public class MyServlet extends javax.servlet.http.HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String input = req.getParameter("param");
        if (("x").equals(input)) {
            resp.getWriter().write("X_X");
        } else {
            resp.getWriter().write("<html> <title> RESPONSE </title><body> <div align=\"center\"> <h1>"
                    + input
                    + "</h1> </div></body> </html>");
        }
    }
}