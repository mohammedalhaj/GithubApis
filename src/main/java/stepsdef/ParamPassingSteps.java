package stepsdef;

import httpmethods.GetMethod;
import io.cucumber.java.en.Given;

public class ParamPassingSteps {

	private GetMethod getMethod;

	public ParamPassingSteps() {
		getMethod = new GetMethod();
	}

	@Given("^call job link without param$")
	public void setUrlWithoutParams() {
		getMethod.setUrlWithoutParams();
	}

	@Given("call id job link with parameter {} and value {}")
	public void setUrlWithID(String paramOne, String valOne) {
		getMethod.setUrlWithID(paramOne, valOne);
	}

	@Given("call job link with parameter {} and value {}")
	public void setUrlWithOneParam(String paramOne, String valOne) {
		getMethod.setUrlWithOneParam(paramOne, valOne);
	}

	@Given("call job link with two parameters {} with value {} and {} with value {}")
	public void getURl(String paramOne, String valOne, String paramTwo, String valTwo) {
		getMethod.setUrlWithTwoParams(paramOne, valOne, paramTwo, valTwo);
	}

	@Given("call job link using three parameters {} with value {} and {} with value {} and {} with value {}")
	public void getURl(String paramOne, String valOne, String paramTwo, String valTwo, String paramThree,
			String valThree) {
		getMethod.setUrlWithThreeParams(paramOne, valOne, paramTwo, valTwo, paramThree, valThree);
	}

	@Given("call job link using four parameters {} with value {} and {} with value {} and {} with value {} and {} with value {}")
	public void getURl(String paramOne, String valOne, String paramTwo, String valTwo, String paramThree,
			String valThree, String paramFour, String valFour) {
		getMethod.setUrlWithFourParams(paramOne, valOne, paramTwo, valTwo, paramThree, valThree, paramFour, valFour);
	}

	@Given("call job link using five parameters {} with value {} and {} with value {} and {} with value {} and {} with value {} and {} with value {}")
	public void getURl(String paramOne, String valOne, String paramTwo, String valTwo, String paramThree,
			String valThree, String paramFour, String valFour, String paramFive, String valFive) {
		getMethod.setUrlWithFiveParams(paramOne, valOne, paramTwo, valTwo, paramThree, valThree, paramFour, valFour,
				paramFive, valFive);
	}

	@Given("call job link using six parameters {} with value {} and {} with value {} and {} with value {} and {} with value {} and {} with value {} and {} with value {}")
	public void getURl(String paramOne, String valOne, String paramTwo, String valTwo, String paramThree,
			String valThree, String paramFour, String valFour, String paramFive, String valFive, String paramSix,
			String valSix) {
		getMethod.setUrlWithSixParams(paramOne, valOne, paramTwo, valTwo, paramThree, valThree, paramFour, valFour,
				paramFive, valFive, paramSix, valSix);
	}

}
