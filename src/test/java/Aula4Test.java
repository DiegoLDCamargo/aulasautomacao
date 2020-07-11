<<<<<<< HEAD

import HomePO.HomePO;
=======
import org.apache.logging.log4j.Level;
>>>>>>> origin/camargo
import org.junit.Test;
import support.TestBase;

public class Aula4Test extends TestBase {

    @Test
    public void aula4(){
        HomePO homePO = new HomePO(driver);
        homePO.aceitarTermos();
<<<<<<< HEAD

        logger.debug("camargo aceitou os termos");
=======
        logger.log(Level.DEBUG,"Teste");

>>>>>>> origin/camargo
    }
}
