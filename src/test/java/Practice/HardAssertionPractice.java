package Practice;

import org.testng.Assert;
import org.testng.annotations.Test;
public class HardAssertionPractice {
	@Test
	public void hardAssertionPractice() {
		String expectedName="Ravi";
		String actualName="mahi";
		System.out.println("Hard Assertion starts");
		Assert.assertEquals(actualName, expectedName);
		System.out.println("Hard Assertion middle");
		Assert.assertFalse(actualName.equals(actualName));
		System.out.println("Hard Assertion ends");
	}
}
