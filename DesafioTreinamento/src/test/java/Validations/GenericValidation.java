package Validations;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.Status;

import Framework.Browser.Waits;
import Framework.Report.Report;
import Framework.Report.Screenshot;
import PageObjects.GenericPage;

public class GenericValidation {
	
	
	private WebDriver driver;
	private Waits wait;
	private GenericPage genericPage;
	public String numeroConta1;
	public String digitoConta1;
	public String numeroConta2;
	public String digitoConta2;
	
 
	
	public GenericValidation(WebDriver driver) {
		
		this.driver = driver;
		genericPage = new GenericPage(this.driver);
		wait = new Waits(this.driver);
		
		
	}
	
	public void validationPageHome() {
		
		try {
			wait.loadElement(genericPage.getHomeValidation());
			String label = genericPage.getHomeValidation().getText();
			Assertions.assertEquals("Obrigado por escolher o nosso banco", label);
			Report.log(Status.PASS, "Validou Homepage", Screenshot.captureBase64(driver));
		}catch(Exception e) {
			
			Report.log(Status.FAIL, e.getMessage(), Screenshot.captureBase64(driver));
		}
}
	
	
	public void validationRegister() {
		
		try {
		
			wait.loadElement(genericPage.getRegisterConfirm());
			String label = genericPage.getRegisterConfirm().getText();
			Assertions.assertEquals("Fechar", label);
			Report.log(Status.PASS, "Registrou", Screenshot.captureBase64(driver));
		
		}catch(Exception e) {
		
			Report.log(Status.FAIL, e.getMessage(), Screenshot.captureBase64(driver));
		}
}
	
	public void validationExtratoDepoisTransferiu() {
		
		try {
		
			wait.loadElement(genericPage.getSaldoDisponivelAposTransf());
			String label = genericPage.getSaldoDisponivelAposTransf().getText();
			Assertions.assertEquals("R$ 500,00", label);
			Report.log(Status.PASS, "Extrato Correto", Screenshot.captureBase64(driver));
		
		}catch(Exception e) {
		
			Report.log(Status.FAIL, e.getMessage(), Screenshot.captureBase64(driver));
		}
}
	
	public void validationExtratoDepoisRecebeu() {
		
		try {
		
			wait.loadElement(genericPage.getSaldoDisponivelAposTransf());
			String label = genericPage.getSaldoDisponivelAposTransf().getText();
			Assertions.assertEquals("R$ 1.500,00", label);
			Report.log(Status.PASS, "Extrato Correto", Screenshot.captureBase64(driver));
		
		}catch(Exception e) {
		
			Report.log(Status.FAIL, e.getMessage(), Screenshot.captureBase64(driver));
		}
}
	
	public void validationExtratoAntes() {
		
		try {
		
			wait.loadElement(genericPage.getExtratoValidation());
			String label = genericPage.getExtratoValidation().getText();
			Assertions.assertEquals("Saldo disponível", label);
			Report.log(Status.PASS, "Entrou no Extrato", Screenshot.captureBase64(driver));
		
		}catch(Exception e) {
		
			Report.log(Status.FAIL, e.getMessage(), Screenshot.captureBase64(driver));
		}
}
	
	public void validationLoginPage() {
		
		try {
			
			wait.loadElement(genericPage.getLoginPageConfirm());
			String label = genericPage.getLoginPageConfirm().getText();
			Assertions.assertEquals("E-mail", label);
			Report.log(Status.PASS, "Voltou Para o Login", Screenshot.captureBase64(driver));
		
		}catch(Exception e) {
		
			Report.log(Status.FAIL, e.getMessage(), Screenshot.captureBase64(driver));
		}
		
	}

	
	public void validationTransferPage() {
		
		try {
			
			wait.loadElement(genericPage.getTransferenciaPageValidation());
			String label = genericPage.getTransferenciaPageValidation().getText();
			Assertions.assertEquals("Transferir agora", label);
			Report.log(Status.PASS, "Entrou na pagina de transferencia", Screenshot.captureBase64(driver));
		
		}catch(Exception e) {
		
			Report.log(Status.FAIL, e.getMessage(), Screenshot.captureBase64(driver));
		}
		
	}
	
	public void validationTransfer() {
		
		try {
			
			wait.loadElement(genericPage.getTransferenciaValidation());
			String label = genericPage.getTransferenciaValidation().getText();
			Assertions.assertEquals("Transferencia realizada com sucesso", label);
			Report.log(Status.PASS, "Transferiu", Screenshot.captureBase64(driver));
		
		}catch(Exception e) {
		
			Report.log(Status.FAIL, e.getMessage(), Screenshot.captureBase64(driver));
		}
		
	}
	
	public void setNumeroConta1(){
		Properties prop = new Properties();
		FileOutputStream output = null;
		try {
			output = new FileOutputStream("user1.properties");
			wait.loadElement(genericPage.getNumeroeDigitoconta());
			String conta = genericPage.getNumeroeDigitoconta().getText();
			String[] accountNumberParts = conta.split("-");
			this.numeroConta1 = accountNumberParts[0];
			this.digitoConta1 = accountNumberParts[1];
			prop.setProperty("numero", numeroConta1);
            prop.setProperty("digito", digitoConta1);
            prop.store(output, null);
			Report.log(Status.PASS, "Pegou o numero 1", Screenshot.captureBase64(driver));
		
		}catch(Exception e) {
		
			Report.log(Status.FAIL, e.getMessage(), Screenshot.captureBase64(driver));
		}finally{
            if (output != null) {
                try {
                    output.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
		
		
	}
	
	public void setNumeroConta2(){
		Properties prop = new Properties();
		FileOutputStream output = null;
		try {
			output = new FileOutputStream("user2.properties");
			wait.loadElement(genericPage.getNumeroeDigitoconta());
			String conta = genericPage.getNumeroeDigitoconta().getText();
			String[] accountNumberParts = conta.split("-");
			this.numeroConta2 = accountNumberParts[0];
			this.digitoConta2 = accountNumberParts[1];
			prop.setProperty("numero", numeroConta2);
            prop.setProperty("digito", digitoConta2);
            prop.store(output, null);
			Report.log(Status.PASS, "Pegou o numero 2", Screenshot.captureBase64(driver));
		
		}catch(Exception e) {
		
			Report.log(Status.FAIL, e.getMessage(), Screenshot.captureBase64(driver));
		}finally{
            if (output != null) {
                try {
                    output.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
		
		
	}

}