package com.gustavogarcia.libraryofmusic.models;

import java.util.Scanner;

public class Product {
    private String name;
    private String creator;
    private int totalAudios;
    private double sumOfTheRatings;
    private int totalOfTheRatings;
    private int typeProduct;

    public int getTypeProduct() {
        return typeProduct;
    }

    public void setTypeProduct(Product objectProduct) {
        if (objectProduct instanceof Playlist ){
            this.typeProduct = 1;

        } else if (objectProduct instanceof Album) {
            this.typeProduct = 2;
        } else if (objectProduct instanceof Podcast) {
           this.typeProduct = 3;
        }
    }

//    public void setTypeProductConsole(){
//        System.out.println("""
//                Put the number that you want to create:\s
//                1. - PLaylist.\s
//                2. - Album.
//                3. - Podcast.
//               """);
//        Scanner scanner = new Scanner(System.in);
//        typeProduct = scanner.nextInt();
//    }

    public void evaluate(double rating){
        sumOfTheRatings += rating;
        totalOfTheRatings++;
    }

    public double calculatesAverage() {
        return sumOfTheRatings / totalOfTheRatings;
    }

    public void calculateTotalAudios(Audio audio){
        totalAudios++;
    }

    public void showTechnicalSheet(){
        System.out.println(name);
        switch (typeProduct){
            case 1:
                System.out.printf("Playlist - ");
                break;
            case 2:
                System.out.printf("Album - ");
                break;
            case 3:
                System.out.printf("Podcast - ");
        }
        System.out.printf(creator + " - ");
        System.out.printf(totalAudios + " Songs - ");
        System.out.println();
        System.out.println("Rating: " + calculatesAverage() );
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public int getTotalAudios() {
        return totalAudios;
    }

    public void setTotalAudios(int totalAudios) {
        this.totalAudios = totalAudios;
    }

    public void share(){
        System.out.println("Link copied to clipboard");
    }
}
