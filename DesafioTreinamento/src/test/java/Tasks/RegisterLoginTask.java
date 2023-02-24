package Tasks;


import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import Framework.Browser.Waits;
import Framework.Utils.FileOperation;
import PageObjects.ContaPage;
import PageObjects.GenericPage;
import PageObjects.LoginPage;
import Validations.GenericValidation;
import Framework.Utils.FileOperation;


public class RegisterLoginTask {
	
	private WebDriver driver;
	private LoginPage loginPage;
	private ContaPage contaPage;

	private GenericValidation genericValidation;
	
	public RegisterLoginTask(WebDriver driver) {
				
		this.driver = driver;
		loginPage = new LoginPage(this.driver);
		genericValidation = new GenericValidation(this.driver);
		
		contaPage = new ContaPage(this.driver);
		
	}
	
	public void criarConta1(){
		
		loginPage.getRegisterButton().click();
		loginPage.getRegisterEmailInput().sendKeys(FileOperation.getProperties("user1").getProperty("email"));
		loginPage.getRegisterNameInput().sendKeys(FileOperation.getProperties("user1").getProperty("nome"));
		loginPage.getRegisterPasswordInput().sendKeys(FileOperation.getProperties("user1").getProperty("senha"));
		loginPage.getRegisterPasswordConfirmationInput().sendKeys(FileOperation.getProperties("user1").getProperty("senha"));
		loginPage.getSaldoIniciaSpan().click();
		loginPage.getRegisterCadastrarButton().click();
		genericValidation.validationRegister();
		loginPage.getCloseMensagemButton().click();
		genericValidation.validationLoginPage();
	}
	
	public void criarConta2() {
		
		loginPage.getRegisterButton().click();
		loginPage.getRegisterEmailInput().sendKeys(FileOperation.getProperties("user2").getProperty("email"));
		loginPage.getRegisterNameInput().sendKeys(FileOperation.getProperties("user2").getProperty("nome"));
		loginPage.getRegisterPasswordInput().sendKeys(FileOperation.getProperties("user2").getProperty("senha"));
		loginPage.getRegisterPasswordConfirmationInput().sendKeys(FileOperation.getProperties("user2").getProperty("senha"));
		loginPage.getSaldoIniciaSpan().click();
		loginPage.getRegisterCadastrarButton().click();
		genericValidation.validationRegister();
		loginPage.getCloseMensagemButton().click();
		genericValidation.validationLoginPage();
		
		
	}
	
	@SuppressWarnings("deprecation")
	public void logarConta1(){
		
		loginPage.getLoginEmailInput().sendKeys(FileOperation.getProperties("user1").getProperty("email"));
		loginPage.getLoginSenhaInput().sendKeys(FileOperation.getProperties("user1").getProperty("senha"));
		loginPage.getLoginButton().click();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		genericValidation.validationPageHome();
		genericValidation.setNumeroConta1();
		
		
	}
	
	public void logarConta2() {
		
		loginPage.getLoginEmailInput().sendKeys(FileOperation.getProperties("user2").getProperty("email"));
		loginPage.getLoginSenhaInput().sendKeys(FileOperation.getProperties("user2").getProperty("senha"));
		loginPage.getLoginButton().click();
		genericValidation.validationPageHome();
		genericValidation.setNumeroConta2();
		
		
	}
	public void voltarLogin() {
		
		contaPage.getExitButton().click();
		genericValidation.validationLoginPage();
		
	}
	

}
