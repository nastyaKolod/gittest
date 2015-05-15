package com.github;
import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegestrationPage {
	
	private WebDriver driver;
	
	@FindBy (id="login_field")
	private WebElement login;
	
	@FindBy (id="password")
	private WebElement password;
	
	
	
	public RegestrationPage( WebDriver d)
	{	 		  
		  PageFactory.initElements(d,this);
		  this.driver=d;
	}		
	
	
	public void login(String name, String pass ){		
		login.sendKeys(name);
		password.sendKeys(pass);
		password.submit();
		
	}
	
}