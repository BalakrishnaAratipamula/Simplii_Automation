package TestNG_Simple1;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Class002 {
	@Test
	public void method01(){
		Reporter.log("Method01 from Class002",true);
	}
	
	@Test
	public void method02(){
		Reporter.log("Method02 from Class002",true);
	}
}
