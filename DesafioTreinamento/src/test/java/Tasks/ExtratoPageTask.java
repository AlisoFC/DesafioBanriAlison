package Tasks;

import org.openqa.selenium.WebDriver;

import PageObjects.ContaPage;
import PageObjects.ExtratoPage;
import PageObjects.TransferPage;
import Validations.GenericValidation;

public class ExtratoPageTask {
	
	private WebDriver driver;
	private ExtratoPage extratoPage;
	private ContaPage contaPage;
	private GenericValidation genericValidation;
	
	public ExtratoPageTask(WebDriver driver) {
		
		this.driver = driver;
		extratoPage = new ExtratoPage(this.driver);
		contaPage = new ContaPage(this.driver);
		genericValidation = new GenericValidation(this.driver);
	}
	
	public void verExtrato() {
		
		contaPage.getExtratoButton().click();
		genericValidation.validationExtratoDepoisTransferiu();	
		extratoPage.getVoltarButton().click();
	
	}
	public void verExtratoSair() {
		
		contaPage.getExtratoButton().click();
		genericValidation.validationExtratoDepoisTransferiu();	
		extratoPage.getVoltarButton().click();
		genericValidation.validationPageHome();
		contaPage.getExitButton().click();	
		genericValidation.validationLoginPage();
	}
	
	public void verExtratoSairConta2() {
		
		contaPage.getExtratoButton().click();
		genericValidation.validationExtratoDepoisRecebeu();	
		extratoPage.getVoltarButton().click();
		genericValidation.validationPageHome();
		contaPage.getExitButton().click();	
		genericValidation.validationLoginPage();
	}
	
	

}
