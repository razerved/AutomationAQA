package tests;

import baseEntities.BaseTest;
import lombok.extern.slf4j.Slf4j;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

@Slf4j
public class LoggerTest extends BaseTest {
    Logger logger = LogManager.getLogger(LoggerTest.class);


    @Test
    public void loggerTest(){
        logger.trace("Trace message Trace");
        logger.debug("Trace message Debug");
        logger.info("Trace message Info");
        logger.warn("Trace message Warn");
        logger.error("Trace message Error");
        logger.fatal("Trace message Fatal");

        log.info("Lombok - log message info");
        log.error("Lombok - log message error");
        log.warn("Lombok - log message warn");
    }


}
