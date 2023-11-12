package org.example;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ClientAPI {

    private static final Logger LOGGER = LoggerFactory.getLogger(ClientAPI.class);

    public static void main(String[] args) {

        SpringApplication.run(ClientAPI.class, args);

        LOGGER.trace("for tracing purpose");
        LOGGER.debug("for debugging purpose");
        LOGGER.info("for informational purpose");
        LOGGER.warn("for warning purpose");
        LOGGER.error("for logging errors");
    }

}