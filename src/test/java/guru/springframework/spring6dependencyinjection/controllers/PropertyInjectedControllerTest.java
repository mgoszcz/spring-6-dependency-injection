package guru.springframework.spring6dependencyinjection.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PropertyInjectedControllerTest {

    @Autowired
    PropertyInjectedController propertyInjectedController;

    @Test
    void asyHello() {
        System.out.println(propertyInjectedController.sayHello());
    }
}