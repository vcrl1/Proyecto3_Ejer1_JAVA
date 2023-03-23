package com.adecco.presentacion;

import com.adecco.modelo.Saludo;

public class Main {
    //poniendo main me aparece automaticamente la línea 7.
    public static void main(String[] args) {
        //Crear objeto
        Saludo s1 = new Saludo();
        System.out.println(s1.saludar());

        s1.setSaludo("Bienvenida al curso");
        System.out.println("Saludo: "+s1.getSaludo());
        s1.setNombre("Vanessa");
        System.out.println(s1.getSaludo()+" "+s1.getNombre());

    }
}