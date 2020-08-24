package repositorio;

import org.openqa.selenium.By;

public class Repositorio {

    public final By botaoDeLogin = By.xpath("//div[@class='sc-EHOje gHGPJy']//a[@href = '/signin']");
    public final By textoLogin = By.xpath("/html/body/div[1]/header/section[1]/div[1]/div[2]/input[1]");
    public final By textoSenha = By.xpath("/html/body/div[1]/header/section[1]/div[1]/div[2]/input[2]");
    public final By botaoEntrar = By.xpath("/html/body/div[1]/header/section[1]/div[1]/div[2]/button");
    public final By mensagemLogin = By.xpath("//div[@class='toast']");

}
