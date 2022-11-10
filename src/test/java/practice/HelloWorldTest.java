package practice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class HelloWorldTest {
	
	@Test
	public void demoTest() {
		Reporter.log("Hello world",true);
	}

}
