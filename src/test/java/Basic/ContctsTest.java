package Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ContctsTest {

	
	@Test
	public void createContactsTest() {
		WebDriver d=new ChromeDriver();
		d.get("https://www.flipkart.com/");
	}
}
