package com.practice;

import org.junit.jupiter.api.Test;

//import com.practice.App;
//import static org.junit.jupiter.api.Assertions.assertTrue;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    @Test
    public void testGreeting() {
        App myApp = new App();
        // 驗證 getGreeting() 回傳的是否為 "Hello World"
        assertEquals("Hello Java", myApp.getGreeting());
    }

    /*
    @Test
    public void shouldAnswerWithTrue() {
        //assertTrue(true); // 這一定會過
        // 驗證 getGreeting() 回傳的是否為 "Hello World"
    }
    */

}

