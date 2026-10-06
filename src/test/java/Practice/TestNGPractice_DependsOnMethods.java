package Practice;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(genericUtility.ListenersImplementation.class)
public class TestNGPractice_DependsOnMethods {
	
	@Test(priority=1)
	public void nithinWakes() {
		//Assert.fail();
		System.out.println("Good mrng bangoalore");
	}
	
	@Test(priority=2,dependsOnMethods= {"nithinWakes"})
	public void nithinChats() {
		System.out.println("Hello Baby");
	}
	
	@Test(priority='a')
	public void nithinEats() {
		System.out.println("I Love Chicken");
	}
	
	@Test(priority=-4)
	public void nithinSleeps() {
		System.out.println("Good night love");
	}
}
