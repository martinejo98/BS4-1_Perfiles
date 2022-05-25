package com.example.Ejercicio8_BS4_Perfiles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@ConfigurationProperties
@RestController
public class Controlador {


    @Autowired
    Configuracion configuracion;

    @Value("${URL}")
    String url;

    @Value("${PASSWORD}")
    String password;

    @GetMapping("/parametros")
    public String devolverValores(){
        return "URL: "+url+", password: "+password;
    }

    @GetMapping("/miconfiguracion")
    public String getMiConfiguracion(){
        return "valor 1: "+configuracion.getValor1()+", valor 2: "+configuracion.getValor2();
    }


}
