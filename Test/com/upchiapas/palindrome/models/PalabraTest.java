package com.upchiapas.palindrome.models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalabraTest {

    @Test
    public void test1() {
        Palabra ispalindrome = new Palabra("anona");

        boolean result = ispalindrome.isPalindrome();
        Assertions.assertEquals(false,result);
    }
}