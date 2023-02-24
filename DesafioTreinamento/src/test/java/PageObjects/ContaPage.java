package PageObjects;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.*;

public class ContaPage {
	
	private WebDriver driver;
	
	public ContaPage(WebDriver driver) {
		
		this.driver = driver;
		
	}
	
	public WebElement getTransferButton() {
		
		return driver.findElement(By.id("btn-TRANSFERÊNCIA"));
		
	}
	
	public WebElement getExtratoButton() {
		
		return driver.findElement(By.id("btn-EXTRATO"));
		
	}
	
	public WebElement getExitButton() {
		
		return driver.findElement(By.id("btnExit"));
		
	}
	

	

}
