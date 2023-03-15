package org.animals.java;
//Esercizio 1 : classi astratte

//Una volta create le classi, nel programma istanziare alcuni animali e utilizzare i metodi implementati.
public abstract class Animale {

    public void dormi() {
        System.out.println("Zzzzzz");
    }

    public abstract void verso();

    public abstract void mangia();
}