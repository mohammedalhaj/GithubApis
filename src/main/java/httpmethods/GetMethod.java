package httpmethods;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.apache.http.ParseException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;

import util.PropertyData;

public class GetMethod {

	public PropertyData propertyData;
	public static HttpGet httpGet;
	public CloseableHttpResponse response;

	public void setUrlWithoutParams() {
		String apiUrl = new PropertyData().getData("positionUrl");
		httpGet = new HttpGet(apiUrl);
	}

	public void setUrlWithOneParam(String paramOne, String valOne) {
		String apiUrl = new PropertyData().getData("positionUrl") + paramOne + "=" + valOne;
		httpGet = new HttpGet(apiUrl);
	}

	public void setUrlWithID(String paramOne, String valOne) {
		String apiUrl = new PropertyData().getData("positionUrlWithId") + paramOne + "=" + valOne;
		httpGet = new HttpGet(apiUrl);
	}

	public void setUrlWithTwoParams(String paramOne, String valOne, String paramTwo, String valTwo) {
		String apiUrl = new PropertyData().getData("positionUrl") + paramOne + "=" + valOne + "&" + paramTwo + "="
				+ valTwo;
		System.out.println(apiUrl);
		httpGet = new HttpGet(apiUrl);
	}

	public void setUrlWithThreeParams(String paramOne, String valOne, String paramTwo, String valTwo, String paramThree,
			String valThree) {
		String apiUrl = new PropertyData().getData("positionUrl") + paramOne + "=" + valOne + "&" + paramTwo + "="
				+ valTwo + "&" + paramThree + "=" + valThree;
		System.out.println(apiUrl);
		httpGet = new HttpGet(apiUrl);
	}

	public void setUrlWithFourParams(String paramOne, String valOne, String paramTwo, String valTwo, String paramThree,
			String valThree, String paramFour, String valFour) {
		String apiUrl = new PropertyData().getData("positionUrl") + paramOne + "=" + valOne + "&" + paramTwo + "="
				+ valTwo + "&" + paramThree + "=" + valThree + "&" + paramFour + "=" + valFour;
		System.out.println(apiUrl);
		httpGet = new HttpGet(apiUrl);
	}

	public void setUrlWithFiveParams(String paramOne, String valOne, String paramTwo, String valTwo, String paramThree,
			String valThree, String paramFour, String valFour, String paramFive, String valFive) {
		String apiUrl = new PropertyData().getData("positionUrl") + paramOne + "=" + valOne + "&" + paramTwo + "="
				+ valTwo + "&" + paramThree + "=" + valThree + "&" + paramFour + "=" + valFour + "&" + paramFive + "="
				+ valFive;
		System.out.println(apiUrl);
		httpGet = new HttpGet(apiUrl);
	}

	public void setUrlWithSixParams(String paramOne, String valOne, String paramTwo, String valTwo, String paramThree,
			String valThree, String paramFour, String valFour, String paramFive, String valFive, String paramSix,
			String valSix) {
		String apiUrl = new PropertyData().getData("positionUrl") + paramOne + "=" + valOne + "&" + paramTwo + "="
				+ valTwo + "&" + paramThree + "=" + valThree + "&" + paramFour + "=" + valFour + "&" + paramFive + "="
				+ valFive + "&" + paramSix + "=" + valSix;
		System.out.println(apiUrl);
		httpGet = new HttpGet(apiUrl);
	}

	public void executeRequest() {
		try {
			response = HttpClientBuilder.create().build().execute(httpGet);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public int getResponseCode() {
		return response.getStatusLine().getStatusCode();
	}

	public String getResponseData() throws IOException {
		String responseData = null;
	//	String line = null;
			// responseData = EntityUtils.toString(response.getEntity(), "UTF-8");
			BufferedReader rd = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
			//System.out.println(rd.readLine());
			//String	line = rd.readLine();
			//System.out.println(line);
			JSONObject json = new JSONObject(rd.readLine().toString());
			System.out.println(json.getString("description"));
			return json.getString("id");
//			while ((line = rd.readLine()) != null) {
//				// System.out.println(line);
//			}
	}

}
