package Steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import Pages.LoginPage;
import Utils.seleniumUtils;
import cucumber.api.DataTable;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class LoginSteps extends seleniumUtils{

	@Dado ("que estou na tela de login")
	public void acessaTelaEmail() {
		LoginPage loginpage = new LoginPage();
		loginpage.acessaPaginaDoEmail();
	}
	
	@Quando ("informar usuario e senha validos")
    public void informaDadosLogin(DataTable credenciais) {
		System.out.println("Inserindo usuario e senha validos.");
		List<Map<String,String>> data = credenciais.asMaps(String.class,String.class);
		LoginPage loginpage = new LoginPage();
		loginpage.realizaLogin(data.get(0).get("usuario"),data.get(0).get("senha"));
	}
	@E ("clico em login")
    public void clicaEmLogin(){
		System.out.println("Clicando no botão Login.");
		LoginPage loginpage = new LoginPage();
		loginpage.clicaNoBotaoLogin();
	}
	@Entao ("a tela home do sistema deve aparecer")
	public void validaAcessoAoEmail() throws InterruptedException {
		System.out.println("Validando se e-mail foi acessado com sucesso!");
		LoginPage loginpage = new LoginPage();
		Assert.assertTrue("Opa! Houve algum problema pois parece que o e-mail nao foi acessado com sucesso", loginpage.verficaAcessoComSucesso());
	}
}
