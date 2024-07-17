package com.upchiapas.palindrome.models;

import java.util.Stack;
public class Palabra {
    private String palabra;
    public static boolean estado;


    public Palabra(String palabra) {
        this.palabra = palabra;
    }

    public boolean isPalindrome(){
        Stack <Character> pila = new Stack<Character>();
        for(int i = 0; i < palabra.length(); i++ )
        {
            //charAt regresar el caracter que esta en el indice que le pasemos
            pila.push(palabra.charAt(i)); //push inserta a la pila

            String auxPila = "";
            //Mientras la pila no este vacia ejecuta:
            while(!pila.isEmpty()){
                auxPila += pila.pop(); //Pop saca a la pila
            }
            if(auxPila.equals(palabra))//compara el contenido de la variable auxPila con el contenido de la variable palabra
            {
                estado = true;
            }
            else {
                estado = false;
            }
        }
        return estado;
    }
}
