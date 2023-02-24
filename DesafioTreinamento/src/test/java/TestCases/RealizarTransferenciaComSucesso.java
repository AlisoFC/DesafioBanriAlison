package TestCases;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import Framework.TestBase;
import Framework.Report.Report;
import Framework.Report.ReportType;
import Framework.Report.Screenshot;
import Tasks.ExtratoPageTask;
import Tasks.RegisterLoginTask;
import Tasks.TransferenciaTask;

public class RealizarTransferenciaComSucesso extends TestBase {
	
	private WebDriver driver = this.getDriverManager();
	
	RegisterLoginTask registerLoginTask = new RegisterLoginTask(driver);
	TransferenciaTask transferenciaTask = new TransferenciaTask(driver);
	ExtratoPageTask extratoPageTask = new ExtratoPageTask(driver);
	
	
	@Test
	@Tag("positivo")
	public void realizarTransferencia() {
			
			try {
			
				Report.createTest("Realizar Compra com Sucesso", ReportType.GROUP);
				Report.createStep("Criar Conta 1");
				registerLoginTask.criarConta1();
				Report.createStep("Realizar Login conta 1");
				registerLoginTask.logarConta1();
				registerLoginTask.voltarLogin();
				Report.createStep("Criar Conta 2");
				registerLoginTask.criarConta2();
				Report.createStep("Realizar Login conta 2");
				registerLoginTask.logarConta2();
				registerLoginTask.voltarLogin();
				Report.createStep("Realizar Login conta 1 again");
				registerLoginTask.logarConta1();
				Report.createStep("Transferir conta 1 para conta 2");
				transferenciaTask.realizarTransferenciaUser1paraUser2();
				Report.createStep("Ver extrato conta 1");
				extratoPageTask.verExtratoSair();
				Report.createStep("Ver extrato conta 2");
				registerLoginTask.logarConta2();
				extratoPageTask.verExtratoSairConta2();			
				
				
				
			
			}catch(Exception e) {
				
				Report.log(Status.FAIL, e.getMessage(), Screenshot.capture(driver));
			}
		}

}
