package facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Log_in {

	@Test
		// TODO Auto-generated me
	public void test() {
	
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		
		d.get("https://www.facebook.com/");
		d.manage().window().maximize();
		System.out.println("completed  test");
		d.close(); 
	
	}
	
}
