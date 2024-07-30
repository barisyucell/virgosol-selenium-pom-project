package utilities;

import utilities.logger.Log;
import static org.junit.jupiter.api.Assertions.*;

public class BrowserUtils {

    static Log log = new Log();

    public static void sleep(int second) {
        second *= 1000;
        log.info("Statik bekleme kullanıldı!");
        try {
            Thread.sleep(second);
        } catch (InterruptedException e) {
            log.info("Statik beklemede problem oldu!");
        }
    }

    public static void verifyTitle(String expectedTitle) {
        sleep(2);
        assertEquals(expectedTitle, Driver.getDriver().getTitle());
    }

    public static void containsUrl(String str) {
        sleep(2);
        assertTrue(Driver.getDriver().getCurrentUrl().contains(str));
    }

}