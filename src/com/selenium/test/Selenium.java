package com.selenium.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selenium {
private static Actions doubleClick;

public static void main(String[] args) throws AWTException, IOException, InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rahul.R\\eclipse-workspace\\SeleniumRahul\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://netbanking.hdfcbank.com/netbanking/");
	driver.manage().window().maximize();
	WebElement b = driver.findElement(By.xpath("//frame[@name=\"login_page\"]"));
	driver.switchTo().frame(b);
	WebElement txtId = driver.findElement(By.xpath("//input[@name=\"fldLoginUserId\"]"));
	txtId.sendKeys("Rahul1998");
	WebElement img = driver.findElement(By.xpath("//img[@src=\"/gif/continue_new1.gif?v=1\"]"));
	img.click();
	Robot r = new Robot();
	r.keyPress(KeyEvent.VK_R);
	r.keyRelease(KeyEvent.VK_R);
	r.keyPress(KeyEvent.VK_A);
	r.keyRelease(KeyEvent.VK_A);
	r.keyPress(KeyEvent.VK_H);
	r.keyRelease(KeyEvent.VK_H);
	r.keyPress(KeyEvent.VK_U);
	r.keyRelease(KeyEvent.VK_U);
	r.keyPress(KeyEvent.VK_L);
	r.keyRelease(KeyEvent.VK_L);
}
}
