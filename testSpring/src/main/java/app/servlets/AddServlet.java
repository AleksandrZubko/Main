package app.servlets;

import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(name = "Add", urlPatterns = "/add")
public class AddServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        response.getWriter().print("dsfadeswfv1");

    }
    @Override
    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        response.getWriter().print("dsfadeswfv2");
    }
}
