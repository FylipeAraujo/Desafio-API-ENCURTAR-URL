
package com.urls.encurtadorUrlApi.util;


public class EditorTexto {
    
    public static String editaOutputTeste(int numeroTeste, String nomeTeste, String texto, String valorRetorno){ //Exibe o output de testes formatado
        return "\n\n-----------------------------------------------------------------------------------------------------------------------------------"
                + "-------------------------------------------\n" 
                + "Teste #" + numeroTeste + ": " + nomeTeste + " --> " +  texto + " " + valorRetorno +
               "\n-------------------------------------------------------------------------------------------------------------------------------------"
                + "-----------------------------------------\n\n";
    }
    
}
