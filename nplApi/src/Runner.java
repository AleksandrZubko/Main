
import com.operations.DatabaseConnector;
import com.operations.SIDChecker;
import com.operations.SessionsChecker;
import com.operations.ValidatorParam;

import javax.servlet.annotation.WebServlet;
import java.io.IOException;

//пример запроса http://ucs-039.ipa.pbank.com.ua:8097/nplApi_war/run?sid=190704csb54s9mycx5ra&date_calc=20181229

@WebServlet(name = "Runner", urlPatterns = "/run")
public class Runner extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String sid = request.getParameter("sid");
        String dateCalc = request.getParameter("date_calc");
        final String XML_BEGIN = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>";
        if (sid == null && dateCalc == null) {
            response.getWriter().print(XML_BEGIN + "<error>Required parameters not passed sid and date_calc</error>");
        } else if (sid == null) {
            response.getWriter().print(XML_BEGIN + "<error>Required parameter not passed sid</error>");
        } else if (dateCalc == null) {
            response.getWriter().print(XML_BEGIN + "<error>Required parameter not passed date_calc</error>");
        } else {

            String sessionsLogin = null;

            if (SIDChecker.isBase64(sid)) {
                sessionsLogin = SessionsChecker.getSessionLogin(SessionsChecker.decodeCID(sid));
            } else {
                sessionsLogin = SessionsChecker.getSessionLogin(sid);
            }

            if (sessionsLogin.equals("Session UNAUTAREZATED")) {
                response.getWriter().print(XML_BEGIN + "<error>Session UNAUTAREZATED</error>");
            } else if (ValidatorParam.checkDate(dateCalc)) {
                if (DatabaseConnector.checkDriver()) {
                    if (DatabaseConnector.checkConnectToDatabase()) {
                        if (DatabaseConnector.checkPermission(sessionsLogin)) {
                            response.getWriter().print(DatabaseConnector.getData(dateCalc));
                            System.out.println(DatabaseConnector.getData(dateCalc));
                        } else {
                            response.getWriter().print(XML_BEGIN + "<error>For login " + sessionsLogin + " there is no access to the API</error>");
                        }
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
