package com.urls.encurtadorUrlApi.util;

import java.util.Random;


public class Randomizador {
    
    private static final String CAIXA_ALTA = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String CAIXA_BAIXA = CAIXA_ALTA.toLowerCase();
    private static final String NUMEROS = "1234567890";
    
    //Definições de mínimo e máximo de caracteres para o randomizador de url's
    private static final int MIN_CARACTERES = 5;
    private static final int MAX_CARACTERES = 10;
    
    public static int randomInt(int min, int max){ //Devolve um inteiro aleatório entre `min` e `max`
        return (int) ((Math.random() * (max - min)) + min);
    }

    //Entrega uma palavra qualquer com letras e números, cujo tamanho varia, entre `min`e `max` caracteres
    public static String randomStr(){
        int numeroCaracteres = randomInt(MIN_CARACTERES, MAX_CARACTERES);
        String charsAleatorios = "";

        //Define, de forma variada, se o próximo caractere é caixa baixa, caixa alta ou número
        for(int i=0; i<numeroCaracteres; i++){
            int randomTipoChar = randomInt(0,3);
            
            switch(randomTipoChar){
                case 0:
                    charsAleatorios += CAIXA_ALTA.charAt(randomInt(0, CAIXA_ALTA.length() - 1));
                    break;
                case 1:
                    charsAleatorios += CAIXA_BAIXA.charAt(randomInt(0, CAIXA_BAIXA.length() - 1));
                    break;
                default:
                    charsAleatorios += NUMEROS.charAt(randomInt(0, NUMEROS.length() - 1));
                    break;
            }            
        }
        
        return charsAleatorios;
    }
    
}
