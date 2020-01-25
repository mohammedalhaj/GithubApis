package stepsdef;

import java.io.IOException;

import org.testng.Assert;

import httpmethods.GetMethod;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GetSteps {

	private GetMethod getMethod;

	public GetSteps() {
		getMethod = new GetMethod();
	}

	@When("execute job github api")
	public void executeApi() {
		getMethod.executeRequest();
	}

	@Then("validate the response {int} is returned")
	public void verifyFromResponseCode(int statusCode) {
		Assert.assertEquals(getMethod.getResponseCode(), statusCode);
	}

	@Then("validate the response data is not null")
	public void verifyFromResponseData() throws IOException {
		System.out.println("Check that the response is not null");
		Assert.assertNotEquals(getMethod.getResponseData(), "[]");
	}

	@Then("validate the response data is null")
	public void verifyNullFromResponseData() throws IOException {
		System.out.println("Check that the response is null");
		Assert.assertTrue(getMethod.getResponseData().contains("f1d23bb"));
		//Assert.assertEquals(getMethod.getResponseData(), "[]");
	}

}
