package org.BaseClass;

import java.util.concurrent.TimeUnit;

import org.UtilsClass.LoginDataProvider;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

public class BaseClass {

	public WebDriver driver;

	@BeforeMethod
	public void StartApp() {

		System.setProperty("webdriver.chrome.driver", "D:\\eclipseworkspace\\Naukri\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/");
	}

	@DataProvider(name = "LoginData")
	public String[][] getdata() {
		String[][] data = LoginDataProvider.getData();
		return data;

	}

	@AfterMethod
	public void closeApp() {
		driver.quit();
	}
}
