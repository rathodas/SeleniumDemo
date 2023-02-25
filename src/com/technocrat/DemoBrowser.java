package com.technocrat;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoBrowser {

	public static void main(String[] args) throws Exception {
		
		DemoBrowser browser = new DemoBrowser();
		browser.launchBrowser();
		
	}
	
	public void launchBrowser() throws Exception {
		/*
		 * ChromeDriver driver = new ChromeDriver();
		 * 
		 * driver.get("https://www.selenium.dev"); driver.manage().window().maximize();
		 * Thread.sleep(5000);
		 * 
		 * String title = driver.getTitle(); System.out.println(title);
		 * 
		 * 
		 * driver.close(); Thread.sleep(5000);
		 * 
		 * driver.quit(); Thread.sleep(5000);
		 */
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.selenium.dev");
		driver.quit();
		
		
	}
}
