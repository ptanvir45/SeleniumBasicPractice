package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/?gclid=CjwKCAjwp7eUBhBeEiwAZbHwkcE4Jzy51zdTxDUZJVJFY2x0CmCgmuUg_e3dMgXgkv-4r7JqkawxbRoCC5IQAvD_BwE");

		WebElement Country_Ele = driver.findElement(By.xpath("//*[@name='Country']"));

		Select dpCountry_Ele = new Select(Country_Ele);

		List<WebElement> options = dpCountry_Ele.getOptions();

		for (WebElement Dr_option : options) {
			if (Dr_option.getText().equals("Bangladesh")) {
				Dr_option.click();
				break;
			}
		}

	}

}
