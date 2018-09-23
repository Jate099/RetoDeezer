package com.example.quizuno.retodeezer;

public class Cancion {
    String artista;
    String name;

    public Cancion(String name, String artista) {
        this.name = name;
        this.artista = artista;
    }

    public String getArtista() {
        return artista;
    }

    public String getName() {
        return name;
    }
}
