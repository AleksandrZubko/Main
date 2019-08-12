import com.operations.Operations;

import javax.servlet.annotation.WebServlet;
import java.io.IOException;
//http://10.1.196.3:8087/checkMan/run?operation=checkMongo&procId=RESTR&tableName=RESTR.TRESTRUCT2018&checkId=1

@WebServlet(name = "Runner", urlPatterns = "/run")
public class Runner extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

        String operation = request.getParameter("operation");
        String procId = request.getParameter("procId");
        String tableName = request.getParameter("tableName");
        String checkId = request.getParameter("checkId");
        int checkIdInt = 0;

        if (operation == null) {
            response.getWriter().print("{\"status\": \"fail\", \"result\":\"required parameter operation not found\" }");
        } else if (operation.toUpperCase().equals("checkMongo".toUpperCase())) {
            if (procId != null && tableName != null && checkId != null) {
                try {
                    checkIdInt = Integer.parseInt(request.getParameter("checkId"));
                } catch (java.lang.NumberFormatException e) {
                    response.getWriter().print(Operations.RunSh.checkMongo("{\"status\": \"fail\", \"result\":\"checkId = " + checkId + "}"));
                }
                response.getWriter().print(Operations.RunSh.checkMongo(procId, tableName, checkIdInt));
            } else if (procId != null && tableName != null) {
                response.getWriter().print(Operations.RunSh.checkMongo(procId, tableName));
            } else {
                response.getWriter().print(Operations.RunSh.checkMongo(procId));
            }
        } else {
            response.getWriter().print("{\"status\": \"fail\", \"result\":\"operation " + operation + " not found\" }");
        }
    }
}
