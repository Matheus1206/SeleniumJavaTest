package tests;

import configuration.Config;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import repositorio.Repositorio;

public class LoginOlaTest extends Repositorio {

    private WebDriver driver;
    private Config configuracao = new Config();

    @Before
    public void setUp(){
        driver = configuracao.acessaUrlDoOla();
    }

    @And("clico no botao de Login")
    public void clicoNoBotaoDeLogin() {
        driver.findElement(botaoDeLogin).click();
    }

    @After
    public void tearDown(){
        driver.quit();
    }
}
