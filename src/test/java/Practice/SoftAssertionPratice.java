package Practice;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertionPratice {
	@Test
	public void softAssertionPratice() {
		String expectedCity="Bangalore";
		String acutalCity="Bengaluru";
		System.out.println("Soft Assertion Starts");
		SoftAssert s=new SoftAssert();
		s.assertEquals(acutalCity, expectedCity);
		System.out.println("soft Assertion middle");
		s.assertFalse(acutalCity.contains(expectedCity));
		System.out.println("Soft Assertion ends");
		s.assertAll();
	}
}
