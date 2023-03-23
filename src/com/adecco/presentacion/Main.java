package com.adecco.presentacion;

import com.adecco.modelo.Saludo;

public class Main {
    //poniendo main me aparece automaticamente la línea 7.
    public static void main(String[] args) {
        //Crear objeto
        Saludo s1 = new Saludo();
        s1.setMensajeSaludo("Bienvenida al curso desde modificar el método Saludar");
        System.out.println(s1.saludar());

        s1.setMensajeSaludo("Bienvenida al curso desde setter y getter");
        System.out.println("Saludo: "+s1.getMensajeSaludo());

        s1.setNombre("Vanessa");
        System.out.println(s1.getMensajeSaludo()+", "+s1.getNombre());

    }
}