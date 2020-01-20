package stepsdef;

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
	public void verifyFromResponseData() {
		System.out.println("Check that the response is not null");
		Assert.assertNotEquals(getMethod.getResponseData(), "[]");
	}

	@Then("validate the response data is null")
	public void verifyNullFromResponseData() {
		System.out.println("Check that the response is null");
		Assert.assertEquals(getMethod.getResponseData(), "[]");
	}

}
