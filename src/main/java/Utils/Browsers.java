package Utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browsers {

    public static WebDriver cromeDriver(){
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver();
    }
}
