package support;

import Utils.Browsers;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class TestBase {

    public WebDriver driver;
    public Logger logger = Logger.getLogger(TestBase.class);

    @Before
    public void setup(){
        PropertyConfigurator.configure("log4j.properties");

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
