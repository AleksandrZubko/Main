import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
//import org.json.JSONObject;

public class Main {
    public static void main(String[] args) throws IOException, IOException {
        String url = "https://opendatabot.com/api/v2/timeline?code=31785223&apiKey=MNpVapWNE7dY";

        URL obj = new URL(url);
        HttpURLConnection connection = (HttpURLConnection) obj.openConnection();

        connection.setRequestMethod("GET");

        BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();

        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();
        System.out.println(response.toString());


        ///org.json.JSONObject parsedObject = new org.json.JSONObject(response.toString());

        //System.out.println(parsedObject.get("status"));
    }
}
