package configuration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Config {

    private WebDriver driver;
    private final String URL = "olapodcasts";

    public WebDriver iniciaDriver(){
        String soNome = System.getProperty("os.name");
        if(soNome.startsWith("W")){
            System.setProperty("webdriver.chrome.driver","drivers/windows.exe");
            driver = new ChromeDriver();
        }else if(soNome.startsWith("M")){
            System.setProperty("webdriver.chrome.driver","drivers/mac");
            driver = new ChromeDriver();
        } else if(soNome.startsWith("U") || soNome.startsWith("L")) {
            System.setProperty("webdriver.chrome.driver", "drivers/linux");
            driver = new ChromeDriver();
        }
        return driver;
    }

    public WebDriver acessaUrl(){
        WebDriver driver = iniciaDriver();
        driver.get("https://"+URL+".com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        return driver;
    }



}
