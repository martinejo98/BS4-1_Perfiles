package com.example.Ejercicio8_BS4_Perfiles;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
@Configuration
@PropertySource("classpath:miconfiguracion.properties")
public class Configuracion {

    @Value("${VALOR1}")
    String valor1;

    @Value("${VALOR2}")
    String valor2;

    public void getVariables(){
        System.out.println("valor 1: "+valor1+", valor 2: "+valor2);
    }

    public String getValor1(){
        return valor1;
    }

    public String getValor2(){
        return valor2;
    }
}
