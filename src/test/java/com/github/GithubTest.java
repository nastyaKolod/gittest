package com.github;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.Assert;
import org.testng.annotations.Test;

import org.apache.commons.logging.Log;

public class GithubTest {
	 


	@Test
	 public void loginToGithubAndCreateRepository()
	 {
		
		  File path = new File("C:\\Users\\student\\AppData\\Local\\Mozilla Firefox\\firefox.exe");
		  FirefoxBinary ffbinary = new FirefoxBinary(path);
		  FirefoxProfile fp = new FirefoxProfile();
		  WebDriver driver = new FirefoxDriver(ffbinary, fp);
		  driver.get("https://github.com/login");
		  
		  RegestrationPage loginPage = new RegestrationPage(driver); 
		  String name ="nastyaKolod";
	      String pass="nastyaKolod12345";
	      String rep_name="my";
	  
	      loginPage.login(name, pass);
	      driver.get("https://github.com/new");
	      CreateRep cr =new CreateRep(driver);
	      cr.create(rep_name);
	      
		  
		
				  


	 }

}
