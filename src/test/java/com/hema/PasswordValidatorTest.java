package com.hema;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordValidatorTest {
    @BeforeEach
    void setUp() {
        PasswordValidator validator = new PasswordValidator();
    }
    @Test
    void testValidPassword() {

       // PasswordValidator validator = new PasswordValidator();
        boolean password=PasswordValidator.isValidPassword("12345678");
        assertTrue(password);

       // assertTrue(PasswordValidator.isValidPassword("12345678"));
    }

    @Test
    void shortPassword() {
        //PasswordValidator validator = new PasswordValidator();
        boolean password=PasswordValidator.isValidPassword("12345");
        assertTrue(password);
        //assertTrue(PasswordValidator.isValidPassword("12345"));
    }
}