import com.operations.ConnectorToIq;
import com.operations.ResponseHandler;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;

@WebServlet(name = "Runner", urlPatterns = "/run")
public class Runner extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        response.getWriter().print(ResponseHandler.getJSON(new ConnectorToIq().executeSQL()));
    }
}