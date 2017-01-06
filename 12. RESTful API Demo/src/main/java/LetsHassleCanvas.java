import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

/**
 * A class to make a quick RESTful API request and display the response
 * 
 * @see <a href=
 *      "http://www.mkyong.com/webservices/jax-rs/restful-java-client-with-apache-httpclient/">RESTful
 *      Java client with Apache HttpClient</a>
 */
public class LetsHassleCanvas {

	public static void main(String[] args) {
		try {
			/* create an HTTP client to make these requests of the API */
			DefaultHttpClient httpClient = new DefaultHttpClient();

			/*
			 * create a GET request for the information that we want (all of my
			 * repositories)
			 */
			HttpGet getRequest = new HttpGet("https://api.github.com/users/battis/repos");
			/*
			 * note that we need an authorization token in a header to get a
			 * response from the GitHub API!
			 */
			getRequest.addHeader("Authorization", "token ba3d0b2313d55ca22db070f57fdc39a000ba9e48");
			/*
			 * …and we're expecting a JSON response (JSON ≡ JavasScript Object
			 * Notation)
			 */
			getRequest.addHeader("accept", "application/json");

			/* make the request! */
			HttpResponse response = httpClient.execute(getRequest);

			/* make sure we got a good response (not, say, 404!) */
			if (response.getStatusLine().getStatusCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : " + response.getStatusLine().getStatusCode());
			}

			/* read the JSON content of the response into a string and display it */
			BufferedReader br = new BufferedReader(new InputStreamReader((response.getEntity().getContent())));
			String output;
			System.out.println("Output from Server .... \n");
			while ((output = br.readLine()) != null) {
				System.out.println(output);
			}

			/* say bye-bye to the HTTP connection -- not necessary, but good form */
			httpClient.getConnectionManager().shutdown();

		} catch (ClientProtocolException e) {

			e.printStackTrace();

		} catch (IOException e) {

			e.printStackTrace();
		}

	}

}
