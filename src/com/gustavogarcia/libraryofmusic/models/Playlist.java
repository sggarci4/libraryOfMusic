package com.gustavogarcia.libraryofmusic.models;

import com.gustavogarcia.libraryofmusic.calculations.CalculatorOfTime;

import java.util.ArrayList;

public class Playlist extends Product {
    private int countSongs = 0;
    private String test;
    private int totalTime = 0;
    private String textTotalTime;
private ArrayList<Song> songs = new ArrayList<>();
    // Constructor
//    public Playlist() {
//        songs = new ArrayList<>(); // Inicializar la lista en el constructor
//    }
    public String calculateTimeTotal(){
        int test = songs.size();
        for (Song song : songs){
            totalTime += (int) song.getLength();
        }
        int min;
        if (this.totalTime >= 60){
            min = this.totalTime % 60;
            this.totalTime = this.totalTime / 60;
            return textTotalTime = " - " + this.totalTime + " hours, " + min + " minutes";

        }else {
            return textTotalTime = " - " + this.totalTime + " minutes";
        }

    }
    // Método para agregar una canción a la lista de reproducción
    public void addSong(String title, String artist,double length, int totalPlays, int likes) {
        Song song = new Song(title, artist, length, totalPlays, likes); // Crear un objeto Song
        songs.add(song); // Agregar el objeto a la lista
        countSongs++;
        this.setTotalAudios(countSongs);
        CalculatorOfTime calculator = new CalculatorOfTime();
        calculator.sumOfTimesAudiosProduct(song);
        test = calculator.getTextTotalTime();

    }

    // Método para imprimir las canciones en la lista de reproducción
    public void printSongs() {
        System.out.println("Lista de reproducción:" + test);
        for (Song song : songs) {
            System.out.println("Título: " + song.getTitle() + ", Artista: " + song.getArtist() + ", Duracion: " + song.getLength() + " min, Reproducciones totales: " + song.getTotalPlays() + ", Likes: " + song.getLikes());
        }
    }
}

