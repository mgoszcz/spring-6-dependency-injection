package guru.springframework.spring6dependencyinjection.controllers;

import guru.springframework.spring6dependencyinjection.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SetterInjectedControllerTest {

    SetterInjectedController setterInjectedController;

    @BeforeEach
    void setUp() {
        setterInjectedController = new SetterInjectedController();
        // Without this it will fail with NullPointerException
        setterInjectedController.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    void sayHello() {

        System.out.println(setterInjectedController.sayHello());
    }
}