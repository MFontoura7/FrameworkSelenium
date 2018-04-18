package Elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import Utils.seleniumUtils;

public class LoginPageElements extends seleniumUtils{

	public static WebDriver driver;

	@FindBy(how=How.CSS,using="[id='username']")
	 public WebElement CAMPO_USUARIO;
	 
	 @FindBy(how=How.CSS,using="[id='password']")
	 public WebElement CAMPO_SENHA;
	 
	 @FindBy(how=How.XPATH,using="//*[contains(text(),'Iniciar sessão')]")
	 public WebElement BOTAO_LOGIN;
	 
	 @FindBy(how=How.XPATH,using="//*[contains(text(),'Novo email')]")
	 public WebElement LABEL_NOVO_EMAIL;
}
