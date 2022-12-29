package com.urls.encurtadorUrlApi;

import com.urls.encurtadorUrlApi.util.EditorTexto;
import com.urls.encurtadorUrlApi.util.Randomizador;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EncurtadorUrlApiApplicationTests {

	@Test
	void contextLoads() { 
            testeRandomizador();
	}
    //Função para testar o gerador de url aleatória
        void testeRandomizador(){
            String urlAleatoria = Randomizador.randomStr();
            if(urlAleatoria != null && urlAleatoria.length() >= 5 && urlAleatoria.length() <= 10)
                System.out.println(EditorTexto.editaOutputTeste(1, "Randomizador de URL", "O randomizador parece OK. O valor aleatório é: ", urlAleatoria));            
        }                

}
