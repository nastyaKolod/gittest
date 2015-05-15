package com.github;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateRep {
private WebDriver driver;
	
	@FindBy (id="repository_name")
	private WebElement repository_name;
	
	
	public CreateRep( WebDriver d)
	{	 		  
		  PageFactory.initElements(d,this);
		  this.driver=d;
	}		
	
	
	public void create(String rep_name)	
	{	
		repository_name.sendKeys(rep_name);
		repository_name.submit();		
	}

}
