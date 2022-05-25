package com.example.Ejercicio8_BS4_Perfiles;

import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Profile("perfil2") //le establezco el perfil2
public class perfil2 implements Perfiles{

    String perfil = "perfil2";

    @Override
    public void miFuncion() {
        System.out.println(perfil);
    }
}
