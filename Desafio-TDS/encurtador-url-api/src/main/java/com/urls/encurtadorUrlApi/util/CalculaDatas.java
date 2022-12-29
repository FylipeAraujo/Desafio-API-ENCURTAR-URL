package com.urls.encurtadorUrlApi.util;

import java.util.Calendar;
import java.util.Date;


public class CalculaDatas {

    //Define os segundos de duração de uma URL
    private static final int SEGUNDOS_PARA_EXPIRAR_URL = 60;
    
    public static Date calculaDataHoraExpiracao(Date dataHoraCriacao){
        Calendar calendar1 = Calendar.getInstance();
        calendar1.setTime(dataHoraCriacao);
        calendar1.add(Calendar.SECOND, SEGUNDOS_PARA_EXPIRAR_URL);        
        
        return calendar1.getTime();
    }
    
}
