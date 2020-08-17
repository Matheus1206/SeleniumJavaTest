package tests;

import configuration.Config;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;


public class TesteDolar extends Config {

    private WebDriver driver;

    @Before
    public void setUp(){
       driver = acessaUrl("youtube");
    }

    @Test
    public void teste(){
        System.out.println("PASSOU");

    }

}
