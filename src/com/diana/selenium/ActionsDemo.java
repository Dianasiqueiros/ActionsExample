package com.diana.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo {
	public static void main(String []args) {
		System.setProperty("webdriver.chrome.driver", "//Users//DSV//Downloads//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		Actions action = new Actions(driver);
		//entrada en mayusculas
		action.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
		//build ready to execute and moves to specific element 
		action.moveToElement(driver.findElement(By.cssSelector("[id='nav-link-accountList']"))).build().perform();;
		action.moveToElement(driver.findElement(By.cssSelector("[id='nav-link-accountList']"))).contextClick().build().perform();
		//drap an drop
	}

}
