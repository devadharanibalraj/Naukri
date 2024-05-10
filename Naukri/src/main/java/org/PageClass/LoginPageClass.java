package org.PageClass;

import org.BaseClass.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPageClass extends BaseClass {

	public LoginPageClass(WebDriver driver) {
		this.driver = driver;
	}

	public void loginLink() {
		WebElement login = driver.findElement(By.id("login_Layer"));
		login.click();
	}

	public void email(String data) {

		WebElement email = driver.findElement(By.xpath("//input[contains(@placeholder,'Username')]"));
		email.sendKeys(data);
	}

	public void password(String data) {

		WebElement password_element = driver.findElement(By.xpath("//input[@type='password']"));
		password_element.sendKeys(data);
	}

	public String loginButton() {
		WebElement login_button = driver.findElement(By.xpath("//button[text()='Login']"));
		login_button.submit();
		WebDriverWait wait = new WebDriverWait(driver, 2);
		try {
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//img[@class='user-img']")));
			return driver.getCurrentUrl();
		} catch (Exception e) {
			return driver.getCurrentUrl();
		}
	}
}
	
