import Utils.Browsers;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.sql.rowset.BaseRowSet;

public class Aula3Test {

    private WebDriver driver;
    @Test
    public void aula3(){
        // Abre o navegador chrome
        driver = Browsers.cromeDriver();

        driver.get("https://www.lojasrenner.com.br/");
        driver.manage().window().maximize();

        driver.findElement(By.className("checkbox")).click();

        driver.findElement(By.id("searchField")).sendKeys("camiseta" , Keys.ENTER);

        try{
            Thread.sleep(3000);
        } catch (Exception e){
            e.printStackTrace();
        }

        driver.findElement(By.xpath("//h4[text()='Camiseta Espotiva com Estampa']")).click();

        new WebDriverWait(driver , 10)
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='COR551576479-623']/parent::label")))
                .click();

        WebElement element = new WebDriverWait(driver , 10)
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='P']")));
        new Actions(driver).moveToElement(element).click().build().perform();

        String valor = driver.findElement(By.className("best_price")).getText();
        Assert.assertEquals("R$ 39,90" , valor);
    }
}
