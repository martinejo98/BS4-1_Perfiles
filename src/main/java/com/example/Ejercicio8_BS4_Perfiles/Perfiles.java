package com.example.Ejercicio8_BS4_Perfiles;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@Component
public interface Perfiles {

    @GetMapping("/perfil")  //Hacemos el getmapping aqui porque en el postman llamara a esta intercace y cogerá el perfil activo
    public void miFuncion();
}
