package org.example;


import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit test for simple App.
 */
public class AppTest
{
    /**
     * Rigorous Test :-)
     */

    App app;

    @BeforeEach
    void initialise() {
        app = new App();
    }

    @AfterEach
    void postExecution() {

    }


    @BeforeAll
    static void setUpBeforeAll() {
        System.out.println("@BeforeAll executes before exection of all test case");
    }



    @AfterAll
    static void setUpAfterAll() {
        System.out.println("@AfterAll executes after exection of all test case");
    }
}
