package tests;

import configuration.Config;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import repositorio.Repositorio;

public class LoginOlaTest extends Repositorio {

    private WebDriver driver;
    private Config configuracao = new Config();

    @Dado("que o usuário acesse o site do OLA e acesse o popup de login")
    public void queOUsuárioAcesseOSiteDoOLAEAcesseOPopupDeLogin() {
        driver = configuracao.acessaUrlDoOla();
        driver.findElement(botaoDeLogin).click();
    }

    @Dado("que realizei o login com usuario {string} e {string}")
    public void queRealizeiOLoginComUsuarioE(String usuario, String senha) {
        driver.findElement(textoLogin).sendKeys(usuario);
        driver.findElement(textoSenha).sendKeys(senha);
        driver.findElement(botaoEntrar).click();

    }

    @Então("o site deverá apresentar a mensagem {string}")
    public void oSiteDeveráApresentarAMensagem(String mensagem) {
        String validacao =  driver.findElement(mensagemLogin).getText();
        Assert.assertEquals(validacao,mensagem);
    }
}
