package org.animals.java;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//      nel programma istanziare alcuni animali e utilizzare i metodi implementati.

        // chiedere all'utente quale animale vuole visualizzare creare l'oggetto mostrarne le specifiche
        //tutto viene fatto in un ciclo while e l'utente puo uscire premendo q
        Scanner scan = new Scanner(System.in);
        boolean end = false;
        while (!end){
            System.out.println("Di quale animale vuoi vedere le specifiche? " +
                    "A-Aquila, C-Cane, D-Delfino, P-Passerotto oppure Q-esci");
            String option = scan.nextLine();

            switch (option.toUpperCase()) {
                case "A":
                    //aquila
                    Aquila aquila = new Aquila();
                    System.out.println(aquila.mangia());
                    System.out.println(aquila.verso());
                    System.out.println(aquila.dormi());
                    break;
                case "C":
                    //cane
                    Cane cane = new Cane();
                    System.out.println(cane.mangia());
                    System.out.println(cane.verso());
                    System.out.println(cane.dormi());
                    break;
                case "D":
                    //delfino
                    Delfino delfino = new Delfino();
                    System.out.println(delfino.mangia());
                    System.out.println(delfino.verso());
                    System.out.println(delfino.dormi());
                    break;
                case "P":
                    //passerotto
                    Passerotto passerotto = new Passerotto();
                    System.out.println(passerotto.mangia());
                    System.out.println(passerotto.verso());
                    System.out.println(passerotto.dormi());
                    break;
                case "Q":
                    //uscita dal programma
                    System.out.println("Fine...");
                    end = true;
                    break;
                default:
                    System.out.println("Opzione errata! Riprova...");
            }
        }
    }
}
