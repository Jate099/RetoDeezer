package com.example.quizuno.retodeezer;

public class Lista {
    private String nombre;
    private String creador;
    private String elementos;

    public Lista(String nombre, String creador, String elementos) {
        this.nombre = nombre;
        this.creador = creador;
        this.elementos = elementos;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCreador() {
        return creador;
    }

    public String getElementos() {
        return elementos;
    }
}
