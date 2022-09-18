import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Map;

import org.apache.commons.httpclient.URI; 
import org.json.*;

import com.sun.jndi.toolkit.url.Uri;
 

public class HttpJsonParser {

    static InputStream is = null;
    static JSONObject jObj = null;
    static String json = "";
    HttpURLConnection urlConnection = null;

    // function get json from url
    // by making HTTP POST or GET method
    public JSONObject makeHttpRequest(String url, String method,
                                      Map<String, String> params) throws JSONException {

        try {
        	
            StringBuilder builder = new StringBuilder();
            URL urlObj;
            String encodedParams = "";
            
            {
                for (Map.Entry<String, String> entry : params.entrySet()) {
                	if(builder.length()!=0) 
                		builder.append('&');
                	builder.append(URLEncoder.encode(entry.getKey(), "UTF-8"));
                	builder.append("=");
                	builder.append(URLEncoder.encode(entry.getValue(), "UTF-8"));
                }
            }

            byte[] postDatebyte= builder.toString().getBytes("UTF-8");
            urlObj = new URL(url);
            
            urlConnection = (HttpURLConnection) urlObj.openConnection();
            urlConnection.setRequestMethod(method); 
            urlConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            urlConnection.setRequestProperty("Content-Length", String.valueOf(postDatebyte.length));
            urlConnection.setDoOutput(true);
            try {
				urlConnection.getOutputStream().write(postDatebyte);
				urlConnection.connect();
			} catch (java.net.UnknownHostException e) {
			      System.out.println("Unknown Host Ex");
					System.out.println(e.toString());
					return null;
			}catch (Exception e) {
				System.out.println(e.toString());
				return null;
			}
			
             
            is = urlConnection.getInputStream(); 
            BufferedReader reader = new BufferedReader(new InputStreamReader(is));
            StringBuilder sb = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                sb.append(line + "\n");
            }
            is.close();
            
            json = sb.toString();
            System.out.println(json);
            jObj=new JSONObject(json);


        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (ProtocolException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } 

        // return JSON String
        return jObj;

    }
}
