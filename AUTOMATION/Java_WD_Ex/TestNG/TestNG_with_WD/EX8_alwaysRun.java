package TestNG_with_WD;

import org.testng.Assert;
import org.testng.annotations.Test;

public class EX8_alwaysRun {
	@Test
	public void patetTest() {
		Assert.fail("failed test");
	}
	
	@Test(dependsOnMethods="patetTest", alwaysRun=true)
	public void dependentTest() {
		System.out.println("*********************Running even if parentTest() failed*********************");
	}
}
