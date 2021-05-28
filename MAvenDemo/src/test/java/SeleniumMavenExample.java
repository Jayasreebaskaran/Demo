import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumMavenExample {

	@Test
	public void method1()
	{
		
		// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver","C:/Users/dell/Downloads/chromedriver_win32/chromedriver.exe");
ChromeDriver driver = new ChromeDriver();
driver.get("https://www.futurecae.com/");
System.out.println(driver.getTitle());
System.out.println(driver.getCurrentUrl());
System.out.println(driver.getTitle().length());
}
}
