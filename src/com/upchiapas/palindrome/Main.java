package com.upchiapas.palindrome;

import com.upchiapas.palindrome.models.Palabra;

public class Main {
    public static void main(String[] args)
    {
        Palabra miPalabra = new Palabra("anona");
        if (miPalabra.isPalindrome())
        {
            System.out.println("es palindrome");
        }
        else {
            System.out.println("No es palindrome");
        }
    }
}