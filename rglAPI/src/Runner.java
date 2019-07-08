import com.operations.WorkWithGremlin;

import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

//http://10.1.196.3:8087/rglAPI_war_exploded/run?operation=list

@WebServlet(name = "Runner", urlPatterns = "/run")
public class Runner extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String operation = request.getParameter("operation");
        String pathBsh = request.getParameter("pathBsh");
        response.getWriter().print(WorkWithGremlin.distributor(operation, pathBsh));
/*
        //2019-06-18
        //получение атрибутов заголовка запроса
        Map<String, String> map = new HashMap<String, String>();

        Enumeration headerNames = request.getHeaderNames();
        String res = "{";
        while (headerNames.hasMoreElements()) {
            String key = (String) headerNames.nextElement();
            String value = request.getHeader(key);
            map.put(key, value);
            res += "\"" + key + "\": \"" + value + "\", ";
            //response.getWriter().print(", | key:" + key + ", value: " + value);
        }
        res = res.substring(0,res.length()-2);
        res += "}";
        response.getWriter().print(res);
*/
    }
}
