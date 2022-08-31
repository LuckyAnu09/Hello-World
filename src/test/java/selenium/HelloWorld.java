package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloWorld {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/kmani/eclipse-workspace/Hello-World/src/test/resources/driver/chromedriver.exe");
		
		WebDriver chromedriver = new ChromeDriver();
		chromedriver.get("https://www.amazon.com/");
		
	}
}
