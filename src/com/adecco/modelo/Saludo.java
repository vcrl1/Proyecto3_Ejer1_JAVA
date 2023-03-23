package com.adecco.modelo;

public class Saludo {
    //Atributos
    private String saludo;
    private String nombre;

    //método
    public String saludar(){
        return "Bienvenida al curso";
    }
    //setters y getters
    public String getSaludo() {
        return saludo;
    }

    public void setSaludo(String saludo) {
        this.saludo = saludo;
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public String getNombre(){
        return nombre;
    }

}
