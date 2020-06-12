package support;

import Utils.Browsers;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

public class TestBase {

    public WebDriver driver;

    @Before
    public void setup(){
        // Abre o navegador chrome
        driver = Browsers.cromeDriver();
        driver.get("https://www.lojasrenner.com.br/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @After
    public void teardown(){
        driver.quit();
    }
}
