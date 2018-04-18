package Pages;

import org.openqa.selenium.support.PageFactory;

import Elements.LoginPageElements;
import Setup.TestRule;

public class LoginPage extends LoginPageElements{

	public LoginPage() {
		driver = TestRule.getDriver();
		PageFactory.initElements(TestRule.getDriver(), this);
	}

	public void acessaPaginaDoEmail() {
		System.out.println("acessando pagina do e-mail CWI");
		driver.navigate().to("Https://gmail.com");
	}

	public void realizaLogin(String user, String senha) {
		esperaElemento(CAMPO_SENHA);
		CAMPO_USUARIO.sendKeys(user);
		CAMPO_SENHA.sendKeys(senha);
	}
	
	public void clicaNoBotaoLogin(){
		BOTAO_LOGIN.click();
	}
	
	public Boolean verficaAcessoComSucesso() throws InterruptedException {
		esperaElemento(LABEL_NOVO_EMAIL);
		boolean acessou = false;
		if(LABEL_NOVO_EMAIL.isDisplayed()) {
			acessou = true;
		}
		return acessou;
	}
}
