package org.example;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class Log4J2ConfigTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(Log4J2ConfigTest.class);

    @Test
    public void testLoggingLevels() {
        LOGGER.trace("Trace message is logged!");
        LOGGER.debug("Debug message is logged!");
        LOGGER.info("Info message is logged!");
        LOGGER.warn("Warning message is logged!");
        try {
            throw new RuntimeException("Unknown error");
        } catch (Exception e) {
            LOGGER.error("Error message is logged!", e);
        }
    }
}
