package org.animals.java;
//Esercizio 1 : classi astratte

//Una volta create le classi, nel programma istanziare alcuni animali e utilizzare i metodi implementati.
public abstract class Animale {

    public String dormi(){
        return "Zzzzzz";
    }

    public abstract String verso();

    public abstract String mangia();

}
