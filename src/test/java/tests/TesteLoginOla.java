package tests;

import configuration.Config;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import repositorio.Repositorio;


public class TesteLoginOla extends Repositorio {

    private WebDriver driver;
    private Config configuracao = new Config();



    @Before
    public void setUp(){
       driver = configuracao.acessaUrl();
    }

    @Test
    public void fazerLoginComEmail(){
        driver.findElement(botaoDeLogin).click();
    }

}
