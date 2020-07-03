package support;

import Utils.Browsers;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class TestBase {

    public WebDriver driver;
    public Logger logger = LogManager.getLogger();


    @Before
    public void setup(){
        System.setProperty("log4j.configurationFile","log4j2-testConfig.xml");
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
