package qaclickacademy.Mavenjava;

import org.testng.annotations.Test;

public class SeleniumTest {

	// testng xml file from Maven
	// How to execute all test cases from Test folder -mvn test
	@Test
	public void BrowserAutomation() {
		System.out.println("BrowserAutomation");
		
		System.out.println("BrowserAutomation1");
		System.out.println("BrowserAutomation2");
		
		System.out.println("BrowserAutomation3");
	}

	@Test
	public void elementsUi() {
		System.out.println("elementsUi");
	}
}
