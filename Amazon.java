package find_elements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
	
		//List<WebElement>web=driver.findElements(By.tagName("a"));
		List<WebElement>webdiv=driver.findElements(By.tagName("div"));
		/*for(WebElement b:web)
		{
			System.out.println(b.getText());
		}*/
		for(WebElement x:webdiv)
		{
			System.out.println(x.getText());
		}

	}

}
