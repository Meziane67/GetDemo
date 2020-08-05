package qaclickacademy.Mavenjava;

import org.testng.annotations.Test;

public class SeleniumTest {

	// testng xml file from Maven
	// How to execute all test cases from Test folder -mvn test
	@Test
	public void BrowserAutomation() {
		System.out.println("BrowserAutomation");
	}

	@Test
	public void elementsUi() {
		System.out.println("elementsUi");
	}
}
