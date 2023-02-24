package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Framework.Browser.Waits;

public class GenericPage {
	
	private WebDriver driver;
	private Waits wait;
	
	
	public GenericPage(WebDriver driver) {
		
		this.driver= driver;
		this.wait = new Waits(this.driver);
	
		
	}
	
	public WebElement getHomeValidation() {
		
		return driver.findElement(By.xpath("//div[@class='home__Footer-sc-1auj767-16 eeLkgF']/p[@class='home__Text-sc-1auj767-9 jjmPHj']"));
				
	}
	
	public WebElement getRegisterConfirm() {
		
		return driver.findElement(By.xpath("//div[@class='styles__ContainerInformations-sc-8zteav-3 fQkeSa']/a"));
				
	}
	
	public WebElement getLoginPageConfirm() {
		
		return driver.findElement(By.xpath("//div[@class='style__ContainerFieldInput-sc-s3e9ea-0 gQAEIG input__child']/label[@class='input__label']"));
		
	}
	
	public WebElement getSaldoDisponivelAposTransf() {
		
		return driver.findElement(By.id("textBalanceAvailable"));
		
	}
	
	public WebElement getExtratoValidation() {
		
		return driver.findElement(By.xpath("//div[@class='bank-statement__ContainerBalance-sc-7n8vh8-9 dntobx']/p[@class='bank-statement__LabelText-sc-7n8vh8-10 UPwdn']"));
		
	}
	
	public WebElement getTransferenciaPageValidation() {
		
		return driver.findElement(By.xpath("//div[@class='transfer__ContainerForm-sc-1yjpf2r-8 gasnNO']//button[@class='style__ContainerButton-sc-1wsixal-0 CMabB button__child']"));
		
	}
	
	public WebElement getTransferenciaValidation() {
		
		return driver.findElement(By.id("modalText"));
		
	}
	
	public WebElement getNumeroeDigitoconta() {
		
		return driver.findElement(By.xpath("//p[@id='textAccountNumber']/span[1]"));
		
	}
	
	

}
