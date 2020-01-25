package httpmethods;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicNameValuePair;

public class GetMethod2 {

	public static void main(String[] args) throws Exception {
		GetMethod2 client = new GetMethod2();
		System.out.println("Http GET Request Example\n");
		client.get();
	//	System.out.println("\nHttp POST Request Example\n");
	//	client.post();
	}

	public void get() {
		try {
			HttpClient client = HttpClientBuilder.create().build();
			HttpGet request = new HttpGet("https://www.technicalkeeda.com/get-request");
			HttpResponse response = client.execute(request);

			int responseCode = response.getStatusLine().getStatusCode();

			System.out.println("**GET** request Url: " + request.getURI());
			System.out.println("Response Code: " + responseCode);
			System.out.println("Content:-\n");
			BufferedReader rd = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));

			String line = "";
			while ((line = rd.readLine()) != null) {
				System.out.println(line);
			}

		} catch (ClientProtocolException e) {
			e.printStackTrace();
		} catch (UnsupportedOperationException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void post() {
		HttpClient client = HttpClientBuilder.create().build();
		HttpPost post = new HttpPost("https://www.technicalkeeda.com/post-request");
		try {
			List<NameValuePair> nameValuePairs = new ArrayList<NameValuePair>();
			nameValuePairs.add(new BasicNameValuePair("name", "Yashwant"));
			post.setEntity(new UrlEncodedFormEntity(nameValuePairs));

			HttpResponse response = client.execute(post);

			int responseCode = response.getStatusLine().getStatusCode();
			System.out.println("**POST** request Url: " + post.getURI());
			System.out.println("Parameters : " + nameValuePairs);
			System.out.println("Response Code: " + responseCode);
			System.out.println("Content:-\n");
			BufferedReader rd = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
			String line = "";
			while ((line = rd.readLine()) != null) {
				System.out.println(line);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}