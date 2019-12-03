import com.operations.DatabaseConnector;
import com.operations.ValidatorParam;
import java.io.IOException;
import javax.servlet.annotation.WebServlet;

// http://localhost:8087/nplStatApi/run?date_calc=2019-03-29

@WebServlet(name = "Runner", urlPatterns = "/run")
public class Runner extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String sid = request.getParameter("sid");
        String dateCalc = request.getParameter("date_calc");
        final String XML_BEGIN = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>";
        if (dateCalc == null) {
            response.getWriter().print(XML_BEGIN + "<error>Required parameter not passed date_calc</error>");
        } else {
           if (ValidatorParam.checkDate(dateCalc)) {
                if (DatabaseConnector.checkDriver()) {
                    if (DatabaseConnector.checkConnectToDatabase()) {
                        response.getWriter().print(DatabaseConnector.getData(dateCalc));
                        System.out.println(DatabaseConnector.getData(dateCalc));
                    } else {
                        response.getWriter().print(XML_BEGIN + "<error>Connection to database is failed</error>");
                    }
                } else {
                    response.getWriter().print(XML_BEGIN + "<error>PostgreSQL JDBC Driver is not found. Include it in your library path</error>");
                }
            } else {
                response.getWriter().print(XML_BEGIN + "<error>Parametr date_calc is not correct</error>");
            }
        }
    }
}
