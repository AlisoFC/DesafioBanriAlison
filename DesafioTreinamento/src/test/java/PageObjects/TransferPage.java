package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TransferPage {
	
	private WebDriver driver;
	
	
	public TransferPage(WebDriver driver) {
		
		this.driver = driver;
		
	}
	
	public WebElement getNumerodaContaInput(){
		
		return driver.findElement(By.xpath("//div[@class='account__data']//input[@name='accountNumber']"));
		
	}
	
	public WebElement getDigitoInput() {
		
		return driver.findElement(By.xpath("//div[@class='account__data']//input[@name='digit']"));
		
	}
	
	public WebElement getValorTransferenciaInput() {
		
		return driver.findElement(By.xpath("//div[@class='style__ContainerFieldInput-sc-s3e9ea-0 gQAEIG input__child']//input[@name='transferValue']"));
		
	}
	
	public WebElement getTransferirButton() {
		
		return driver.findElement(By.xpath("//div[@class='transfer__ContainerForm-sc-1yjpf2r-8 gasnNO']//button[@class='style__ContainerButton-sc-1wsixal-0 CMabB button__child']"));
		
	}
	
	public WebElement getVoltarButton() {
		
		return driver.findElement(By.id("btnBack"));
		
	}
	
	public WebElement getConfirmaButton() {
		
		return driver.findElement(By.id("btnCloseModal"));
		
	}

}
