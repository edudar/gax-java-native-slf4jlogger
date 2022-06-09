package io.github.edudar.gax;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SampleApplication {

    private final static Logger LOGGER = LoggerFactory.getLogger(SampleApplication.class);

    public static void main(String[] args) {
        System.out.println("Success!");
        LOGGER.info("SLF4J Success!");
    }
}
