package tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import utilities.BrowserUtils;
import utilities.Driver;
import utilities.logger.Log;
import utilities.logger.TestResultLogger;

@ExtendWith(TestResultLogger.class)
public class BaseTest {

    static Log log = new Log();

    @BeforeEach
    public void beforeMethod() {
        log.info("before method");
    }

    @AfterEach
    public void killDriver() {
        BrowserUtils.sleep(2);
        Driver.closeDriver();
    }

}