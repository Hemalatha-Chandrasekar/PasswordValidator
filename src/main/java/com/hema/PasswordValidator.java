package com.hema;

public class PasswordValidator {

    public static boolean isValidPassword(String password) {
        return password.length() >= 8;
    }
}

