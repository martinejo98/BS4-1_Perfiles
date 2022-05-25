package com.example.Ejercicio8_BS4_Perfiles;

import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Profile("perfil1") //le establezco el perfil1
public class perfil1 implements Perfiles{

    String perfil = "perfil1";
    @Override
    public void miFuncion() {
        System.out.println(perfil);
    }
}
