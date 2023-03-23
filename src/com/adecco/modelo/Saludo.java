package com.adecco.modelo;

public class Saludo {
    //Atributos
    private String mensajeSaludo;
    private String nombre;

    //método
//    public String saludar(){
//        return "Bienvenida al curso desde metodo saludar";
//    }

    public String saludar(){
        return mensajeSaludo;
    }
    //setters y getters


    public String getMensajeSaludo() {
        return mensajeSaludo;
    }

    public void setMensajeSaludo(String mensajeSaludo) {
        this.mensajeSaludo = mensajeSaludo;
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public String getNombre(){
        return nombre;
    }

}
