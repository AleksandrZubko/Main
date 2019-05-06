import com.operations.WorkWithGremlin;

import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(name = "Runner", urlPatterns = "/run")
public class Runner extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String operation = request.getParameter("operation");
        String pathBsh = request.getParameter("pathBsh");
        response.getWriter().print(WorkWithGremlin.distributor(operation, pathBsh));
    }
}
