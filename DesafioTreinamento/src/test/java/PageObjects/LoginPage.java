package PageObjects;

import org.openqa.selenium.*;

public class LoginPage {

	private WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		
		this.driver = driver;
		
	}
	
	
	public WebElement getLoginEmailInput() {
		
		return driver.findElement(By.xpath("//div[@class='card__login']//input[@name='email']"));
		
	}
	
	public WebElement getLoginSenhaInput() {
		
		return driver.findElement(By.xpath("//div[@class='card__login']//input[@name='password']"));
		
	}
	
	
	public WebElement getRegisterButton() {
		
		return driver.findElement(By.xpath("//div[@class='login__buttons']/button[@class='style__ContainerButton-sc-1wsixal-0 ihdmxA button__child']"));	
		
	}
	
	public WebElement getLoginButton() {
		
		return driver.findElement(By.xpath("//div[@class='login__buttons']/button[@class='style__ContainerButton-sc-1wsixal-0 otUnI button__child']"));
		
	}
	
	public WebElement getRegisterEmailInput(){
		
		return driver.findElement(By.xpath("//div[@class='card__register']//input[@name='email']"));
		
	}
	
	public WebElement getRegisterNameInput(){
		
		return driver.findElement(By.xpath("//div[@class='card__register']//input[@name='name']"));
		
	}
	
	public WebElement getRegisterPasswordInput(){
		
		return driver.findElement(By.xpath("//div[@class='card__register']//input[@name='password']"));
		
	}
	
	public WebElement getRegisterPasswordConfirmationInput(){
		
		return driver.findElement(By.xpath("//div[@class='card__register']//input[@name='passwordConfirmation']"));
		
	}
	
	public WebElement getSaldoIniciaSpan() {
		
		return driver.findElement(By.id("toggleAddBalance"));
		
	}
	
	public WebElement getRegisterCadastrarButton() {
		
		return driver.findElement(By.xpath("//div[@class='card__register']//button[@type='submit']"));
		
	}
	
	public WebElement getCloseMensagemButton() {
		
		return driver.findElement(By.xpath("//div[@class='styles__ContainerInformations-sc-8zteav-3 fQkeSa']/a[@id='btnCloseModal']"));
		
	}
	
	
}
