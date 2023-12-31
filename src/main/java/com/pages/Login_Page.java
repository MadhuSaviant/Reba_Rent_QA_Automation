package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login_Page {
	@FindBy(xpath="//input[@id='mat-input-0']")
	private WebElement Login_Id;
	
	@FindBy(xpath="//input[@id='mat-input-1']")
	private WebElement password;

	@FindBy(xpath="//button[@class='mat-focus-indicator mat-raised-button mat-button-base mat-primary']")
	private WebElement login_Btn;

	@FindBy(xpath="//a[normalize-space()='Forgot Password?']")
	private WebElement forgot_password;
	
	public WebElement Login_Id () {
		return Login_Id;
	}
	public WebElement password () {
		return password;
	}
	
	public WebElement login_Btn () {
		return login_Btn;
	}
	
	public WebElement forgot_password () {
		return forgot_password;
	}
//Main menu pages and methods
	@FindBy(xpath="(//mat-icon[@role='img'][normalize-space()='menu'])[2]")
	private WebElement main_menu;
	
	@FindBy(xpath="//mat-icon[normalize-space()='notifications']")
	private WebElement notifications;
	
	@FindBy(xpath="//mat-icon[normalize-space()='person']")
	private WebElement account;
	
	@FindBy(xpath="(//mat-icon[@class='mat-icon notranslate red-color material-icons active mat-icon-no-color'])[1]")
	private WebElement myProperties;
	
	public WebElement main_menu () {
		return main_menu;
	}
	public WebElement notifications () {
		return notifications;
	}
	public WebElement account () {
		return account;
	}
	public WebElement myProperties () {
		return myProperties;
	}

}
