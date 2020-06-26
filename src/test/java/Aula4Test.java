import org.junit.Test;
import support.TestBase;

public class Aula4Test extends TestBase {

    @Test
    public void aula4(){
        HomePO homePO = new HomePO(driver);
        homePO.aceitarTermos();
        logger.debug("camargo aceitou os termos");
    }
}
