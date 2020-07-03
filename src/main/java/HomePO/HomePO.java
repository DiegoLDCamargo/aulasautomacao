package HomePO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePO {
    private WebDriver driver;

    public HomePO(WebDriver home){
        driver = home;
    }

    public WebElement aceitarTermos(){
        return checkbox;
    }

    @FindBy(className = "checkbox")
    private WebElement checkbox;

}
