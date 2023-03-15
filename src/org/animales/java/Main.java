package org.animales.java;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // chiedere all'utente quale animale vuole visualizzare creare l'oggetto mostrarne le specifiche
        //tutto viene fatto in un ciclo while e l'utente puo uscire premendo q
        Scanner scan = new Scanner(System.in);
        boolean end = false;
        while (!end){
            System.out.println("Di quale animale vuoi vedere le specifiche? " +
                    "A-Aquila, C-Cane, D-Delfino, P-Passerotto");
            String option = scan.nextLine();

            switch (option.toUpperCase()) {
                case "A":
                    //aquila
                    break;
                case "C":
                    //cane
                case "D":
                    //delfino
                    break;
                case "P":
                    //passerotto
                    break;
                case "Q":
                    //uscita dal programma
                    break;
                default:
                    System.out.println("Opzione errata!");
            }
        }
    }
}
