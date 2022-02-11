import cucumber.api.java.Before;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.awt.*;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestePrint {

    Print print = new Print();


@Before
    public void inicializar(){

    System.setProperty("webdriver.chrome.driver","C:\\dev\\tools\\drivers");
    WebDriver driver = new ChromeDriver();

}

@Test
    public void entrar() throws AWTException, InterruptedException, FileNotFoundException,IOException {
    WebDriver driver = new ChromeDriver();
    Thread.sleep(3000);
    driver.manage().window().maximize();
    driver.get("https://www.olx.com.br/");
    Thread.sleep(3000);
    driver.findElement(By.xpath("//*[@id=\"gatsby-focus-wrapper\"]/div[3]/div[1]/div/div[2]/div/div/ul/li[1]/a/span")).click();
    Thread.sleep(3000);

    print.printtela();

    driver.close();



}


}
