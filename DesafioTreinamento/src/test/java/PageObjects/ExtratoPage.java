package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ExtratoPage {
	
	private WebDriver driver;
	
	
	public ExtratoPage(WebDriver driver) {
		
		this.driver = driver;
		
	}
	
	public WebElement getVoltarButton(){
		
		return driver.findElement(By.id("btnBack"));
	}
	
	public Double getSaldoConta() {
		
		WebElement balanceElement = driver.findElement(By.id("textBalanceAvailable"));
        String balanceText = balanceElement.getText();
        String cleanBalanceText = balanceText.replaceAll("[^\\d]", "");
        cleanBalanceText = cleanBalanceText.replace("R", "");
        double balance;
        return balance = Double.parseDouble(cleanBalanceText);
		
	}
}
	
	