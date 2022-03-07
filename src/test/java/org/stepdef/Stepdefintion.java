package org.stepdef;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Stepdefintion {
	WebDriver driver;

	@Given("Open Browser and Maxmize screen")
	public void open_Browser_and_Maxmize_screen() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	}

	@When("to Check vailed email{string} and Invaild passwords{string}")
	public void to_Check_vailed_email_and_Invaild_passwords(String email, String pass) {
		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.name("pass")).sendKeys(pass);
		driver.findElement(By.name("login")).click();
	}

	@Then("To print error message {string}and close browser")
	public void to_print_error_message_and_close_browser(String name) throws IOException, InterruptedException {
	   Thread.sleep(3000);
		TakesScreenshot s=(TakesScreenshot)driver;
	     File ss = s.getScreenshotAs(OutputType.FILE);
	     File ns= new  File("C:\\Users\\srira\\eclipse-workspace\\Bds\\src\\test\\resources\\Screenshots\\"+name+".png");
	     FileUtils.copyFile(ss, ns);
	     driver.close();
	 
	}

}
