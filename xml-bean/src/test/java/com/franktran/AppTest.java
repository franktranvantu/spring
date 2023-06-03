package com.franktran;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class AppTest {
    private App app = new App();
    @Test
    public void given_when_thenDoesNotThrowException() {
        Assertions.assertDoesNotThrow(() -> app.getGreetingService("helloService"));
    }

    @Test
    public void given_when_thenThrowsException() {
        assertThrows(NoSuchBeanDefinitionException.class, () -> app.getGreetingService("hiService"));
    }
}
