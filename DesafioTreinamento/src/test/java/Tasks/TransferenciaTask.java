package Tasks;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

import Framework.Utils.FileOperation;
import PageObjects.ContaPage;
import PageObjects.GenericPage;
import PageObjects.TransferPage;
import Validations.GenericValidation;
import Framework.Utils.FileOperation;


public class TransferenciaTask {
	
	private WebDriver driver;
	private ContaPage contaPage;
	private TransferPage transferPage;
	private GenericValidation genericValidation;
	
	public TransferenciaTask(WebDriver driver) {
				
		this.driver = driver;
		contaPage = new ContaPage(this.driver);	
		transferPage = new TransferPage(this.driver);
		genericValidation = new GenericValidation(this.driver);
	}
	
	public void realizarTransferenciaUser1paraUser2() {
		Properties prop = new Properties();
		FileInputStream input = null;
		try {
			input = new FileInputStream("user2.properties");
			prop.load(input);
			String numero = prop.getProperty("numero");
            String digito = prop.getProperty("digito");
            
            contaPage.getTransferButton().click();
    		genericValidation.validationTransferPage();
    		transferPage.getNumerodaContaInput().sendKeys(numero);
    		transferPage.getDigitoInput().sendKeys(digito);
    		transferPage.getValorTransferenciaInput().sendKeys("500");
    		transferPage.getTransferirButton().click();
    		genericValidation.validationTransfer();
    		transferPage.getConfirmaButton().click();
    		transferPage.getVoltarButton().click();
    		genericValidation.validationPageHome();
    		
  
		  } catch (IOException io) {
	            io.printStackTrace();
	        } finally {
	            if (input != null) {
	                try {
	                    input.close();
	                } catch (IOException e) {
	                    e.printStackTrace();
	             }
	         }
	     }
	    
	}
	
	public void realizarTransferenciaUser2paraUser1() {
		Properties prop = new Properties();
		FileInputStream input = null;
		try {
			input = new FileInputStream("user1.properties");
			prop.load(input);
			String numero = prop.getProperty("numero");
            String digito = prop.getProperty("digito");
            
            contaPage.getTransferButton().click();
    		genericValidation.validationTransferPage();
    		transferPage.getNumerodaContaInput().sendKeys(numero);
    		transferPage.getDigitoInput().sendKeys(digito);
    		transferPage.getValorTransferenciaInput().sendKeys("500");
    		transferPage.getTransferirButton().click();
    		genericValidation.validationTransfer();
    		transferPage.getConfirmaButton().click();
    		transferPage.getVoltarButton().click();
    		genericValidation.validationLoginPage();
  
		  } catch (IOException io) {
	            io.printStackTrace();
	        } finally {
	            if (input != null) {
	                try {
	                    input.close();
	                } catch (IOException e) {
	                    e.printStackTrace();
	             }
	         }
	     }
	    
	}
	
}
