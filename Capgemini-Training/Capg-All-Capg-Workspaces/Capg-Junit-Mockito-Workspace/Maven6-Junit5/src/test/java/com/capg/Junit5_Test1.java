package com.capg;

import static org.junit.jupiter.api.Assertions.assertTimeout;

import java.time.Duration;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

public class Junit5_Test1 {

    @Test
    void timeOutTest() {

        Executable executable = () -> {
            Thread.sleep(500);
        };

        assertTimeout(Duration.ofMillis(1000), executable);
    }
}